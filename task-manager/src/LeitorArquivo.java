import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import Entities.Gender;
import Entities.Task;
import Entities.User;

public class LeitorArquivo {
    private String filename;

    public LeitorArquivo(String filename) {
        this.filename = filename;
    }

    void read() {
        try (BufferedReader br = new BufferedReader(new FileReader(this.filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                String name = values[0];

                char genderChar = values[1].charAt(0);
                Gender gender = new Gender(genderChar);
    
                Date birthday = null;
                try {
                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    birthday = dateFormat.parse(values[2]);
                } catch (ParseException e) {
                    e.printStackTrace();
                }

                User user = new User(name, gender, birthday);
    
                for (int i = 3; i < values.length; i++) {
                    String taskTitle = values[i];
                    String taskDescription = "";
                    Date taskCreatedAt = new Date();
    
                    Task task = new Task(taskTitle, taskDescription, taskCreatedAt);
                    user.getTasks().add(task);
                }
    
                System.out.println(user.getName());
                System.out.println(user.getGender());
                System.out.println(user.getBirthday());
                System.out.println(user.getTasks());
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
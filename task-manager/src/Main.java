import Entities.Gender;
import Entities.User;
import Panels.HomePanel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ArrayList<User> users = new ArrayList<>();

        String filePath = "src/teste_1.csv";
        LeitorArquivo leitor = new LeitorArquivo(filePath);
        leitor.read();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            for (int i = 1; i < 10; i++) {
                Date birthday = dateFormat.parse("20/08/2003");
                users.add(new User("User " + i, new Gender('F'), birthday));
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        users.forEach(user -> System.out.println(user.getName()));
        
        HomePanel h1 = new HomePanel("Home", users);
        h1.mostrar();
    }
}
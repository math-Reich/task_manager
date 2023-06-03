import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class LeitorArquivo {
    private String filename;

    public LeitorArquivo(String filename) {
        this.filename = filename;
    }

    void read() {
        try (BufferedReader br = new BufferedReader(new FileReader(this.filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}

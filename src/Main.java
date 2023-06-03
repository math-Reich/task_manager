import Entities.Gender;
import Entities.User;
import Panels.HomePanel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ArrayList<User> users = new ArrayList<>();
        for (int i = 1; i < 10;i++) {
            users.add(new User("User " + i, new Gender('F'), new Date("20/08/2003")));
        }
        users.forEach(user -> System.out.println(user.getName()));
        HomePanel h1 = new HomePanel("Home", users);
        h1.mostrar();
    }
}

package Panels;
import Entities.*;
import Entities.Window;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class HomePanel extends Window {
    public ArrayList<User> users;
    public HomePanel(String title, ArrayList<User> users) {
        super(title, 20);
        this.users = users;
    }
    public void mostrar() {
        frame = new JFrame(this.getTitle()); // cria um frame
        frame.add(this); // insere o território no frame
        frame.setSize(400, 300 + this.getHeight() ); // define as dimensões do frame
        frame.setVisible(true); // torna o frame visível
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // define como o frame é fechado
    }
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.black);
        g2d.setFont(new Font("Arial", Font.BOLD, 16));
        for(int i = 1; i < users.size(); i++) {
            g2d.drawString(users.get(i).getName(), 10*i, 20*i);
        }
    }
}

package Entities;

import javax.swing.*;

public abstract class Window extends JPanel {
    private String title;
    public JFrame frame;

    private final int height;

    public Window(String title, int height) {
        this.title = title;
        this.height = height;
    }

    @Override
    public int getHeight() {
        return height;
    }

    public String getTitle() {
        return title;
    }

    public abstract void mostrar();
}

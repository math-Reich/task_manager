import javax.swing.*;

abstract class Janela extends JPanel {
    private String titulo;

    public Janela(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public abstract void mostrar();
}

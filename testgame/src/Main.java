import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public Main(String title) throws HeadlessException {
        super(title);
    }



    public static void main(String[] args) {
        Main ekran = new Main("Uzay Oyunu");

        ekran.setResizable(false);
        ekran.setFocusable(false);

        ekran.setSize(800,600);
        ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Oyun oyun = new Oyun();

        oyun.requestFocus();

        oyun.addKeyListener(oyun);

        oyun.setFocusable(true);

        oyun.setFocusTraversalKeysEnabled(false);


        ekran.add(oyun);
        ekran.setVisible(true);
    }
}
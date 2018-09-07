import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Register loginPanel = new Register();
       frame.setContentPane((new Register()).getMainPanel());
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        frame.setMinimumSize(new Dimension(500,500));
    }
}

import java.awt.*;
import javax.swing.*;

public class LatihanJButton extends JFrame{
    private final JButton button1, button2;

    public LatihanJButton() {
        Container container = getContentPane();
        // penggunan Button
        button1 = new JButton("Oke");
        button2 = new JButton("Cancel");
        container.add(button1);
        container.add(button2);
        setLayout(new FlowLayout());
        setSize(300, 150);
    }
    public static void main(String[] args) {
        LatihanJButton btn = new LatihanJButton();
        btn.setVisible(true);
    }
}

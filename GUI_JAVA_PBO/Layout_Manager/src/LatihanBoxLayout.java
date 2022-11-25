import javax.swing.*;
import java.awt.*;

public class LatihanBoxLayout extends JFrame{
    public LatihanBoxLayout() {
        super("Demo BoxLayout !");
        Container container = getContentPane();
        Box box = new Box(BoxLayout.X_AXIS);
        JTextArea txtArea1 = new JTextArea("PBO 10", 10, 15);
        JButton btn1 = new JButton("Button 1");
        JButton btn2 = new JButton("Button 2");
        JTextArea txtArea2 = new JTextArea("PBO 12", 10, 15);
        box.add(new JScrollPane(txtArea1));
        box.add(btn1);
        box.add(btn2);
        box.add(new JScrollPane(txtArea2));
        container.add(box);
    } 

    public static void main(String[] args) {
        LatihanBoxLayout boxL = new LatihanBoxLayout();
        boxL.setSize(300, 300);
        boxL.setVisible(true);
        boxL.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

import java.awt.*;
import javax.swing.*;
public class LatihanJLabel extends JFrame{
    JLabel label;
    FlowLayout flowLayout;

    public LatihanJLabel() {
        Container container = getContentPane();
        label = new JLabel("Isi Label CUY");
        container.add(label);
        setLayout(new FlowLayout());
        setSize(300, 100);
        // setVisible(true);
        // show();
    }
    public static void main(String[] args) {
        LatihanJLabel halo = new LatihanJLabel();
        halo.setVisible(true);
    }
}

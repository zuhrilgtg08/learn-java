import javax.swing.*;
import java.awt.*;

public class LatihanSpringLayout {
    JFrame frame;
    Container container;
    SpringLayout springLayout;
    JLabel label;
    JTextField txtField;

    public LatihanSpringLayout() {
        frame = new JFrame("Demo SpringLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        container = frame.getContentPane();
        springLayout = new SpringLayout();
        container.setLayout(springLayout);
        label = new JLabel("Label CUY !");
        txtField = new JTextField("Another World", 20);
        container.add(label);
        container.add(txtField);

        // mengatur constraint agar label berada di posisi (20,10)
        springLayout.putConstraint(SpringLayout.WEST, label, 20, SpringLayout.WEST, container);
        springLayout.putConstraint(SpringLayout.NORTH, label, 10, SpringLayout.NORTH, container);

        // mengatur batasan untuk txtField supaya posisinya di (sisi_kanan_label+10,10)
        springLayout.putConstraint(SpringLayout.WEST, txtField, 10, SpringLayout.EAST, label);
        springLayout.putConstraint(SpringLayout.NORTH, txtField, 10, SpringLayout.NORTH, container);

        // mengatur posisi contentPane: sisi kanannya 5px diluar
        // sisi kanan textField dan sisi kirinya 5 px di bawah sisi 
        // bawah komponen terpanjang
        springLayout.putConstraint(SpringLayout.EAST, container, 5, SpringLayout.EAST, txtField);
        springLayout.putConstraint(SpringLayout.SOUTH, container, 5, SpringLayout.SOUTH, txtField);
        frame.pack();
        frame.show();
    }

    public static void main(String[] args) {
        LatihanSpringLayout spl = new LatihanSpringLayout();
    }
}

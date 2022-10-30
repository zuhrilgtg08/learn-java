import java.awt.*;
import javax.swing.*;

public class LatihanJComboBox extends JFrame {
    private final JComboBox cbx;

    public LatihanJComboBox() {
        Container container = getContentPane();
        String[] items = {"method", "class", "package", "atribut"};
        cbx = new JComboBox(items);
        container.setLayout(new FlowLayout());
        container.add(cbx);
        container.add(new JScrollPane(cbx));
        setSize(300, 190);
        show();
    }
    public static void main(String[] args) {
        LatihanJComboBox x = new LatihanJComboBox();
    }
}

import javax.swing.*;
import java.awt.*;

public class LatihanCardLayout extends JFrame{
    JPanel panel1;
    JPanel panel2;
    JRadioButton pil1, pil2, pil3;
    ButtonGroup radiGroup;
    JTextArea txtArea;

    public LatihanCardLayout() {
        super("Demo CardLayout !");
        panel1 = new JPanel();
        panel2 = new JPanel();
        pil1 = new JRadioButton("Pilihan 1", true);
        pil2 = new JRadioButton("Pilihan 2", false);
        pil3 = new JRadioButton("Pilihan 3", false);
        panel1.add(pil1);
        panel1.add(pil2);
        panel1.add(pil3);
        radiGroup = new ButtonGroup();
        radiGroup.add(pil1);
        radiGroup.add(pil2);
        radiGroup.add(pil3);
        txtArea = new JTextArea("Text Area comments");
        panel2.add(txtArea);
        JTabbedPane tab = new JTabbedPane();
        tab.add(panel1, "Tab dengan Radio Button");
        tab.add(panel2, "Tab dengan Text Area");
        Container container = getContentPane();
        container.add(tab, BorderLayout.NORTH);
    }

    public static void main(String[] args) {
        LatihanCardLayout tcl = new LatihanCardLayout();
        tcl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tcl.setSize(500, 100);
        tcl.setVisible(true);
    }
    
}

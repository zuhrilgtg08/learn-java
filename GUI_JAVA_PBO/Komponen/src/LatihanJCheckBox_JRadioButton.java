import java.awt.*;
import javax.swing.*;

public class LatihanJCheckBox_JRadioButton {
    private final JFrame frame;
    private JLabel label1, label2, label3, label4, label5, label6;
    private BorderLayout borderLayout;
    private JCheckBox cb1, cb2;
    private JRadioButton rb1, rb2;
    private JPanel a, b, c, d;
    private GridLayout gridLayout;
    private ButtonGroup btnGroup;

    public LatihanJCheckBox_JRadioButton() {
        frame = new JFrame("Example Form");
        // Panel
        a = new JPanel();
        b = new JPanel();
        c = new JPanel();
        d = new JPanel();
        // Label
        label1 = new JLabel("Mata Pelajaran (Checkobox) : ");
        label2 = new JLabel("Jenis Kelamin (RadioBtn) : ");
        label3 = new JLabel("Basis Data XII");
        label4 = new JLabel("PBO XII");
        label5 = new JLabel("Pria");
        label6 = new JLabel("Wanita");
        // Checkbox
        cb1 = new JCheckBox();
        cb2 = new JCheckBox();
        // RadioBtn
        rb1 = new JRadioButton();
        rb2 = new JRadioButton();

        // btnGroup
        btnGroup = new ButtonGroup();
        btnGroup.add(rb1);
        btnGroup.add(rb2);
        borderLayout = new BorderLayout();
        gridLayout = new GridLayout(2,2);
    }

    public void launchForm() {
        frame.setSize(400, 120);
        frame.add(a, borderLayout.CENTER);
        frame.add(a, borderLayout.SOUTH);
        a.setLayout(gridLayout);
        a.add(label1);
        a.add(c);
        a.add(label2);
        a.add(d);
        c.add(label3);
        c.add(cb1);
        c.add(label4);
        c.add(cb2);
        d.add(label5);
        d.add(rb1);
        d.add(label6);
        d.add(rb2);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        LatihanJCheckBox_JRadioButton coba = new LatihanJCheckBox_JRadioButton();
        coba.launchForm();
    }
}

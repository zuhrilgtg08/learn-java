import java.awt.*;
import javax.swing.*;

public class LatihanFormJava {
    private final JFrame frame1;
    private JLabel label1, label2, label3, label4, label5, label6;
    private BorderLayout bl;
    private JCheckBox cb1, cb2;
    private JRadioButton rb1, rb2;
    private JPanel a, b, c, d;
    private GridLayout gl;
    private ButtonGroup bg;

    public LatihanFormJava() {
        frame1 = new JFrame("Latihan Form");
        a = new JPanel();
        b = new JPanel();
        c = new JPanel();
        d = new JPanel();
        label1 = new JLabel("Mata Pelajaran (CheckBox) : ");
        label2 = new JLabel("Jenis Kelamin (RadioButton) : ");
        label3 = new JLabel("PBO 12-RPL-1");
        label4 = new JLabel("PBO 12-TAV-2");
        label5 = new JLabel("Pria");
        label6 = new JLabel("Wanita");
        cb1 = new JCheckBox();
        cb2 = new JCheckBox();
        rb1 = new JRadioButton();
        rb2 = new JRadioButton();
        bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        bl = new BorderLayout();
        gl = new GridLayout(2,2);
    }

    public void launchForm()
    {
        frame1.setSize(600,350);
        frame1.add(a, BorderLayout.CENTER);
        frame1.add(a, BorderLayout.NORTH);
        a.setLayout(gl);
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
        frame1.setResizable(false);
        frame1.setVisible(true);
    }

    public static void main(String[] args) {
        LatihanFormJava g = new LatihanFormJava();
        g.launchForm();
    }
}

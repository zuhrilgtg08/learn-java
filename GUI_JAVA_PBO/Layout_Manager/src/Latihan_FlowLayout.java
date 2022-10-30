import javax.swing.*;
import java.awt.*;

public class Latihan_FlowLayout extends JFrame {
    public Latihan_FlowLayout() {
        super("Contoh Flow Layout");
        FlowLayout flowLayout = new FlowLayout();
        flowLayout.setAlignment(FlowLayout.RIGHT);
        // mengatur jarak vertikal antar komponen
        flowLayout.setVgap(25); 
        // mengatur jarak horizontal antar komponen
        flowLayout.setHgap(25); 
        Container container = getContentPane();
        container.setLayout(flowLayout);
        JButton t1 = new JButton("Tombol 1");
        JButton t2 = new JButton("Tombol 2");
        JButton t3 = new JButton("Tombol 3");
        JButton t4 = new JButton("Tombol terpanjang no 4");
        JButton t5 = new JButton("Tombol 5");
        JButton t6 = new JButton("Tombol 6");

        container.add(t1);
        container.add(t2);
        container.add(t3);
        container.add(t4);
        container.add(t5);
        container.add(t6);
    }

    public static void main(String[] args) {
        Latihan_FlowLayout fl = new Latihan_FlowLayout();
        fl.setSize(500, 200);
        fl.setVisible(true);
    }
}

import javax.swing.*;
import java.awt.*;

public class LatihanBorderLayout extends JFrame{
    private final JButton tombol[];
    private final String names[] = {
        "Hilangkan North",
        "Hilangkan South",
        "Hilangkan East",
        "Hilangkan West",
        "Hilangkan Center"
    };
    private final BorderLayout borderLayout;

    public LatihanBorderLayout() {
        super("Ini Adalah Contoh Border Layout");
        Container container = getContentPane();
        borderLayout = new BorderLayout(10,10);
        container.setLayout(borderLayout);
        tombol = new JButton[names.length];

        for(int i=0; i < names.length; i++) {
            tombol[i] = new JButton(names[i]);
        }

        container.add(tombol[0], BorderLayout.NORTH);
        container.add(tombol[1], BorderLayout.SOUTH);
        container.add(tombol[2], BorderLayout.EAST);
        container.add(tombol[3], BorderLayout.WEST);
        container.add(tombol[4], BorderLayout.CENTER);
        setSize(500, 300);
    }

    public static void main(String[] args) {
        LatihanBorderLayout bl = new LatihanBorderLayout();
        bl.setVisible(true);
        bl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

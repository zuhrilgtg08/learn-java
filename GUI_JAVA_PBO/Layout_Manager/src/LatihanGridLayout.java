import javax.swing.*;
import java.awt.*;

public class LatihanGridLayout extends JFrame{
    private final JButton tombol[];
    private final String angka[] = {
        "Satu",
        "Dua",
        "Tiga",
        "Empat",
        "Lima",
        "Enam"
    };
    private final Container container;
    private final GridLayout gridLayout;

    public LatihanGridLayout() {
        super("Percobaan GridLayout");
        gridLayout = new GridLayout(2,3,5,5);
        container = getContentPane();
        container.setLayout(gridLayout);
        tombol = new JButton[angka.length];
        
        for(int i = 0; i < angka.length; i++) {
            tombol[i] = new JButton(angka[i]);
            container.add(tombol[i]);
        }
        setSize(300, 300);
        show();
    }

    public static void main(String[] args) {
        LatihanGridLayout gl = new LatihanGridLayout();
    }
}

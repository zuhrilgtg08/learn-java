import java.awt.*;
import javax.swing.*;

public class Latihan_JMenuBar extends JFrame {
    private final JMenuBar menu;
    private final JMenu file, help;
    private final JMenuItem newMenu, openMenu, exitMenu, helpMenu;

    public Latihan_JMenuBar() {
        Container container = getContentPane();
        // init menuBar
        menu = new JMenuBar();
        //  init menu
        file = new JMenu("File");
        help = new JMenu("Help");
        // init item menu
        newMenu = new JMenuItem("New");
        openMenu = new JMenuItem("Open");
        exitMenu = new JMenuItem("Exit");
        helpMenu = new JMenuItem("Help");
        setJMenuBar(menu);
        menu.add(file);
        menu.add(help);
        file.add(newMenu);
        file.add(openMenu);
        file.add(exitMenu);
        file.add(helpMenu);
        setLayout(new FlowLayout());
        setSize(300, 200);
        show();
    }

    public static void main(String[] args) {
        Latihan_JMenuBar mb = new Latihan_JMenuBar();
    }
}

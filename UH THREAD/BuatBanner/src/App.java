import javax.swing.JFrame;
import java.util.function.Function;
import javax.swing.*;

public class App {
    // Scanner scan;
    private Setting1 setting1;
    private Setting2 setting2;
    private Setting3 setting3;

    public App() {
        JFrame frame = new JFrame();
        setting1 = new Setting1();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(80, 50, 230, 200);
        frame.add(setting1);
        frame.setVisible(true);
        new Thread(setting1).start();

        JFrame frame2 = new JFrame();
        setting2 = new Setting2();
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setBounds(80, 50, 230, 200);
        frame2.add(setting2);
        frame2.setVisible(true);
        new Thread(setting2).start();

        JFrame frame3 = new JFrame();
        setting3 = new Setting3();
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.setBounds(80, 50, 230, 200);
        frame3.add(setting3);
        frame3.setVisible(true);
        new Thread(setting3).start();
    }

    public static void main(String[] args) throws Exception {
        App app = new App();
    }
}

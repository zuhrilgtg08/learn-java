import javax.swing.JFrame;

/**
 * LksJava
 */
public class LksJava {
    private final JFrame contohFrame;
    public LksJava() {
        contohFrame = new JFrame("Contoh Jframe");
    }

    public void launchFrame() {
        contohFrame.setSize(400, 300); //Mengatur ukuran frame
        contohFrame.setResizable(false); //Ukuran frame fixed/tetap
        contohFrame.setVisible(true); //Agar frame muncul
    }

    public static void main(String[] args) {
        LksJava a = new LksJava();
        a.launchFrame();
    }
}
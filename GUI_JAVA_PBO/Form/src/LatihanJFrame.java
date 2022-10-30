import javax.swing.JFrame;
public class LatihanJFrame {
    private final JFrame contohFrame;

    public LatihanJFrame() {
        contohFrame = new JFrame("Contoh JFrame");
    }

    public void launchFrame() {
        contohFrame.setSize(400, 300); //Mengatur ukuran frame
        contohFrame.setResizable(false); //ukuran frame fixed/tetap
        contohFrame.setVisible(true);//agar frame muncul
    }

    public static void main(String[] args) {
        LatihanJFrame a = new LatihanJFrame();
        a.launchFrame();
    }
}

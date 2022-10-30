import javax.swing.JDialog;
import javax.swing.JLabel;
public class LatihanJDialog extends JDialog{
    public LatihanJDialog() {
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setTitle("Testing JDialog");
        setBounds(100, 100, 359, 174);
        getContentPane().setLayout(null);
        JLabel label = new JLabel("Halo CUY !");
        label.setBounds(86, 37, 175, 29);
        getContentPane().add(label);
    }

    public static void main(String[] args) {
        LatihanJDialog dialog = new LatihanJDialog();
        dialog.setVisible(true);
    }
}

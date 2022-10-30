import java.awt.*;
import javax.swing.*;

public class LatihanJTextField_JPasswodField_JTextArea extends JFrame {
    private final JTextField txtField;
    private final JPasswordField pass;
    private final JTextArea txtArea;

    public LatihanJTextField_JPasswodField_JTextArea() {
        Container container = getContentPane();
        setLayout(new FlowLayout());
        // penggunaan textField
        txtField = new JTextField(10);
        container.add(txtField);
        // penggunaan passwordField
        pass = new JPasswordField(10);
        container.add(pass);
        // penggunaan textArea
        txtArea = new JTextArea(5,20);
        container.add(txtArea);
        setSize(350, 150);
        // show();
    }
    public static void main(String[] args) {
        LatihanJTextField_JPasswodField_JTextArea txt = new LatihanJTextField_JPasswodField_JTextArea();
        txt.setVisible(true);
    }
}

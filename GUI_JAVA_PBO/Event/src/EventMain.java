import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class EventMain extends JFrame implements ActionListener{
    EventMain() {
        // manajemen tata letak form
        setLayout(null); // absoluteLayout
        setSize(300, 200); //ukuran form
        setVisible(true); //agar form muncul

        // komponen
        JButton btn = new JButton("Click Here!");
        // koor x, koorY, panjang, lebar
        btn.setBounds(25, 25, 100, 25);
        setVisible(true);
        add(btn);
        btn.addActionListener(this);
    } 

    public static void main(String[] args) {
        new EventMain();
    }
    @Override
    public void actionPerformed(ActionEvent args) {
        this.setTitle("Title has been cahnged");
    }
}

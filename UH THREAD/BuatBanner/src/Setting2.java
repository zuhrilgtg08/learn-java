import java.awt.Color;
import java.util.Scanner;
import javax.swing.*;

public class Setting2 extends javax.swing.JPanel implements Runnable {
    private javax.swing.JLabel label;

    public Setting2(){
        Scanner scan = new Scanner (System.in);
        String nama;
        System.out.print("Masukkan Nama Kedua : ");
        nama = scan.nextLine();
        setLayout(null);
        label = new javax.swing.JLabel(nama);
        setBackground(Color.pink);
        add(label);
    }

    @Override
    public void run() {
        int x = 190, y = 10;
        while (true) {
            label.setForeground(Color.black);
            label.setBounds(x, y, 400, 90);
            if (x == 190) {
                x -= 170;
            } else {
                x += 5;
            }
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
            }
        }
    }
}

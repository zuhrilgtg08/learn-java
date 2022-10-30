import javax.swing.*;
import java.awt.*;

public class LatihanGridBagLayout {
    JFrame frame;
    GridBagLayout gridBagLayout;
    GridBagConstraints gridBagConstraints;

    public LatihanGridBagLayout() {
        frame = new JFrame("Demo GridBagLayout");
        gridBagLayout = new GridBagLayout();
        gridBagConstraints = new GridBagConstraints();
        frame.getContentPane().setLayout(gridBagLayout);
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;

        JButton btn1 = new JButton(" 1 ");
        // ukuran ruang horizontal
        gridBagConstraints.weightx = 2;
        // menempati kolom 0
        gridBagConstraints.gridx = 0;
        // menempati baris 0
        gridBagConstraints.gridy = 0;
        gridBagLayout.setConstraints(btn1, gridBagConstraints);
        frame.getContentPane().add(btn1);
        JButton btn2 = new JButton(" 2 ");
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagLayout.setConstraints(btn2, gridBagConstraints);
        frame.getContentPane().add(btn2);
        JButton btn3 = new JButton(" 3 ");
        // tingginya ditambah
        gridBagConstraints.ipady = 30;
        // btn menempati 2 kolom
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagLayout.setConstraints(btn3, gridBagConstraints);
        frame.getContentPane().add(btn3);
        JButton btn4 = new JButton(" 4 ");
        gridBagConstraints.ipady = 50;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagLayout.setConstraints(btn4, gridBagConstraints);
        frame.getContentPane().add(btn4);
        JButton btn5 = new JButton(" 5 ");
        gridBagConstraints.ipady = 0;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = GridBagConstraints.SOUTH;
        gridBagLayout.setConstraints(btn5, gridBagConstraints);
        frame.getContentPane().add(btn5);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    } 

    public static void main(String[] args) {
        LatihanGridBagLayout gbl = new LatihanGridBagLayout(); 
    }
}

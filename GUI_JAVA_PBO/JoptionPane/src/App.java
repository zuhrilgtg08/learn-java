import javax.swing.*;

public class App {
    JOptionPane optionPane;

    void launchFrame() {
        optionPane = new JOptionPane();
        String name = optionPane.showInputDialog("Hi Cuy Salken yak, namamu siapa ?");
        if (!name.equals(null)) {
            optionPane.showMessageDialog(null, "Salam kenal ya " + name + " nama ku Dea. ", "JOptionPane",
                    optionPane.PLAIN_MESSAGE);
            System.exit(0);
        }
    }
    
    public static void main(String[] args) throws Exception {
        new App().launchFrame();
    }
}

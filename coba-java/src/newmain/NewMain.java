package newmain;
import java.util.Random;

public class NewMain {
    public static void main(String[] args) {
        Random angkaRandom = new Random();
        for(int i = 0; i < 10; i++) {
            System.out.println("Angka " + angkaRandom.nextInt(100));
        }
    }
}

import java.beans.IntrospectionException;

public class CobaThread1 implements Runnable {
    @Override
    public void run() {
        int i = 2;
        do {
            System.out.println("Thread 3 " + i);
            i++;
        } 
        while(i <= 10);

        try {
            Thread.sleep(200);
        } catch(InterruptedException err) {
            err.printStackTrace();
        }
    }
}
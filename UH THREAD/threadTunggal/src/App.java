import javax.sound.midi.Instrument;

class ThreadUtama extends Thread {
    public void run() {
        for(int i = 4; i <= 7; i++) {
            System.out.println("Thread Utama " + i);
        }

        try {
            Thread.sleep(300);
        } catch(InterruptedException err) {
            err.printStackTrace();
        }
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Thread mainThread = new Thread(new ThreadUtama());
        Thread Thread2 = new Thread(new CobaThread2());
        Thread CobaThread1 = new Thread(new CobaThread1());
        mainThread.start();
        Thread2.start();
        CobaThread1.start();
    }
}

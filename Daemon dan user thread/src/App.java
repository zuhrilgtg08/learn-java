import java.lang.*;

class DaemonThread extends Thread {
    public DaemonThread(String name) {
        super(name);
    }

    public void run() {
        // cek thread = daemon atau tidak
        if(Thread.currentThread().isDaemon()) {
            System.out.println(getName() + " is Daemon Thread");
        } else {
            System.out.println(getName() + " is User Thread");
        }
    }
}
public class App {
    public static void main(String[] args) throws Exception {
        DaemonThread t1 = new DaemonThread("t1");
        DaemonThread t2 = new DaemonThread("t2");
        DaemonThread t3 = new DaemonThread("t3");

        //set user thread t1 to daemon
        t1.setDaemon(true);
        // set user thread t3 = daemon
        t3.setDaemon(true);

        //starting first 2 thread
        t1.start();
        t2.start();
        t3.start();
    }
}

import java.lang.*;

class PrioritasThread extends Thread {
    public void run() {
        System.out.println("Inside Run Method");
    }
}

public class latihan2 {
    public static void main(String[] args) {
        PrioritasThread t1 = new PrioritasThread();
        PrioritasThread t2 = new PrioritasThread();
        PrioritasThread t3 = new PrioritasThread();
        
        // thread dengan nilai default 5
        System.out.println("t1 thread priority : " + t1.getPriority());
        System.out.println("t2 thread priority : " + t2.getPriority());
        System.out.println("t3 thread priority : " + t3.getPriority());

        // pengaturan nilai prioritas thread
        t1.setPriority(2);
        t2.setPriority(5);
        t3.setPriority(8);

        // cetak prioritas thread
        System.out.println("t1 thread priority : " + t1.getPriority());
        System.out.println("t2 thread priority : " + t2.getPriority());
        System.out.println("t3 thread priority : " + t3.getPriority());

        // memanggil main thread  dengan niali default = 5
        System.out.println("Currently Executing Thread : " + Thread.currentThread().getName());
        System.out.println("Main Thread Priority : " + Thread.currentThread().getPriority());

        // Mengubah Main thread dengan nilai 10 
        Thread.currentThread().setPriority(10);
        System.out.println("Main Thread Priority : " + Thread.currentThread().getPriority());
    }
}

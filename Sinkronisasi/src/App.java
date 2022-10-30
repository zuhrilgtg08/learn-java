// //tanpa sinkronisasi
class PrintDemo {
    void display(int x) {
        for (int i = 1; i <= 3; i++) {
            System.out.println(x + i);

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// //sinkronisasi blok
// class PrintDemo {
//     void display(int x) {
//         synchronized (this) {
//             for (int i = 1; i <= 3; i++) {
//                 System.out.println(x + i);

//                 try {
//                     Thread.sleep(200);
//                 } catch (InterruptedException e) {
//                     e.printStackTrace();
//                 }
//             }
//         }
//     }
// }

// //sinkronisasi method
// class PrintDemo {
//     public synchronized void display(int x) {
//             for(int i = 1; i <= 3; i++) {
//                 System.out.println(x+i);

//                 try {
//                     Thread.sleep(200);
//                 } catch (InterruptedException e) {
//                     e.printStackTrace();
//             }
//         }
//     }
// }

class ThreadA extends Thread {
    PrintDemo p;
    ThreadA(PrintDemo p) {
        this.p = p;
    }

    public void run() {
        p.display(2);
    }
}

class ThreadB extends Thread {
    PrintDemo p;
    ThreadB(PrintDemo p) {
        this.p = p;
    }

    public void run() {
        p.display(4);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        PrintDemo p = new PrintDemo();
        ThreadA ta = new ThreadA(p);
        ThreadB tb = new ThreadB(p);
        ta.start();
        tb.start();
    }
}

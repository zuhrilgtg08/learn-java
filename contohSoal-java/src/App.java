public class App {

    Thread thread;
    int jumlah = 5;

    public static void main(String[] args) {
        App test = new App();
        test.proses_satu();
        test.proses_dua();
    }

    void proses_satu() {
        thread = new Thread() {
            public void run() {
                try {
                    for (int pijet = 1; pijet <= jumlah; pijet++) {
                        System.out.println("Nomor: " + pijet);
                        sleep(500); // Waktu Pending
                    }
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        };
        thread.start();
    }

    void proses_dua() {
        thread = new Thread() {
            public void run() {
                try {
                    for (int w = 1; w <= jumlah; w++) {
                        System.out.println("Salam Kurung Kurawal");
                        sleep(1000); // Waktu Pending
                    }
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        };
        thread.start();
    }
}

class Tampilkan implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println("Ini Angka " + i);

            try {
                Thread.sleep(100);
                // digunakan supaya CPU tidak terbebani
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Thread tampil1 = new Thread(new Tampilkan());
        tampil1.start();
        Thread tampil2 = new Thread(new Tampilkan());
        tampil2.start();
    }
}

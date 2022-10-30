class Tampilkan extends Thread {
    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println("Ini Angka " + i);
            try {
                Thread.sleep(100);
                // digunakan supaya CPU tidak terbebani
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


public class Latihan1 {
    public static void main(String[] args) {
        Tampilkan tampil1 = new Tampilkan();
        tampil1.start();
        Tampilkan tampil2 = new Tampilkan();
        tampil2.start();
    }
}

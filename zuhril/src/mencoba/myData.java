package mencoba;
import java.util.Scanner; //memanggil java utill scanner
public class myData {
    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nama, alamat, kota, tgl, telepon;
        int usia;
        
        System.out.print("Masukkan Nama Anda            : ");
        nama = scan.nextLine();
        System.out.print("Masukkan Alamat Anda          : ");
        alamat = scan.nextLine();
        System.out.print("Masukkan Kota Anda Sekarang   : ");
        kota = scan.nextLine();
        System.out.print("Masukkan Nomor Telepon        : ");
        telepon = scan.nextLine();
        System.out.print("Masukkan Tanggal Lahir  Anda  : ");
        tgl = scan.nextLine();
        System.out.print("Masukkan Usia Anda Saat Ini   : ");
        usia = scan.nextInt();        
        System.out.println();
        
        System.out.println("Nama                 : " +nama);
        System.out.println("Usia                 : " + usia + " Tahun");
        System.out.println("Alamat               : " +alamat);
        System.out.println("Kota                 : " +kota);
        System.out.println("Tanggal Lahir        : " +tgl);
        System.out.println("No Handphone         : " +telepon);
    }
    
}

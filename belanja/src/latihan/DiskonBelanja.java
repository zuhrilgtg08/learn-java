package latihan;
import java.util.Scanner;

public class DiskonBelanja {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlah, harga, diskon, total;
        
        //Mengambil Input Dari User
        System.out.print("Masukkan Jumlah Barang Belanjaan : " );
        jumlah = input.nextInt();
        System.out.print("Masukkan Harga Barang Yang Dibeli : Rp. ");
        harga = input.nextInt();
        
        total = jumlah * harga;

        //Mengecek apakah harga diatas 300000
        if(total >= 30000){
            diskon = total * 30 / 100;
            total = total - diskon;
            System.out.println("Selamat Anda Mendapatkan Diskon 30 %");
            System.out.print("Jadi total yang Harus dibayar " +total);
        }else if(total <= 30000){
            System.out.println("Terimakasih");
        }
    }
    
}

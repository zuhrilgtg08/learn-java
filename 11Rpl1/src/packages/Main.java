package packages;
//import class 
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Main {

    public static void main(String[] args) {
        //instalasi class yang diimport tadi
        Scanner input = new Scanner(System.in);
        DecimalFormat mataUangindonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        
        //deklarasi varaiable
        int jumlah = 0, i = 0;
        double totalBayar = 0;
        
        //Dekalarasi Array
        int [] kode = new int[5];
        int [] stock = new int[5];
        int [] harga = new int[5];
        double [] subTotal = new double[5];
        double [] diskon = new double[5];
        String [] barang = new String[5];
        
        System.out.println("Programa Java Penjualan Online");
        
        System.out.print("Masukkan Jumlah Barang yang dibeli : ");
        jumlah=input.nextInt();
        System.out.println(" ");
        
        //menginputkan elemen didalam array
        for(i = 0; i < jumlah; i++){
            System.out.print("Masukan Kode Barang ke = " + (i+1) + " : ");
            kode[i] = input.nextInt();
            System.out.print("Masukkan Jumlah Barang ke = " + (i+1) + " : ");
            stock[i] = input.nextInt();
            
            //Penkondisian kode barang (switch)
            switch(kode[i]){
                case 1:
                    barang[i] = "Mouse Gaming Wireless ";
                    harga[i] = 150000;
                    diskon[i] = 0.1;
                    break;
                    
                case 2:
                    barang[i] = "Mechanical Keyboard Wireless ";
                    harga[i] = 260000;
                    diskon[i] = 0.05;
                    break;
                    
                case 3:
                    barang[i] = "Headphone Bloetooth Stereo ";
                    harga[i] = 135000;
                    diskon[i] = 0;
                    break;
                    
                case 4:
                    barang[i] = "Speaker ROG Wireless ";
                    harga[i] = 305000;
                    diskon[i] = 0.2;
                    break;
                    
                case 5:
                    barang[i] = "Smart Watch Xiomi ";
                    harga[i] = 850000;
                    diskon[i] = 0.1;
                    break;
                    
                default:
                    System.out.println("Kode Barang Tidak Ada");   
            }
        }
        
        //Mengatur format number
        formatRp.setCurrenscy
        
        
        
       
    }
    
}

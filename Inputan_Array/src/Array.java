import java.util.Scanner;
public class Array {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        int j = input.nextInt();
        
        String nama[] = new String[j];
        String status[] = new String[j];
        int nilai[] = new int[j];
        
        for(int i = 0; i < j; i++){
            System.out.println("Data Siswa ke : " + (i+1));
            System.out.print("Nama : ");
            nama[i]=input.next();
            
            System.out.print("Nilai : ");
            nilai[i]=input.nextInt();
            
            if(nilai[i] <= 70){
                status[i] = "Siswa Tidak Lulus";
            }else{
                status[i] = "Siswa Lulus";
            }
            
            
            System.out.println("DATA MAHASISWA");
            System.out.println("==============");
            System.out.println("No  Nama  Nilai  Status");
        }
        
        for(int i=0; i<j; i++){
                System.out.println((i+1) + "   " + nama[i] + "   " + nilai[i] + "   " + status[i]);
            }
    }
}
        
       
    


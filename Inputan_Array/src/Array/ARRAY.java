package Array;
import java.util.*;
public class ARRAY {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah nilai array : ");
        int j = input.nextInt();
        int arr[] = new int[j];
        String array[] = new String[j];
        
       
        for(int i=0; i<arr.length; i++){
            System.out.print("Masukkan nilai array ke - " + (i+1) + " : ");
            array[i] = input.next();
            arr[i] = Integer.parseInt(array[i]);
        }
        
        for(int i=0; i<j; i++){
            System.out.print((i+1) + " ");
        }
    }

//int array[] = new int(100);
//Scanner s = new Scanner(System.in);
//        System.out.println("Masukkan Jumlah isi array : ");
//        int a = s.nextInt();
//        
//        for(int i = 0; i < a; i++){
//            System.out.println("Masukkan Nilai Arraynya Ke -" + (i+1)) + ":";
//            array[i] = s.nextInt();
//        }
//        
//        for(int i = 0; i < a; i++)System.out.print(array[1] + "");
//    
}

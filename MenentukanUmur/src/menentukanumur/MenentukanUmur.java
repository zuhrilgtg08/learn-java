/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menentukanumur;
import java.util.Scanner;
import java.util.Calendar;

/**
 *
 * @author Lenovo
 */
public class MenentukanUmur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nama;
        int tahun_lahir;
        int tahun_sekarang;
        int umur;
        
        Scanner input = new Scanner(System.in);
        Calendar kalender = Calendar.getInstance();
        
        tahun_sekarang = kalender.get(Calendar.YEAR);
        
        System.out.print("Masukkan Nama: ");
        nama = input.nextLine();
        System.out.print("Masukkan Tahun Lahir Kamu: ");
        tahun_lahir = input.nextInt();
        
        umur = tahun_sekarang - tahun_lahir;
        
        System.out.println("Nama Kamu: " + nama);
        System.out.println("Umur Kamu adalah " + umur + " Tahun");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbostring;

/**
 *
 * @author Lenovo
 */
public class PboString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            //Buat Biodata saya
           System.out.println("STRING");
           String nama = new String("Ahmad Zuhril Fahrizal.");
           String kelas = "Xll-RPL-1.";
           String noAbsen = "04.";
           String ttl = "Surabaya, 06 Agustus 2004.";
           String impian = "Programmer.";
           
           //String Type
           System.out.println(nama);
           System.out.println(kelas);
           System.out.println(noAbsen);
           System.out.println(ttl);
           System.out.println(impian);
           System.out.println();
           
           //length method
           System.out.println("LENGTH METHOD");
           System.out.println(nama.length());
           System.out.println(kelas.length());
           System.out.println(noAbsen.length());
           System.out.println(ttl.length());
           System.out.println(impian.length() + "\n");
           
           //concat operation
           System.out.println("CONCAT OPERATION");
           System.out.println("Biodata Saya");
           System.out.println("Nama : " + nama);
           System.out.println("Kelas : " + kelas);
           System.out.println("Absen : ".concat(noAbsen));
           System.out.println("Ttl : ". concat(ttl));
           System.out.println("Cita-Cita : " + impian);
    }
}

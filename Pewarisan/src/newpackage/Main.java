package newpackage;
public class Main {
    public static void main(String[] args){
        //Membuat object bangun datar
        BangunDatar bangundatar = new BangunDatar();
        
        //membuat object persegi
        Persegi persegi = new Persegi();
        persegi.sisi = 2;
        
        //membuat object lingkaran
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 4;
        
        //Membuat object Persegi Panjang
        PersegiPanjang persegipanjang = new PersegiPanjang();
        persegipanjang.panjang = 12;
        persegipanjang.lebar = 7;
        
        //memanggil method
        bangundatar.luas(1);
        persegi.luas(4);
        lingkaran.luas(6);
        persegipanjang.luas(8);
    }
   
}

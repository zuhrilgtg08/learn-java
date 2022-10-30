public class App {
    public static void main(String[] args) throws Exception {
        String s1 = "Ahmad Zuhril Fahrizal";
        String s2 = " Suka anime action";

        // perhitungan panjang string
        String nama = "Rizal";
        int umur = 17;
        System.out.println("'"+s1+"'" + " Memiliki panjang " + s1.length() + " Karakter");
        System.out.println(s1+s2);
        System.out.println(s1.concat(s2) + " Dengan teknik concat");
        System.out.printf("Perkenalkan nama saya %s, umur %d\n", nama, umur);
        String s = String.format("Perkenalakan nama saya %s, saya umur %d", nama, umur);
        System.out.println(s);
    }
}

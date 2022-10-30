public class FormatString {
    public static void main(String[] args) {
        // format huruf
        String kata1 = "Object Oriented Programming";
        String kata2 = "(oop java)";
        System.out.printf("%s, %S \n", kata1, kata2);

        //format alignment 
        String car1 = "Object Oriented Programming PHP";
        //Format rata kanan, alokasi 50 karakter
        System.out.printf("|%50s| %n", car1);
        //format rata kiri, alokasi 50 karakter
        System.out.printf("|%-50s| %n", car1);

        //format ketepatan
        String kata = "Object Oriented Programing C++";
        System.out.printf("%.27s \n", kata);

        //Argumen
        String coba = "Programming mudah";
        System.out.printf("%S %<s %<.11s \n", coba);
    }
}

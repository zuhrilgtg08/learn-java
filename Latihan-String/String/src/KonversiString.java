public class KonversiString {
    public static void main(String[] args) {
        // konversi string
        String kata = "Pemrogaman Java";
        String kecil = kata.toLowerCase();
        String besar = kata.toUpperCase();
        System.out.println("Kata Original " + kata);
        System.out.println("Method toLowerCase " + kecil);
        System.out.println("Method toUpperCase " + besar);

        // set awal dan akhir string
        String kal1 = "Rekayasa Perangkat Lunak";
        System.out.println(kal1.startsWith("Rekayasa"));
        System.out.println(kal1.startsWith("Teknik"));
        System.out.println(kal1.endsWith("Lunak"));
        System.out.println(kal1.endsWith("Elektro"));

        // Mengurutkan String
        String[] nama = {"Bagas", "Zuhril", "Akmal", "Daffa", "Nando"};
        String temp;
        System.out.println("Sebelum diurutkan");
        for(int i = 0; i < nama.length; i++) {
            System.out.println(i + 1 + " " + nama[i] + "");
        }
        System.out.println("Sesudah diurutkan");
        for(int i = 0; i < (nama.length-1); i++) {
            for(int j = 0; j < (nama.length-1); j++ ) {
                if(nama[j].compareTo(nama[j + 1]) > 0) {
                    temp = nama[j + 1];
                    nama[j + 1] = nama[j];
                    nama[j] = temp;
                }
            }
        }

        for(int i = 0; i < nama.length; i++) {
            System.out.println(i + 1 + " " + nama[i]);
        }
    }
}

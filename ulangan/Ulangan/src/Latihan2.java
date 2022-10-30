import java.util.HashMap;
import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        HashMap<String, Integer> nilai = new HashMap<String, Integer>();
        nilai.put("A", 90);
        nilai.put("B", 80);
        nilai.put("C", 70);
        nilai.put("D", 60);
        nilai.put("E", 50);

        HashMap<String, HashMap<String, Integer>> pelajaran = new HashMap<String, HashMap<String, Integer>>();

        Scanner scanner = new Scanner(System.in);

        int jml_mapel, nilaiPelajaran;
        String namaPelajaran;
        System.out.println("\t----------------------------------------------");
        System.out.println("\t\tProgram Hitung Nilai Rata Rata Siswa");
        System.out.println("\t----------------------------------------------");

        System.out.print("Input Jumlah Mata Pelajaran : ");
        jml_mapel = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < jml_mapel; i++) {
            String kode = "CS142" + (i + 1);

            System.out.print("Inputkan Nama Mata Pelajaran ke " + (i + 1) + ": ");
            namaPelajaran = scanner.next();

            System.out.print("Inputkan Nilai Mata Pelajaran ke " + (i + 1) + ": ");
            nilaiPelajaran = scanner.nextInt();

            HashMap<String, Integer> detailMapel = new HashMap<String, Integer>();
            detailMapel.put(namaPelajaran, nilaiPelajaran);

            pelajaran.put(kode, detailMapel);
        }

        int nilaiTotal = 0;
        for (String kode : pelajaran.keySet()) {
            HashMap<String, Integer> detailMapel = pelajaran.get(kode);

            for (String namaMapel : detailMapel.keySet()) {
                int nilaiMapel = detailMapel.get(namaMapel);
                nilaiTotal += nilaiMapel;
            }
        }

        int rata_rata = nilaiTotal / pelajaran.size();

        // print data
        System.out.println("+-----------+----------------+----------+");
        System.out.println("| Kode_Mapel| Mata Pelajaran | Predikat |");
        System.out.println("+-----------+----------------+----------+");

        for (String kode : pelajaran.keySet()) {
            String predikat = " ";

            HashMap<String, Integer> detailMapel = pelajaran.get(kode);
            String namaMapel = detailMapel.keySet().toArray()[0].toString();
            int nilaiMapel = detailMapel.get(detailMapel.keySet().toArray()[0].toString());

            for (String predikat_nilai : nilai.keySet()) {
                if (nilaiMapel >= nilai.get(predikat_nilai)) {
                    predikat = predikat_nilai;
                    break;
                }
            }

            System.out.printf("|%-11s|%-16s|%-10s|%n", kode, namaMapel, predikat);
        }

        System.out.println("+-----------+----------------+----------+");
        System.out.printf("|%-17s%-20d |%n", "Nilai Rata-rata : ", rata_rata);
        System.out.println("+-----------+----------------+----------+");

        scanner.close();
    }
}
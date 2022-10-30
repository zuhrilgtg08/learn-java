public class SubstringString {
    public static void main(String[] args) {
        // substring
        String kata = "Hardware dan Software merupakan komponen utama komputer";
        String subkata = kata.substring(13);
        String subkata2 = kata.substring(0, 55);
        System.out.println("Substring kata (1) : " + subkata);
        System.out.println("Substring kata (2) : " + subkata2);

        // char charAt
        String kata1 = "Minggu Pagi";
        char a = kata1.charAt(0);
        char b = kata1.charAt(2);
        char c = kata1.charAt(7);
        System.out.println("Index ke-0 = " + a);
        System.out.println("Index ke-2 = " + b);
        System.out.println("Index ke-7 = " + c);

        // Set posisi substring
        String coba = "Stay Hungry, Stay Foolish";
        int pos1 = coba.indexOf('y');
        int pos2 = coba.indexOf('g');
        int pos3 = coba.indexOf('h');
        System.out.println("Letak huruf y = " + pos1);
        System.out.println("Letak huruf g = " + pos2);
        System.out.println("Letak huruf h = " + pos3);
    }
}

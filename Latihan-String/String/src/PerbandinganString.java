public class PerbandinganString {
    public static void main(String[] args) {
        String word1 = "Belajar";
        String word2 = "Elektro";
        String word3 = word1 + word2 + " Bareng gua Fahrizal";
        System.out.println("word1.equals(word2) = " + word1.equals(word2));
        System.out.println("word2.equals(word3) = " + word1.equals(word3));
        System.out.println("(word1 + \" Bareng gua \" + word2).equals(word3) = " + (word1 + word2 + " Bareng gua Fahrizal").equals(word3));
    }
}

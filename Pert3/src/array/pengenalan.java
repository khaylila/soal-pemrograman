package array;

public class pengenalan {
    public static void main(String[] args) {
        String[] teman = { "deni", "dodi", "desi", "dewi" };
        int index = 1;
        for (String i : teman) {
            System.out.println("Indeks ke-" + index++ + ": " + i);
        }
        System.out.println(teman.toString());
    }
}

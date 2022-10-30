package uts;

public class Soal5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            System.out.println("Bilangan " + i + (i % 2 == 0 ? " genap" : " ganjil"));
            // if (i % 2 == 0) {
            // System.out.println("Bilangan " + i + " genap");
            // } else {
            // System.out.println("Bilangan " + i + " ganjil");
            // }
        }
    }
}

package uts;

public class Soal4 {
    public static void main(String[] args) {
        String sholat = "berdiri";

        if (sholat.equalsIgnoreCase("berdiri")) {
            System.out.println("Maka sholatlah berdiri.");
        } else if (sholat.equalsIgnoreCase("duduk")) {
            System.out.println("Maka sholatlah duduk.");
        } else {
            System.out.println("Sholatlah dengan berbaring miring.");
        }
    }
}

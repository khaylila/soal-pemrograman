package uts;

public class Soal6 {
    public static void main(String[] args) {
        tanpaMengembalikanNilai(10, 5);
        System.out.println(mengembalikanNilai(10, 5));
    }

    public static void tanpaMengembalikanNilai(int panjang, int lebar) {
        System.out.println("Luas persegi panjang adalah " + (panjang * lebar));
    }

    public static int mengembalikanNilai(int panjang, int lebar) {
        return panjang * lebar;
    }
}

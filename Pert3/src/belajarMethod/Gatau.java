package belajarMethod;

import java.util.Scanner;
import pengulangan.tugas.BilanganPrima;
import pengulangan.pengulangan;

// cara penulisan variabel
// 1. gaboleh spasi
// 2. gaboleh diawali angka, tetapi boleh mengandung angka
public class Gatau {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int angkaLima = 5;
        int panjang = 10;
        int lebar = 5;
        // scan.nextInt();
        // non static
        Gatau gatau = new Gatau();
        // System.out.println(angkaLima);
        // System.out.println(gatau.menghitungLuasPersegiPanjang());
        // gatau.salam();
        // static
        // jawabSalam();
        // int luas1 = 10 * 5;
        // int luas2 = 12 * 6;
        // int luas3 = 15 * 4;
        int luas1 = gatau.menghitungLuasPersegiPanjang(10, 5);
        int luas2 = gatau.menghitungLuasPersegiPanjang(12, 6);
        int luas3 = gatau.menghitungLuasPersegiPanjang(15, 4);
        System.out.println("Menghitung luas persegi Panjang");
        System.out.println(gatau.menghitungLuasPersegiPanjang());
        Method metod = new Method();
        System.out.println(metod.methodPerkalian());
    }

    public int menghitungLuasPersegiPanjang(int panjang, int lebar) {
        int luas = panjang * lebar;
        return luas;
    }

    public int menghitungLuasPersegiPanjang() {
        return 0;
    }

    public int mengembalikanNilaiLima() {
        System.out.println("asdaf");
        return 5;
    }

    public void salam(String salam) {
        System.out.println(salam);
    }

    public static void jawabSalam() {
        System.out.println("Iya makasih");
    }
}

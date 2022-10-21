package tugasPercabangan;

import java.util.Scanner;

public class ganjilGenap {
    public static void main(String[] args) {
        int inputAngka;
        Scanner scan = new Scanner(System.in);

        System.out.println("~~~~Program Ganjil Genap~~~~");
        System.out.print("Masukkan Angka: ");
        inputAngka = scan.nextInt();
        if (inputAngka % 2 == 1) {
            System.out.println("Angka " + inputAngka + " adalah bilangan ganjil");
        } else {
            System.out.println("Angka " + inputAngka + " adalah bilangan genap");
        }
        scan.close();
    }
}

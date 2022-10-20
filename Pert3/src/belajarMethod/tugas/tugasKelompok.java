package belajarMethod.tugas;

import java.util.Scanner;

public class tugasKelompok {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int makanan = 0, minuman = 0, count = 0;
        String namaMakanan, namaMinuman;

        listMenu();

        while (makanan < 1 || makanan > 5) {
            if (count > 0) {
                System.out.println("Inputan tidak sesuai.");
            }
            System.out.print("Masukkan menu makanan (angka 1-5): ");
            makanan = scan.nextInt();
            count++;
        }
        count = 0;
        while (minuman < 1 || minuman > 5) {
            if (count > 0) {
                System.out.println("Inputan tidak sesuai.");
            }
            System.out.print("Masukkan menu minuman (angka 1-5): ");
            minuman = scan.nextInt();
            count++;
        }
        scan.close();

        if (makanan == 1) {
            namaMakanan = "Nasi Ayam Goreng";
        } else if (makanan == 2) {
            namaMakanan = "Nasi Ayam Bakar";
        } else if (makanan == 3) {
            namaMakanan = "Nasi Ayam Kari";
        } else if (makanan == 4) {
            namaMakanan = "Nasi Ayam Rica-rica";
        } else {
            namaMakanan = "Nasi Ayam Gulai";
        }

        if (minuman == 1) {
            namaMinuman = "Es teh manis";
        } else if (minuman == 2) {
            namaMinuman = "Teh hangat";
        } else if (minuman == 3) {
            namaMinuman = "Es Jeruk";
        } else if (minuman == 4) {
            namaMinuman = "Jeruk hangat";
        } else {
            namaMinuman = "Air mineral";
        }
        System.out.print(
                "Makanan yang anda pilih adalah " + namaMakanan + " dan minuman yang dipilih adalah " + namaMinuman);
        System.out.println("");
    }

    private static void listMenu() {
        System.out.println("~~~ Selamat datang di warung ayam kami ~~~");
        System.out.println("Menu Makanan (masukkan angka 1-5): ");
        System.out.println("1. Nasi Ayam goreng");
        System.out.println("2. Nasi Ayam bakar");
        System.out.println("3. Nasi Ayam kari");
        System.out.println("4. Nasi Ayam rica-rica");
        System.out.println("5. Nasi Ayam gulai");

        System.out.println("Menu Minuman:");
        System.out.println("1. Es teh manis");
        System.out.println("2. Teh hangat");
        System.out.println("3. Es Jeruk");
        System.out.println("4. Jeruk Hangat");
        System.out.println("5. Air Mineral");
    }
}

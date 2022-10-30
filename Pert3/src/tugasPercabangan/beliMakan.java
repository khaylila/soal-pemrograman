package tugasPercabangan;

import java.util.Scanner;

public class beliMakan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String namaMakanan;

        System.out.println("~~~Menu makan siang hari ini~~~");
        System.out.println("1. Nasi Kebuli");
        System.out.println("2. Nasi Kuning");
        System.out.println("3. Nasi Goreng");
        System.out.print("Pilih makananmu(1-3):");
        int inputMakanan = scan.nextInt();
        scan.close();
        if (inputMakanan == 1) {
            namaMakanan = "Nasi Kebuli";
        } else if (inputMakanan == 2) {
            namaMakanan = "Nasi Kuning";
        } else if (inputMakanan == 3) {
            namaMakanan = "Nasi Goreng";
        } else {
            namaMakanan = "Tidak Ditemukan!";
        }

        System.out.println("Makanan yang dipilih adalah " + namaMakanan);
    }
}

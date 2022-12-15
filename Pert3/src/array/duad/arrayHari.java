package array.duad;

import java.util.Scanner;

public class arrayHari {
    public static void main(String[] args) {
        String[] namaHari = { "ahad", "senin", "selasa", "rabu", "kamis", "jum'at", "sabtu", "minggu" };
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan hari: ");
        int hari = scan.nextInt();
        while (hari < 0 || hari > 6) {
            System.out.println("Input salah!");
            System.out.print("Masukkan hari: ");
            hari = scan.nextInt();
        }
        System.out.println(namaHari[hari]);
    }

}

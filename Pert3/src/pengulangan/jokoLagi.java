package pengulangan;

import java.util.Scanner;

public class jokoLagi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan harga rumah: ");
        int hargaRumah = scan.nextInt();
        System.out.print("Masukkan jumlah tabungan awal:  ");
        int tabunganAwal = scan.nextInt();
        System.out.print("Masukkan jumlah tabungan tetap tiap bulan: ");
        int jumlahTabungan = scan.nextInt();

        while (tabunganAwal < hargaRumah) {
            System.out.print(tabunganAwal + " ");
            tabunganAwal += jumlahTabungan;
        }
        System.out.println(tabunganAwal);
    }
}

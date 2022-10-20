package pengulangan;

import java.util.Scanner;

public class pratama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hargaRumah = scan.nextInt();
        int tabunganAwal = scan.nextInt();
        int jumlahMenabung = scan.nextInt();

        int loop = ((hargaRumah - tabunganAwal) / jumlahMenabung);
        if ((hargaRumah - tabunganAwal) % jumlahMenabung != 0) {
            loop++;
        }
        System.out.print(tabunganAwal + " ");
        for (int i = 0; i < loop; i++) {
            tabunganAwal += jumlahMenabung;
            System.out.print(tabunganAwal + " ");
        }
    }
}

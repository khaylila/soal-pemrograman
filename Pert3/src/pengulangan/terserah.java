package pengulangan;

import java.util.Scanner;

public class terserah {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maksimalBulan = scan.nextInt();
        int tabunganAwal = scan.nextInt();
        int jumlahTabungan = scan.nextInt();

        // while (maksimalBulan > 0) {
        // tabunganAwal += jumlahTabungan;
        // System.out.print(tabunganAwal + " ");
        // maksimalBulan--;
        // }

        System.out.print(tabunganAwal + " ");
        for (int faufaufaufaufau = 1; faufaufaufaufau <= maksimalBulan; faufaufaufaufau++) {
            tabunganAwal += jumlahTabungan;
            System.out.print(tabunganAwal + " ");
        }

    }
}

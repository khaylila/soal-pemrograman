package pengulangan;

import java.util.Scanner;

public class segitiga {
    public static void main(String[] args) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~Program membuat segitiga sama kaki~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Masukkan jumlah baris, contoh 3");
        System.out.println("maka output yang keluar adalah");
        System.out.println("      *      ");
        System.out.println("     * *     ");
        System.out.println("    * * *    ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("Masukkan jumlah baris: ");
        Scanner scan = new Scanner(System.in);
        int tingkatan = scan.nextInt();
        int deretSamping = (tingkatan * 2) - 1;
        int ceil = (int) Math.ceil(deretSamping / 2.0);
        for (int i = 0; i < tingkatan; i++) {
            for (int j = 1; j <= deretSamping; j++) {
                if ((j >= (ceil - i) && j <= (ceil + i)) || j == ceil) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}

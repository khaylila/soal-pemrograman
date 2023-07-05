import java.util.Scanner;

/**
 * Pemilu
 */
public class Pemilu {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan Banyak Kandidat: ");
        int kandidat = Integer.parseInt(scan.next());

        int[] listKandidat = new int[kandidat];
        int[] terbesar = new int[2];

        for (int i = 0; i < listKandidat.length; i++) {
            System.out.print("Kandidat ke-" + (i + 1) + ": ");
            listKandidat[i] = Integer.parseInt(scan.next());

            if (listKandidat[i] > terbesar[1]) {
                terbesar[0] = i;
                terbesar[1] = listKandidat[i];
            }
        }

        System.out.println(
                "Kandidat ke " + (terbesar[0] + 1) + " adalah kandidat terbesar dengan " + terbesar[1] + " suara");
    }
}
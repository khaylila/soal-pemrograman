import java.util.Scanner;

public class Pangkat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Bilangan Pertama: ");
        int bilanganSatu = Integer.parseInt(scan.next());
        System.out.print("Masukkan Bilangan Kedua: ");
        int bilanganDua = Integer.parseInt(scan.next());
        int jumlah = pangkat(bilanganSatu, bilanganDua) + pangkat(bilanganDua,
                bilanganSatu);
        System.out.println("Hasilnya: " + jumlah);
    }

    private static int pangkat(int x, int y) {
        int i = 1, hasil = x;
        while (i <= y) {
            // System.out.println(hasil);
            if (i != 1) {
                hasil *= x;
            }
            i++;
        }
        return hasil;
    }
}

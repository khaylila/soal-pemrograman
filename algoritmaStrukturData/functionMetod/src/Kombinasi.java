import java.util.Scanner;

public class Kombinasi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = Integer.parseInt(scan.next());
        System.out.print("Masukkan nilai r: ");
        int r = Integer.parseInt(scan.next());
        scan.close();

        Integer kombinasi = faktorial(n) / (faktorial(n - r) * faktorial(r));
        System.out.println("Hasil kombinasi adalah " + kombinasi);
    }

    private static int faktorial(int n) {
        // int hasil = 0;
        int hasil = (n == 1) ? 1 : n * faktorial(n - 1);
        // if (n == 1) {
        // hasil = 1;
        // } else {
        // hasil = n * faktorial(n - 1);
        // }
        return hasil;
    }
}

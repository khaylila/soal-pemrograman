package gbtugas;

public class Diskon {
    public static void main(String[] args) {
        int angka = 1;
        // int i = 0;
        while (true) {
            if (angka % 3 == 0) {
                System.out.print("X ");
            } else {
                System.out.print(angka + " ");
            }
            angka++;
        }
    }
}
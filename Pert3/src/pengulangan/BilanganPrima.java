package pengulangan;

import java.util.Scanner;

public class BilanganPrima {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("~~~~Program menentukan bilangan prima/bukan~~~~");
        System.out.print("Masukkan batas maksimal bilangan: ");
        int batasBilangan = scan.nextInt();

        // int temp = 0;
        for (int i = 1; i <= batasBilangan; i++) {
            int temp = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    temp++;
                }
            }
            if (temp > 2) {
                System.out.println("Bilangan " + i + " bukan  bilangan prima.");
            } else {
                System.out.println("Bilangan " + i + " adalah bilangan prima.");
            }
            // temp = 0;
        }
    }
}

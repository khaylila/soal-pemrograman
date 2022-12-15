package pertSepuluh.tugas;

import java.util.Scanner;

public class Dua {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jumlah huruf maksimal: ");
        int maxLength = scan.nextInt();
        scan.nextLine();
        int x = 0;
        String sentence = "";
        int xx = 0;
        while (x <= maxLength) {
            if (xx > 0) {
                System.out.println("Kata terlalu pendek!");
            }
            System.out.print("Masukkan kata anda: ");
            sentence = scan.nextLine();
            x = sentence.length();
            xx++;
        }
        String cropSentence = "";
        for (int i = 0; i < maxLength; i++) {
            cropSentence += sentence.charAt(i);
        }
        System.out.println("huruf anda setelah dipotong '" + cropSentence + "'");
    }
}

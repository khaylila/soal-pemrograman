package tugasPercabangan;

import java.util.Scanner;

public class apel {
    public static void main(String[] args) {

        String namaBuah;
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan nama 'apel' tanpa tanda petik : ");
        namaBuah = scan.nextLine();
        if (namaBuah.equals("apel")) {
            System.out.println("Sukses! :d");
        }
        // System.out.println(namaBuah + (namaBuah.equals("apel")));
    }

}

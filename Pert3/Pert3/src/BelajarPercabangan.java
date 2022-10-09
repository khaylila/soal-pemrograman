import java.util.Scanner;

public class BelajarPercabangan {
    public static void main(String[] args) {
        // if
        // int x = 20;

        // if (x == 20) {
        // System.out.println("Nilai lebih dari 20");
        // } else {
        // System.out.println("Bukan");
        // }

        // ifelse
        // int belanja = 0;
        // Scanner scan = new Scanner(System.in);
        // System.out.print("Masukkan nominal belanja Rp");
        // belanja = scan.nextInt();
        // scan.close();

        // if (belanja >= 100000) {
        // System.out.println("Dapat Hadiah");
        // } else {
        // System.out.println("Belum Beruntung");
        // }

        // int nilai;
        // String nama;
        // Scanner scan = new Scanner(System.in);
        // System.out.print("Masukkan Nama :");
        // nama = scan.nextLine();
        // System.out.print("Masukkan Nilai :");
        // nilai = scan.nextInt();
        // scan.close();

        // if (nilai > 70) {
        // System.out.println("Lulus");
        // } else {
        // System.out.println("Mengulang");
        // }

        // nestedif
        // int nilai;
        // String grade;
        // Scanner scan = new Scanner(System.in);
        // System.out.print("Masukkan nilai kamu : ");
        // nilai = scan.nextInt();
        // scan.close();

        // if (nilai >= 90) {
        // grade = "A";
        // } else if (nilai >= 80) {
        // grade = "B+";
        // } else if (nilai >= 70) {
        // grade = "B";
        // } else if (nilai >= 60) {
        // grade = "C+";
        // } else if (nilai >= 50) {
        // grade = "C";
        // } else {
        // grade = "E";
        // }

        // System.out.println("Grade: " + grade);

        // switchCase
        String warnaLampu;
        System.out.print("Masukkan Lampu : ");
        Scanner scan = new Scanner(System.in);
        warnaLampu = scan.nextLine();
        scan.close();

        switch (warnaLampu) {
            case "merah":
                System.out.println("Berhenti");
                // break;
            case "kuning":
                System.out.println("Gasss!");
                // break;
            case "hijau":
                System.out.println("Jalan");
                // break;
            default:
                System.out.println("Warna tidak ditemukan!");
                // break;
        }
    }

}

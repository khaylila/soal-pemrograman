import java.util.Scanner;

public class exceptionSatu {
    public static void main(String[] args) {
        int bilangan = 12345, hasil = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Bilangan awal adalah " + bilangan);
        System.out.print("masukkan bilangan pembagi: ");
        int bilanganPembagi = Integer.parseInt(scan.nextLine());
        scan.close();
        try {
            hasil = bilangan / bilanganPembagi;
        } catch (Exception e) {
            System.out.println("bilangan tidak boleh 0");
        }
        System.out.println("hasil pembagian adalah " + hasil);
    }
}

// jadi exception akan berjalan jika program tersebut mengalami error, langkah
// pertama adalah pada syntax try, itu akan mencoba terlebih dahulu, jika error,
// maka error tersebut akan ditangkap oleh syntax catch
// pada program tersebut, angka berapapun tidak dapat dibagi dengan 0, maka jika
// user menginput 0, maka program akan langsung error dan berhenti. tetapi jika
// menggunakan exception/try catch maka user akan mendapatkan info jika bilangan
// tersebut tidak dapat dibagi dengan angka 0, dan program masih berjalan sama
// seperti user menginput bilangan bukan 0

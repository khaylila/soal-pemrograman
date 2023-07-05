// Mochamad Roiyan Rintiarno
// 09020622033

// Buatlah program yang menghasilkan tata cara sholat fardhu.
// Input : Jumlah Rakaat
// Output : Tata Cara Sholat dari Takbir sampai Salam

// Contoh :
// Input : 2
// Output : Niat
// Takbirotul ihram (takbir pertama)
// Membaca surat Al-Fatihah
// Rukuk
// I'tidal
// Sujud
// Duduk di antara dua sujud
// Sujud
// Berdiri
// Membaca surat Al-Fatihah
// Rukuk
// I'tidal
// Sujud
// Duduk di antara dua sujud
// Sujud
// Duduk tasyahud akhir
// Membaca doa tasyahud akhir
// Membaca shalawat Nabi Muhammad SAW
// Salam

import java.util.Scanner;

public class RukunSholat {
    public static void main(String[] args) {
        // inisialisasi scanner
        Scanner scan = new Scanner(System.in);
        while (true) {
            // inisialisasi variabel rakaat
            System.out.print("Masukkan Jumlah Rakaat: ");
            Integer rakaat = Integer.parseInt(scan.next());

            if (rakaat > 1 && rakaat <= 4) {
                print(new String[] { "Tata Cara Sholat dari Takbir sampai Salam:" }, false);
                for (int i = 1; i <= rakaat; i++) {
                    print(new String[] { "Rakaat " + i }, false);
                    if (i == 1) {
                        rakaatPertama();
                    } else {
                        gerakanBerdiri();
                    }
                    gerakanReguler();
                    if (i == 2 && rakaat > 2) {
                        gerakanTasyahudAwal();
                    }
                }
                gerakanRakaatTerakhir();
            } else {
                System.out.println("Rakaat tidak sesuai");
            }
        }

    }

    private static void print(String[] messages, boolean useArrow) {
        for (String message : messages) {
            System.out.println((useArrow ? "=> " : "") + message);
        }
    }

    private static void rakaatPertama() {
        String[] array = {
                "Niat",
                "Takbirotul ihram (takbir pertama)",
        };
        print(array, true);
    }

    private static void gerakanReguler() {
        String[] array = {
                "Membaca surat Al-Fatihah",
                "Rukuk",
                "I'tidal",
                "Sujud",
                "Duduk di antara dua sujud",
                "Sujud"
        };
        print(array, true);
    }

    private static void gerakanBerdiri() {
        String[] array = {
                "Berdiri",
        };
        print(array, true);
    }

    private static void gerakanTasyahudAwal() {
        String[] array = {
                "Duduk tasyahud awal",
        };
        print(array, true);
    }

    private static void gerakanRakaatTerakhir() {
        String[] array = {
                "Duduk tasyahud akhir",
                "Membaca doa tasyahud akhir",
                "Membaca shalawat Nabi Muhammad SAW",
                "Salam"
        };
        print(array, true);
    }
}

import java.util.Scanner;

public class Terserah {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // variabel
        int bulan = 0, tahun, jumlahHari = 0;
        String namaBulan = "";
        boolean kabisat = false;
        // mengambil bulan
        System.out.print("Masukkan bulan (1-12) : ");
        bulan = scan.nextInt();
        // mengecek bulan apakah valid
        // ini kalo nilai bulan nggaka valid
        if (bulan > 12 || bulan < 1) {
            System.out.println("Maksimal bulan adalah 12");
        } else {
            // mengambil nilai tahun
            System.out.println("Masukkan tahun (Maksimal 2022) : ");
            tahun = scan.nextInt();
            // mengecek nilai tahun
            // ini kalo nilai tahun nggaka valid
            if (tahun > 2022) {
                System.out.print("Maksimal tahun adalah 2022");
            } else {

                // proses
                // 1. tahun kabisat apa enggak
                // 2. jumlah hari

                // if (tahun % 4 == 0) {
                // // tahun itu tahun kabisat

                // } else {
                // // bukan tahun kabisat
                // }

                if (tahun % 100 == 0) {
                    if (tahun % 400 == 0) {
                        kabisat = true;
                    } else {
                        kabisat = false;
                    }
                } else if (tahun % 4 == 0) {
                    kabisat = true;
                } else {
                    kabisat = false;
                }

                if (bulan == 1 || bulan == 3 || bulan == 5 || bulan == 7 || bulan == 8 || bulan == 10 || bulan == 12) {
                    jumlahHari = 31;
                    if (bulan == 1) {
                        namaBulan = "Januari";
                    } else if (bulan == 3) {
                        namaBulan = "Maret";
                    } else if (bulan == 5) {
                        namaBulan = "Mei";
                    } else if (bulan == 7) {
                        namaBulan = "Juli";
                    } else if (bulan == 8) {
                        namaBulan = "Agustus";
                    } else if (bulan == 10) {
                        namaBulan = "Oktober";
                    } else {
                        namaBulan = "Desember";
                    }
                } else if (bulan == 2) {
                    namaBulan = "Februari";
                    if (kabisat == true) {
                        jumlahHari = 29;
                    } else {
                        jumlahHari = 28;
                    }
                } else {
                    jumlahHari = 30;
                    if (bulan == 4) {
                        namaBulan = "April";
                    } else if (bulan == 6) {
                        namaBulan = "Juni";
                    } else if (bulan == 9) {
                        namaBulan = "September";
                    } else {
                        namaBulan = "November";
                    }
                }

                System.out.println("Bulan " + namaBulan + " tahun " + tahun + ", sebanyak " + jumlahHari + " hari.");
            }
        }
    }
}

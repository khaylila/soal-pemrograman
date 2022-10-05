package tugasPercabangan;

import java.util.Scanner;

public class getBulan {
    public static void main(String[] args) {
        int urutanBulan = 0;
        String bulan;
        Scanner scan = new Scanner(System.in);
        System.out.println("~~~~~Program mencari nama bulan~~~~~");
        System.out.print("Masukkan urutan bulan(1-12):");
        urutanBulan = scan.nextInt();
        switch (urutanBulan) {
            case 1:
                bulan = "Januari";
                break;
            case 2:
                bulan = "Februari";
                break;
            case 3:
                bulan = "Maret";
                break;
            case 4:
                bulan = "April";
                break;
            case 5:
                bulan = "Mei";
                break;
            case 6:
                bulan = "Juni";
                break;
            case 7:
                bulan = "Juli";
                break;
            case 8:
                bulan = "Agustus";
                break;
            case 9:
                bulan = "September";
                break;
            case 10:
                bulan = "Oktober";
                break;
            case 11:
                bulan = "November";
                break;
            case 12:
                bulan = "Desember";
                break;
            default:
                bulan = "Tidak ditemukan";
                break;
        }
        System.out.println("Urutan bulan ke " + urutanBulan + " adalah bulan " + bulan);
    }
}

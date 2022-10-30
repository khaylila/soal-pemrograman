package gbtugas;

import java.util.Scanner;

public class Chou {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Jumlah bulan/periode: ");
        int jumlahBulan = scan.nextInt();

        int months[] = new int[jumlahBulan];
        String[] alpha = {
                "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u",
                "v", "w", "x", "y", "z"
        };
        for (int i = 0; i < months.length; i++) {
            System.out.print(
                    (i > 25 ? alpha[(i / 25) - 1] + alpha[(i % 25) - 1]
                            : alpha[i]) + ". Data penjualan bulan ke-" + (i + 1) + ": ");
            months[i] = scan.nextInt();
        }
        System.out.println("Data yang telah anda inputkan adalah: ");
        for (int i = 0; i < months.length; i++) {
            System.out.println(
                    (i > 25 ? alpha[(i / 25) - 1] + alpha[(i % 25) - 1]
                            : alpha[i]) + ". Data penjualan bulan ke-" + (i + 1) + ": " + months[i]);
        }
        // peramalan 2 bulan
        if (jumlahBulan >= 2) {
            System.out.println("Peramalan 2 Bulan:");
            int rataRataRelativeDeviationPeriodeDuaBulan = 0;
            for (int i = 0; i <= months.length; i++) {
                if (i >= 2) {
                    int dataPeramalan = (int) Math.round((months[i - 2] + months[i - 1]) / 2.0);
                    if (i == months.length) {
                        System.out.println(((i - 2) > 25 ? alpha[((i - 2) / 25) - 1] + alpha[((i - 2) % 25) - 1]
                                : alpha[i - 2]) + ". Data bulan ke-" + (i + 1)
                                + " | unit terjual = ??? | Data Peramalan = "
                                + dataPeramalan + " Relative Deviation = ???");
                    } else {
                        int selisihBulanDenganPeramalan = Math.abs(months[i] - dataPeramalan);
                        int relativeDeviation = (int) Math
                                .round((double) selisihBulanDenganPeramalan / months[i] * 100);
                        // output
                        System.out.println(((i - 2) > 25 ? alpha[((i - 2) / 25) - 1] + alpha[((i - 2) % 25) - 1]
                                : alpha[i - 2]) + ". Data bulan ke-" + (i + 1) + " | unit terjual = " + months[i]
                                + " | Data Peramalan = " + dataPeramalan + " Relative Deviation = " + relativeDeviation
                                + "%");
                        rataRataRelativeDeviationPeriodeDuaBulan += relativeDeviation;
                    }
                }
            }
            rataRataRelativeDeviationPeriodeDuaBulan = (int) Math
                    .round(rataRataRelativeDeviationPeriodeDuaBulan / (double) (months.length - 2));
            System.out.println(
                    ((months.length - 1) > 25
                            ? alpha[((months.length - 1) / 25) - 1] + alpha[((months.length - 1) % 25) - 1]
                            : alpha[(months.length - 1)]) + ". Total Relative Deviation untuk orde 2 adalah : "
                            + rataRataRelativeDeviationPeriodeDuaBulan + "%");
        } else {
            System.out.println("Jumlah bulan tidak sesuai, masukkan minimal 2");
        }
        // peramalan 3 bulan
        System.out.println("Peramalan 3 bulan:");
        if (jumlahBulan >= 3) {
            int rataRataRelativeDeviationPeriodeTigaBulan = 0;
            for (int i = 0; i <= months.length; i++) {
                if (i >= 3) {
                    int dataPeramalan = (int) Math.round((months[i - 3] + months[i - 2] + months[i - 1]) / 3.0);
                    if (i == months.length) {
                        System.out.println(((i - 3) > 25 ? alpha[((i - 3) / 25) - 1] + alpha[((i - 3) % 25) - 1]
                                : alpha[i - 3]) + ". Data bulan ke-" + (i + 1)
                                + " | unit terjual = ??? | Data Peramalan = "
                                + dataPeramalan + " Relative Deviation = ???");
                    } else {
                        int selisihBulanDenganPeramalan = Math.abs(months[i] - dataPeramalan);
                        int relativeDeviation = (int) Math
                                .round((double) selisihBulanDenganPeramalan / months[i] * 100);
                        // output
                        System.out.println(((i - 3) > 25 ? alpha[((i - 3) / 25) - 1] + alpha[((i - 3) % 25) - 1]
                                : alpha[i - 3]) + ". Data bulan ke-" + (i + 1) + " | unit terjual = " + months[i]
                                + " | Data Peramalan = " + dataPeramalan + " Relative Deviation = " + relativeDeviation
                                + "%");
                        rataRataRelativeDeviationPeriodeTigaBulan += relativeDeviation;
                    }
                }
            }
            rataRataRelativeDeviationPeriodeTigaBulan = (int) Math
                    .round(rataRataRelativeDeviationPeriodeTigaBulan / (double) (months.length - 3));
            System.out.println(
                    ((months.length - 2) > 25
                            ? alpha[((months.length - 2) / 25) - 1] + alpha[((months.length - 2) % 25) - 1]
                            : alpha[(months.length - 2)]) + ". Total Relative Deviation untuk orde 3 adalah : "
                            + rataRataRelativeDeviationPeriodeTigaBulan + "%");
        } else {
            System.out.println("Jumlah bulan tidak sesuai, masukkan minimal 3");
        }
        // peramalan 4 bulan
        System.out.println("Peramalan 4 bulan:");
        if (jumlahBulan >= 4) {
            int rataRataRelativeDeviationPeriodeEmpatBulan = 0;
            for (int i = 0; i <= months.length; i++) {
                if (i >= 4) {
                    int dataPeramalan = (int) Math
                            .round((months[i - 4] + months[i - 3] + months[i - 2] + months[i - 1]) / 4.0);
                    if (i == months.length) {
                        System.out.println(((i - 4) > 25 ? alpha[((i - 4) / 25) - 1] + alpha[((i - 4) % 25) - 1]
                                : alpha[i - 4]) + ". Data bulan ke-" + (i + 1)
                                + " | unit terjual = ??? | Data Peramalan = "
                                + dataPeramalan + " Relative Deviation = ???");
                    } else {
                        int selisihBulanDenganPeramalan = Math.abs(months[i] - dataPeramalan);
                        int relativeDeviation = (int) Math
                                .round((double) selisihBulanDenganPeramalan / months[i] * 100);
                        // output
                        System.out.println(((i - 4) > 25 ? alpha[((i - 4) / 25) - 1] + alpha[((i - 4) % 25) - 1]
                                : alpha[i - 4]) + ". Data bulan ke-" + (i + 1) + " | unit terjual = " + months[i]
                                + " | Data Peramalan = " + dataPeramalan + " Relative Deviation = " + relativeDeviation
                                + "%");
                        rataRataRelativeDeviationPeriodeEmpatBulan += relativeDeviation;
                    }
                }
            }
            rataRataRelativeDeviationPeriodeEmpatBulan = (int) Math
                    .round(rataRataRelativeDeviationPeriodeEmpatBulan / (double) (months.length - 4));
            System.out.println(
                    ((months.length - 3) > 25
                            ? alpha[((months.length - 3) / 25) - 1] + alpha[((months.length - 3) % 25) - 1]
                            : alpha[(months.length - 3)]) + ". Total Relative Deviation untuk orde 4 adalah : "
                            + rataRataRelativeDeviationPeriodeEmpatBulan + "%");
        } else {
            System.out.println("Jumlah bulan tidak sesuai, masukkan minimal 4");
        }
    }
}

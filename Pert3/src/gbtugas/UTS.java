package gbtugas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import static java.lang.Math.abs;
/**
 *
 * @author INTEL INSIDE
 */

/*
Nama Anggota Kelompok : 
- Baiq Laila Alfila (100)
- Mohamad Ivan Saputra (115)
- Nadin Isna Monica (118)
- Yabes Christian Matondang (130)
*/

/**
 *
 * @author INTEL INSIDE
 */
public class UTS {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean loop = true;
        float rd2 = 0;
        float rd3 = 0;
        float rd4 = 0;
        float akhirRd = 0;
        float[] arryLastPeramalan = new float[3];
        while (loop) {
            System.out.print("Masukkan Jumlah bulan/periode: ");
            int jumlahBulan = scan.nextInt();
            int months[] = new int[jumlahBulan];
            String[] alphabet = {
                    "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
                    "u", "v", "w", "x", "y", "z"
            };
            for (int i = 0; i < months.length; i++) {
                System.out.print(alphabet[i] + ". Data penjualan bulan ke-" + (i + 1) + ": ");
                months[i] = scan.nextInt();
            }

            System.out.println("Data yang telah anda inputkan adalah: ");
            for (int i = 0; i < months.length; i++) {
                System.out.println(alphabet[i] + ". Data penjualan bulan ke-" + (i + 1) + ": " + months[i]);
            }

            // peramalan 2 bulan
            System.out.println("=====================================================");
            if (jumlahBulan >= 2) {
                System.out.println("Peramalan 2 Bulan:");

                for (int i = 0; i <= months.length; i++) {
                    if (i >= 2) {
                        float dataPeramalan = (float) ((months[i - 2] + months[i - 1]) / 2.0);
                        if (i == months.length) {
                            System.out.println(alphabet[i - 2] + ". Data bulan ke-" + (i + 1)
                                    + " | unit terjual = ??? | Data Peramalan = " + dataPeramalan
                                    + " Relative Deviation = ???");
                            arryLastPeramalan[0] = dataPeramalan;
                        } else {
                            float selisihBulanDenganPeramalan = Math.abs(months[i] - dataPeramalan);
                            float relativeDeviation = (float) (selisihBulanDenganPeramalan / months[i] * 100);
                            System.out.println(alphabet[i - 2] + ". Data bulan ke-" + (i + 1) + " | unit terjual = "
                                    + months[i] + " | Data Peramalan = " + dataPeramalan + " Relative Deviation = "
                                    + relativeDeviation + "%");
                            rd2 += relativeDeviation;
                        }
                    }
                }
                rd2 = (float) (rd2 / (float) (months.length - 2));
                System.out.println(alphabet[(months.length - 1)] + ". Total Relative Deviation untuk orde 2 adalah : "
                        + rd2 + "%");
            } else {
                System.out.println("Jumlah bulan tidak sesuai, masukkan minimal 2");
            }

            // peramalan 3 bulan
            System.out.println("=====================================================");
            System.out.println("Peramalan 3 bulan:");
            if (jumlahBulan >= 3) {

                for (int i = 0; i <= months.length; i++) {
                    if (i >= 3) {
                        float dataPeramalan = (float) ((months[i - 3] + months[i - 2] + months[i - 1]) / 3.0);
                        if (i == months.length) {
                            System.out.println(alphabet[i - 3] + ". Data bulan ke-" + (i + 1)
                                    + " | unit terjual = ??? | Data Peramalan = " + dataPeramalan
                                    + " Relative Deviation = ???");
                            arryLastPeramalan[1] = dataPeramalan;
                        } else {
                            float selisihBulanDenganPeramalan = Math.abs(months[i] - dataPeramalan);
                            float relativeDeviation = (float) (selisihBulanDenganPeramalan / months[i] * 100);
                            System.out.println(alphabet[i - 3] + ". Data bulan ke-" + (i + 1) + " | unit terjual = "
                                    + months[i] + " | Data Peramalan = " + dataPeramalan + " Relative Deviation = "
                                    + relativeDeviation + "%");
                            rd3 += relativeDeviation;
                        }
                    }
                }
                rd3 = (float) (rd3 / (float) (months.length - 3));
                System.out.println(alphabet[(months.length - 2)] + ". Total Relative Deviation untuk orde 3 adalah : "
                        + rd3 + "%");
            } else {
                System.out.println("Jumlah bulan tidak sesuai, masukkan minimal 3");
            }

            // peramalan 4 bulan
            System.out.println("=====================================================");
            System.out.println("Peramalan 4 bulan:");
            if (jumlahBulan >= 4) {

                for (int i = 0; i <= months.length; i++) {
                    if (i >= 4) {
                        float dataPeramalan = (float) ((months[i - 4] + months[i - 3] + months[i - 2] + months[i - 1])
                                / 4.0);
                        if (i == months.length) {
                            System.out.println(alphabet[i - 4] + ". Data bulan ke-" + (i + 1)
                                    + " | unit terjual = ??? | Data Peramalan = " + dataPeramalan
                                    + " Relative Deviation = ???");
                            arryLastPeramalan[2] = dataPeramalan;
                        } else {
                            float selisihBulanDenganPeramalan = Math.abs(months[i] - dataPeramalan);
                            float relativeDeviation = (float) (selisihBulanDenganPeramalan / months[i] * 100);
                            System.out.println(alphabet[i - 4] + ". Data bulan ke-" + (i + 1) + " | unit terjual = "
                                    + months[i] + " | Data Peramalan = " + dataPeramalan + " Relative Deviation = "
                                    + relativeDeviation + "%");
                            rd4 += relativeDeviation;
                        }
                    }
                }
                rd4 = (float) (rd4 / (float) (months.length - 4));
                System.out.println(alphabet[(months.length - 3)] + ". Total Relative Deviation untuk orde 4 adalah : "
                        + rd4 + "%");
            }

            akhirRd = rd2;
            if (akhirRd > rd3) {
                akhirRd = rd3;
            } else if (akhirRd > rd4) {
                akhirRd = rd4;
            }

            if (akhirRd == rd2) {
                System.out.println("Karena Nilai Relative Deviation yang terkecil adalah yang Orde 2 Bulan - Yaitu "
                        + rd2
                        + " - maka yang dipilih adalah data peramalan dengan orde 2 bulan . Dengan demikian pada bulan ke-"
                        + (months.length + 1) + " jumlah unit yang terjual diperkirakan sejumlah "
                        + arryLastPeramalan[0] + " unit.");
            } else if (akhirRd == rd3) {
                System.out.println("Karena Nilai Relative Deviation yang terkecil adalah yang Orde 3 Bulan - Yaitu "
                        + rd3
                        + " - maka yang dipilih adalah data peramalan dengan orde 3 bulan . Dengan demikian pada bulan ke-"
                        + (months.length + 1) + " jumlah unit yang terjual diperkirakan sejumlah "
                        + arryLastPeramalan[1] + " unit.");
            } else {
                System.out.println("Karena Nilai Relative Deviation yang terkecil adalah yang Orde 4 Bulan - Yaitu "
                        + rd4
                        + " - maka yang dipilih adalah data peramalan dengan orde 4 bulan . Dengan demikian pada bulan ke-"
                        + (months.length + 1) + " jumlah unit yang terjual diperkirakan sejumlah "
                        + arryLastPeramalan[2] + " unit.");
            }

            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Anda ingin keluar:");
            System.out.println("1. Ya");
            System.out.println("2. Tidak");
            int out = scan.nextInt();
            if (out == 1) {
                System.out.println("Anda memilih keluar!");
                System.out.println("Terima kasih!");
                loop = false;
            }
        }
    }
}

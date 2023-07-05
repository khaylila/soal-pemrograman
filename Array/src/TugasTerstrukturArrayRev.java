// Rev 2.0 Change array from one to two dimensions

import java.util.Scanner;

public class TugasTerstrukturArrayRev {
    public static void main(String[] args) {
        // inisialisasi variabel lainnya
        Integer tempNilai = -1, totalNilai = 0;
        // inisialisasi scanner
        Scanner scan = new Scanner(System.in);
        // input jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa: ");
        Integer jumlahMahasiswa = Integer.parseInt(scan.next());
        // inisialisasi array
        String[][] listMahasiswa = new String[jumlahMahasiswa][2];
        // imput nama dan nilai mahasiswa
        for (int i = 0; i < listMahasiswa.length; i++) {
            System.out.println("Mahasiswa ke " + (i + 1));
            System.out.print("Masukkan nama: ");
            listMahasiswa[i][0] = scan.next();
            // inialisasi countError
            Integer countError = 0;
            while (tempNilai < 0 || tempNilai > 100) {
                if (countError > 0) {
                    // jika error lebih dari 0
                    System.out.println("Nilai tidak sesuai.");
                }
                // merubah string kedalam integer
                System.out.print("Masukkan nilai: ");
                tempNilai = Integer.parseInt(scan.next());
                // increment error
                countError++;
            }
            // merubah kembali integer kedalam string
            listMahasiswa[i][1] = Integer.toString(tempNilai);
            // menambahkan nilai kedalam total nilai
            totalNilai += tempNilai;
            // mengubah nilai kedalam nilai awal
            tempNilai = -1;
        }
        // inisialisasi rata-rata
        Double nilaiMean = totalNilai / Double.valueOf(jumlahMahasiswa);
        // Menampilkan rata-rata
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Rata-rata dari ke-" + jumlahMahasiswa + " mahasiswa tersebut adalah " + nilaiMean);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        // print mahasiswa yang nilainya diatas rata-rata
        System.out.println("Nilai mahasiswa yang berada diatas rata-rata:");
        int index = 1;
        for (int i = 0; i < listMahasiswa.length; i++) {
            tempNilai = Integer.parseInt(listMahasiswa[i][1]);
            if (tempNilai > nilaiMean) {
                System.out.println(index++ + ". " + listMahasiswa[i][0] + " dengan nilai " + tempNilai);
            }
        }
    }
}

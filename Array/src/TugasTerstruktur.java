import java.util.Scanner;

public class TugasTerstruktur {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = Integer.parseInt(scan.next());

        String[] listMahasiswa = new String[jumlahMahasiswa];
        int[] listNilai = new int[jumlahMahasiswa];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            System.out.print("Nama mahasiswa: ");
            listMahasiswa[i] = scan.next();
            System.out.print("Nilai mahasiswa: ");
            int j = 0;
            while (listNilai[i] <= 0 || listNilai[i] >= 100) {
                if (j != 0) {
                    System.out.println("Masukkan tidak sesuai (0-100)!");
                }
                listNilai[i] = Integer.parseInt(scan.next());
                j++;
            }
        }
        int rataRataNilai = 0;
        for (int i = 0; i < listNilai.length; i++) {
            rataRataNilai += listNilai[i];
        }
        rataRataNilai /= listNilai.length;

        System.out.println("~~~~~~~~~~~~~~~~~~~");
        System.out.println("Nilai rata-rata mahasiswa adalah " + rataRataNilai);
        System.out.println("~~~~~~~~~~~~~~~~~~~");

        int[] nilaiDiatasRataRata = new int[jumlahMahasiswa];
        for (int i = 0; i < listNilai.length; i++) {
            if (listNilai[i] > rataRataNilai) {
                nilaiDiatasRataRata[i] = i;
            }
        }

        System.out.println("Mahasiswa yang diatas rata-rata:");

        int countNilaiRataRata = 0;
        for (int i = 0; i < nilaiDiatasRataRata.length; i++) {
            if (nilaiDiatasRataRata[i] != 0) {
                System.out.println(listMahasiswa[i] + " dengan nilai " + listNilai[i]);
                countNilaiRataRata++;
            }
        }
        if (countNilaiRataRata == 0) {
            System.out.println("Tidak ada!");
        }
    }
}

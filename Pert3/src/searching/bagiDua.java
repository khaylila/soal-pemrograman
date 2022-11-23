package searching;

import javax.swing.JOptionPane;

public class bagiDua {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan banyak bilangan: "));
        int bilangan[] = new int[n];
        int i;
        int awal;
        int akhir;
        int mid;
        boolean ditemukan;
        for (i = 0; i < n; i++) {
            bilangan[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan bilangan ke " + (i + 1)));
        }

        int bilanganYangDicari = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan bilangan yang dicari: "));
        ditemukan = false;
        awal = 1;
        akhir = n;
        mid = (awal + akhir) / 2;
        do {
            if (bilangan[mid] == bilanganYangDicari) {
                ditemukan = true;
            } else if (bilangan[mid] > bilanganYangDicari) {
                mid = mid - 1;
            } else {
                mid = mid + 1;
            }
        } while (ditemukan == false && awal != akhir);

        if (ditemukan == true) {
            System.out.println("Ditemukan pada indeks ke " + mid);
        } else {
            System.out.println("Tidak ditemukan");
        }
    }
}

package searching;

import javax.swing.JOptionPane;

public class beruntun {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan banyak bilangan: "));

        int bilangan[] = new int[n];
        int i;
        boolean ditemukan;

        for (i = 0; i < n; i++) {
            bilangan[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan bilangan ke " + (i + 1)));
        }

        int bilanganYangDicari = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan bilangan yang dicari: "));

        ditemukan = false;
        i = 0;
        int indeks = 0;

        do {
            System.out.println(i);
            System.out.println(bilangan[i]);
            // System.out.println(bilanganYangDicari);
            if (bilangan[i] == bilanganYangDicari) {
                ditemukan = true;
                indeks = i + 1;
            }
            i++;
        } while (ditemukan == false && i != n);
        if (ditemukan == true) {
            System.out.println("Ditemukan pada indeks ke " + indeks);
        } else {
            System.out.println("Tidak ditemukan");
        }
    }
}

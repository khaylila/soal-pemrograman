package soritng.tiga;

import javax.swing.JOptionPane;

public class noMod {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan banyak bilangan: "));
        int bilangan[] = new int[n];
        int i, j;
        String outputAwal = "";
        String outputAkhir = "";
        for (i = 0; i < n; i++) {
            bilangan[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan bilangan ke: " + (i + 1)));
            outputAwal += bilangan[i] + " ";
        }
        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n - 1; j++) {
                if (bilangan[j] > bilangan[j + 1]) {
                    int temp = bilangan[j];
                    bilangan[j] = bilangan[j + 1];
                    bilangan[j + 1] = temp;
                }
            }
        }
        for (i = 0; i < n; i++) {
            outputAkhir += bilangan[i] + " ";
        }
        JOptionPane.showMessageDialog(null, "Susunan awal: " + outputAwal + "\nSusunan akhir: " + outputAkhir);
    }
}

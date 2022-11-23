package soritng.dua;

import javax.swing.JOptionPane;

public class noMod {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan banyaknya bilangan: "));
        int bilangan[] = new int[n];

        int i, j;
        String outputAwal = "";
        String outputAkhir = "";

        for (i = 0; i < n; i++) {
            bilangan[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan bilangan ke" + (i + 1)));

            outputAwal += bilangan[i] + " ";
        }

        for (i = 0; i < n; i++) {
            for (j = i; j < n; j++) {
                if (bilangan[i] > bilangan[j]) {
                    int temp = bilangan[i];
                    bilangan[i] = bilangan[j];
                    bilangan[j] = temp;
                }
            }
        }
        for (i = 0; i < n; i++) {
            outputAkhir += bilangan[i] + " ";
        }

        JOptionPane.showMessageDialog(null, "Susunan awal: " + outputAwal + "\nSusunan Akhir: " + outputAkhir);
    }
}

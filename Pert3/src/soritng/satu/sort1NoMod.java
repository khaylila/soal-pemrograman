package soritng.satu;

import javax.swing.JOptionPane;

public class sort1NoMod {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan Banyak Bilangan"));
        int bilangan[] = new int[n];

        int i, j;
        String outputAwal = "", outputAkhir = "";

        for (i = 0; i < n; i++) {
            bilangan[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan bilangan ke " + (i + 1)));
            outputAwal += bilangan[i] + " ";
        }
        // proses
        // bilangan = [5,4,3,2,1];
        // i = 1
        // dataSisip = 4
        // j = 0

        // datasisip<bilangan[j] && j<0
        // true{
        // bilangan[j+1] = bilangan[j]
        // j-=1;
        // }false{
        // bilangan[j+1] = 4}
        for (i = 1; i < n; i++) {
            int dataSisip = bilangan[i];
            j = i - 1;
            while (dataSisip < bilangan[j] && j > 0) {
                bilangan[j + 1] = bilangan[j];
                j -= 1;
            }
            bilangan[j + 1] = dataSisip;
        }
        // endproses
        for (i = 0; i < n; i++) {
            outputAkhir += bilangan[i] + " ";
        }
        JOptionPane.showMessageDialog(null, "Susunan awal: " + outputAwal + "\nSusunan akhir: " + outputAkhir);
    }
}

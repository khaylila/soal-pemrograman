package soritng.satu;

import java.util.Arrays;

// import javax.swing.JOptionPane;

public class sort1 {
    public static void main(String[] args) {
        int i, j, bilangan[] = { 1, 4, 2, 3, 5 };
        // for (i = 1; i < 5; i++) {
        // int dataSisip = bilangan[i];
        // j = i - 1;
        // int asdf = 0;
        // j = 3;
        // datasisip = 1
        // j = 3
        // bilangan = [5,4,3,2,1]
        for (i = 1; i < 5; i++) {
            j = i - 1;
            int dataSisip = bilangan[i];
            while (j >= 0 && dataSisip < bilangan[j]) { // 1 < 2 && 3 > 0
                // System.out.println("asdf = " + asdf++);
                // System.out.println("j = " + j);
                bilangan[j + 1] = bilangan[j]; // bilangan[3 + 1] = bilangan[3]
                j -= 1; // j = j - 1
            }
            // bilangan[j + 1] = bilangan[j];
            bilangan[j + 1] = dataSisip;
            // }
        }

        // int i, j, bilangan[] = { 5, 4, 3, 2, 1 };
        // for (i = 1; i < 5; i++) {
        // int dataSisip = bilangan[i];
        // j = i - 1;
        // while (dataSisip < bilangan[j] && j > 0) {
        // bilangan[j + 1] = bilangan[j];
        // j -= 1;
        // }
        // bilangan[j + 1] = dataSisip;
        // }
        // JOptionPane.showMessageDialog(null, "Susunan akhir: " +
        System.out.println(Arrays.toString(bilangan));
        ;

    }
}

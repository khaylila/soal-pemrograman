package soritng.satu;

import java.util.Arrays;

public class sortSatuFix {
    public static void main(String[] args) {
        int[] bilangan = new int[] { 5, 3, 2, 4, 1 };

        for (int i = 1; i < bilangan.length; i++) {
            int dataTemp = bilangan[i];
            int j = i - 1;
            while (j >= 0 && dataTemp < bilangan[j]) {
                bilangan[j + 1] = bilangan[j];
                j -= 1;
            }
            bilangan[j + 1] = dataTemp;
        }

        System.out.println(Arrays.toString(bilangan));
    }
}

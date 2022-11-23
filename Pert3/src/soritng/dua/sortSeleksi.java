package soritng.dua;

import java.util.Arrays;

public class sortSeleksi {
    public static void main(String[] args) {
        int bilangan[] = { 5, 4, 3, 2, 1 };

        for (int i = 0; i < 5 - 1; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (bilangan[i] > bilangan[j]) {
                    int temp = bilangan[i];
                    bilangan[i] = bilangan[j];
                    bilangan[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(bilangan));
    }
}

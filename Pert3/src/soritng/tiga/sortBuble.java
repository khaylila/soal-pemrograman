package soritng.tiga;

import java.util.Arrays;

public class sortBuble {
    public static void main(String[] args) {
        int bilangan[] = { 5, 4, 3, 2, 1 };

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - 1; j++) {
                if (bilangan[j] > bilangan[j + 1]) {
                    int temp = bilangan[j];
                    bilangan[j] = bilangan[j + 1];
                    bilangan[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(bilangan));
    }
}

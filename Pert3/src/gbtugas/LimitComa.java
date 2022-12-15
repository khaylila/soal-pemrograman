package gbtugas;

import java.text.DecimalFormat;

/**
 * LimitComa
 */
public class LimitComa {

    public static void main(String[] args) {
        double a = 11 / 3.0;
        DecimalFormat numbeFormat = new DecimalFormat("#.00");
        System.out.println(numbeFormat.format(a));
    }
}
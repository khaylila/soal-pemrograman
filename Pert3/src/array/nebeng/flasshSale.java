package array.nebeng;

public class flasshSale {
    public static void main(String[] args) {
        double[] harga = new double[5];

        harga[0] = 10000.0;
        harga[1] = 20000.0;
        harga[2] = 30000.0;

        for (int i = 0; i < harga.length; i++) {
            // disskon 20%
            harga[i] -= ((20 / 100.0) * harga[i]);
            // output setelah didiskon
            System.out.println(harga[i]);
        }
    }
}

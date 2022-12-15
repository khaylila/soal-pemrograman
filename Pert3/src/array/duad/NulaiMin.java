package array.duad;

public class NulaiMin {
    public static void main(String[] args) {
        double[][] angka = { { 8.3, 5.1, 9.9 }, { 2.3, 4.5, 7.7 }, { 5.2, 6.1, 2.8 } };
        int n = angka.length;
        int m = angka[0].length;

        double min = 0.0;
        // double max = 0.0;

        min = angka[0][0];
        for (int p = 0; p < m; p++) {
            for (int q = 0; q < n; q++) {
                // System.out.println(p + q);
                if (angka[p][q] < min) {
                    // System.out.println(angka[p][q]);
                    // System.out.println(min);
                    min = angka[p][q];
                }
            }
        }

        System.out.println("Nilai minimum " + min);
    }
}

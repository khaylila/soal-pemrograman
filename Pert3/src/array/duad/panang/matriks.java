package array.duad.panang;

import java.util.Arrays;

public class matriks {
    public static int[][] hitungArray2D(int[][] matriksA, int[][] matriksB) {
        int[][] matriksC = new int[2][2];
        for (int baris = 0; baris < matriksA.length; baris++) {
            for (int kolom = 0; kolom < matriksA[baris].length; kolom++) {
                matriksC[baris][kolom] = matriksA[baris][kolom] + matriksB[baris][kolom];
            }
            // System.out.println("");
        }
        return matriksC;
    }

    public static void cetakArray2D(int[][] myArrays) {
        for (int baris = 0; baris < myArrays.length; baris++) {
            for (int kolom = 0; kolom < myArrays[baris].length; kolom++) {
                System.out.print(myArrays[baris][kolom] + "\t");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int[][] matriksA = { { 2, 8 }, { 4, 6 } };
        int[][] matriksB = { { 3, 1 }, { 5, 4 } };

        // int[][] matriksC = new int[2][2];

        cetakArray2D(matriksA);
        System.out.println("\t+");
        cetakArray2D(matriksB);
        System.out.println("\t=");
        cetakArray2D(hitungArray2D(matriksA, matriksB));
        String asdf = "Lorem Ipsum";
        System.out.println(Arrays.toString(asdf.split(" ")));
    }
}

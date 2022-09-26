import java.util.Scanner;

public class KalkulatorSederhana {
    public static void main(String[] args) {
        double var1, var2, penjumlahan, perkalian, pengurangan, pembagian, modulus;
        var1 = 5;
        var2 = 6;

        penjumlahan = var1 + var2;
        pengurangan = var1 - var2;
        pembagian = var1 / var2;
        perkalian = var1 * var2;
        modulus = var1 % var2;

        System.out.println("Bilangan pertama adalah " + var1);
        System.out.println("Bilangan kedua adalah " + var2);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Penjumlahan bilangan pertama dengan bilangan kedua adalah " + penjumlahan);
        System.out.println("Pengurangan bilangan pertama dengan bilangan kedua adalah " + pengurangan);
        System.out.println("Perkalian bilangan pertama dengan bilangan kedua adalah " + perkalian);
        System.out.println("Pembagian bilangan pertama dengan bilangan kedua adalah " + pembagian);
        System.out.println("Modulus bilangan pertama dengan bilangan kedua adalah " + modulus);
    }
}

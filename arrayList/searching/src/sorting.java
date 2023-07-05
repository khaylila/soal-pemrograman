import java.util.Scanner;

/**
 * sorting
 */
public class sorting {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] listAngka = new int[10];
        // int[] listAngka = { 5, 4, 3, 2, 1 };
        System.out.print("Masukkan angka: ");
        for (int i = 0; i < listAngka.length; i++) {
            listAngka[i] = Integer.parseInt(scan.next());
        }
        for (int i = 1; i < listAngka.length; i++) {
            int dataTemp = listAngka[i];
            int j = i - 1;
            while (j >= 0 && dataTemp < listAngka[j]) {
                listAngka[j + 1] = listAngka[j];
                j -= 1;
            }
            listAngka[j + 1] = dataTemp;
        }
        System.out.println("angka setelah diurutkan:");
        for (int i = 0; i < listAngka.length; i++) {
            System.out.print(listAngka[i] + " ");
        }
    }
}

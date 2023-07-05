import java.util.Scanner;

/**
 * sorting
 */
public class searching {

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
        System.out.println("Angka setelah diurutkan:");
        for (int i = 0; i < listAngka.length; i++) {
            System.out.print(listAngka[i] + " ");
        }

        // searching
        System.out.print("\nMasukkan angka yang ingin dicari: ");
        int inputSearch = Integer.parseInt(scan.next());
        int searchIndex = 0;
        for (int i = 0; i < listAngka.length; i++) {
            if (listAngka[i] == inputSearch && searchIndex == 0) {
                searchIndex = i + 1;
            }
        }
        System.out.println(searchIndex == 0 ? "Angka tidak ditemukan!" : "terdapat pada index ke-" + searchIndex);
    }
}
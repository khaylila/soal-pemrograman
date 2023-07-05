// rev2.0, add "Urutannya adalah " on line 29

import java.util.ArrayList;
import java.util.Scanner;

public class TugasMandiri {
    public static void main(String[] args) {
        System.out.println("~~~Program mengurutkan nilai mahasiswa~~~");
        ArrayList<Integer> listNilai = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);

        int tempNilai = 0;
        while (tempNilai != -1) {
            System.out.print("Masukkan nilai mahasiswa(-1 untuk membatalkan): ");
            tempNilai = Integer.parseInt(scan.next());
            if (tempNilai != -1)
                listNilai.add(tempNilai);
        }

        if (listNilai.isEmpty()) {
            System.out.println("Nilai tidak ditemukan!");
        } else {
            System.out.println("Pilih metode pengurutan:");
            System.out.println("1. Dari yang terbesar");
            System.out.println("2. Dari yang terkecil");
            System.out.print("1/2: ");
            int orderList = Integer.parseInt(scan.next());
            if (orderList == 1 || orderList == 2) {
                System.out.println("Urutannya adalah " + sorting(listNilai, orderList).toString());
            } else {
                System.out.println("Metode tidak ditemukan!");
            }
        }

    }

    private static ArrayList<Integer> sorting(ArrayList<Integer> listNilai, int typeSort) {
        int n = listNilai.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (typeSort == 1 ? listNilai.get(j) < listNilai.get(j + 1) : listNilai.get(j) > listNilai.get(j + 1)) {
                    int temp = listNilai.get(j);
                    listNilai.set(j, listNilai.get(j + 1));
                    listNilai.set(j + 1, temp);
                }
            }
        }
        return listNilai;
    }
}

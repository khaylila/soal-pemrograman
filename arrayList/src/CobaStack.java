import java.util.Scanner;
import java.util.Stack;

public class CobaStack {
    public static void main(String[] args) {
        String nilai = "";
        Scanner scan = new Scanner(System.in);

        // masukkan sampai berapa aja, selain -1
        // kalau -1, berarti berhenti

        // while
        int inputNilai = 0;
        while (inputNilai != -1) {
            inputNilai = scan.nextInt();
            nilai = nilai + inputNilai;
        }
        System.out.println(nilai);
    }
}
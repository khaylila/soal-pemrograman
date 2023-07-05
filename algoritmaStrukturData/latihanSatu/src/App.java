import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Bilangan Awal : ");
        int bilanganAwal = scan.nextInt();
        System.out.print("Bilangan Akhir : ");
        int bilanganAkhir = scan.nextInt();

        String temp = "";
        for(int i = bilanganAwal; i<= bilanganAkhir;i++){
            if (i %2==1){
                temp+= i+" ";
            }
        }
        System.out.println(temp);
    }
}

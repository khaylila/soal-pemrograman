package array;

public class array2d {
    public static void main(String[] args) {
        String kotak[][] = {
                { "Lili", "08111" },
                { "lala", "08122" },
                { "maya", "08133" }
        };
        for (int x = 0; x < kotak.length; x++) {
            System.out.println("Nama: " + kotak[x][0]);
            System.out.println("Nomer: " + kotak[x][1]);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
        }
    }
}

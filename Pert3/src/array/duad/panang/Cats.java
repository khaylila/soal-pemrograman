package array.duad.panang;

public class Cats {
    public static void main(String[] args) {
        String[][] cats = { { "terry", "brown" }, { "kittie", "white" }, { "toby", "gray" }, { "fido", "john" } };
        cetakArray2D(cats);
        System.out.println("");
        String[][] dogs = { { "agus", "bima" }, { "cantika", "devi" }, { "indah", "permai" }, { "finda", "jona" } };
        cetakArray2D(dogs);

        // System.out.println(cats[0][1]);
        // System.out.println(cats[1][0]);

        // for (int baris = 0; baris < 4; baris++) {
        // for (int kolom = 0; kolom < 2; kolom++) {
        // System.out.println(cats[baris][kolom] + "\t");
        // }
        // System.out.println("");
        // }
    }

    public static void cetakArray2D(String[][] myArrays) {
        for (int baris = 0; baris < 4; baris++) {
            for (int kolom = 0; kolom < 2; kolom++) {
                System.out.print(myArrays[baris][kolom] + "\t");
            }
            System.out.println("");
        }
    }
}

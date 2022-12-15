package array.nebeng;

public class coba {
    public static void main(String[] args) {

        // deklarasi Array
        int[] usia = new int[10];

        usia[0] = 20;
        usia[1] = 30;
        usia[2] = 10;
        usia[3] = 11;
        usia[4] = 12;
        usia[5] = 13;
        usia[6] = 14;
        usia[5] = 15;
        usia[6] = 16;
        usia[7] = 17;
        usia[8] = 18;
        usia[9] = 19;
        // mencetak isi array
        for (int i = 0; i < usia.length; i++) {

            System.out.println("anda " + (usia[i] >= 17 ? "sudah" : "belum") + " berKTP");
            // if (usia[i] >= 17)
            // System.out.println("anda sudah berKTP");
            // else
            // System.out.println("anda belum berKTP");

        }
    }
}

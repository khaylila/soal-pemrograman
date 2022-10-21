package belajarMethod;

public class fungsiStatic {
    public static void main(String[] args) {
        minum("Kopi");
        fungsiStatic fs = new fungsiStatic();
        fs.makan("Nasi Goreng");
    }

    public static void minum(String minuman) {
        System.out.println("Saya sedang minum " + minuman);
    }

    public void makan(String makanan) {
        System.out.println("Hi!");
        System.out.println("Saya sedang makan " + makanan);
    }
}

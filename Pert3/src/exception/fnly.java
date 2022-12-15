package exception;

public class fnly {
    public static void main(String[] args) {
        int a[] = new int[5];
        try {
            a[5] = 100;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println("Melebihi batas");
        } finally {
            System.out.println("Selalu keluar");
        }

    }
}

package exception.tugas;

/**
 * percobaan6
 */
public class percobaan6 {
    public static void method1() {
        throw new ArrayIndexOutOfBoundsException("Melebihi Kapasitas");
    }

    public static void main(String[] args) {
        try {
            method1();
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
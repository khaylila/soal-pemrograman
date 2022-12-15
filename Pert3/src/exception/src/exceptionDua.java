public class exceptionDua {
    // percobaan 6

    public static void method1() {
        throw new ArrayIndexOutOfBoundsException("melebihi kapasitas");
    }

    public static void main(String[] args) {
        try {
            method1();
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

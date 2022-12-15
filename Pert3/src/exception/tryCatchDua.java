package exception;

public class tryCatchDua {
    public static void main(String[] args) {
        int bil = 10;
        String b[] = { "a", "b", "c" };
        try {
            System.out.println(bil / 0);
            System.out.println(b[3]);
        } catch (ArithmeticException e) {
            System.out.println("Error Aritmetik");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error kapasitas array melebihi batas");
        } catch (Exception e) {
            System.out.println("Terdapat error");
        }
    }
}

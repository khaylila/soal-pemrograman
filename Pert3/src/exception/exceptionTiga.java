import java.io.FileNotFoundException;

public class exceptionTiga {
    public static void method1() throws FileNotFoundException {
        throw new FileNotFoundException("File tidak ada");
    }

    public static void main(String[] args) {
        try {
            method1();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

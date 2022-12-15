package exception;

import java.io.FileNotFoundException;

public class thrw {
    static void method1() throws FileNotFoundException {
        throw new FileNotFoundException("File tidak ada");
    }

    public static void main(String[] args) {
        try {
            method1();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}

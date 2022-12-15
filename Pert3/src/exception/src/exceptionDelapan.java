import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class exceptionDelapan {
    public static void main(String[] args) throws IOException {
        try {
            File file = new File("Data.txt");
            BufferedReader fileReader;
            fileReader = new BufferedReader(new FileReader(file));
            while (true) {
                String line = fileReader.readLine();
                if (line == null)
                    break;
                System.out.println(line);
            }
            fileReader.close();
        } catch (Exception e) {
            System.out.println("File tidak ditemukan!");
        }
    }
}

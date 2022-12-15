package exception.tugas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class readFile {
    public static void main(String args[]) {
        File file = new File("/home/milea/Documents/pemrogramanDasar/Pert3/src/exception/tugas/data.txt");
        System.out.println(file.canRead());
        BufferedReader fileReader;
        fileReader = new BufferedReader(new FileReader(file));
        while (true) {
            String line = fileReader.readLine();
            if (line == null)
                break;
            System.out.println(line);
        }
    }
}

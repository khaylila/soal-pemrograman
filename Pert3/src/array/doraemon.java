package array;

import java.util.ArrayList;

/**
 * doraemon
 */
public class doraemon {

    public static void main(String[] args) {

        ArrayList kantongAjaib = new ArrayList<>();
        // arr.add("Hujan Truru");
        // System.out.println(arr.get(0));

        // membuat objek array list
        // ArrayList kantongAjaib = new ArrayList();

        // Mengisi kantong ajaib dengan 5 benda
        kantongAjaib.add("Senter Pembesar");
        kantongAjaib.add(532);
        kantongAjaib.add("tikus");
        kantongAjaib.add(1231234.132);
        kantongAjaib.add(true);

        // menghapus tikus dari kantong ajaib
        kantongAjaib.remove("tikus");

        // Menampilkan isi kantong ajaib
        System.out.println(kantongAjaib);

        // menampilkan banyak isi kantong ajaib
        System.out.println("Kantong ajaib berisi " + kantongAjaib.size() + " item");
    }
}
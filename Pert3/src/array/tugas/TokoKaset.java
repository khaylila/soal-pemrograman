package array.tugas;

import java.util.Arrays;
import java.util.Scanner;

public class TokoKaset {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[][] listProduct = {
                { "Sheila on 7 - Subtitle (1999)", "50000" },
                { "Sheila on 7 - Kisah Klasik Untuk Masa Depan (2000)", "60000" },
                { "Sheila on 7 - 07 Des (2002)", "70000" },
                { "Sheila on 7 - Ost. 30 Hari Mencari Cinta (2003)", "80000" },
                { "Sheila on 7 - Pejantan Tangguh (2004)", "90000" },
                { "Sheila on 7 - Jalan Terus (2005)", "95000" },
                { "Sheila on 7 - 507 (2006)", "100000" },
                { "Sheila on 7 - Menentukan Arah (2008)", "110000" },
                { "Sheila on 7 - Berlayar (2011)", "110000" },
                { "Sheila on 7 - Musim Yang Baik (2014)", "120000" },
        };
        int[] products = {};
        boolean loop = true, productAlready = false;
        int temp = 0, hargaBeli = 0;

        System.out.println("~~~ Selamat datang di toko Lihat, Dengar Rasakan ~~~");
        System.out.println("List kaset yang tersedia:");
        for (int i = 1; i <= listProduct.length; i++) {
            System.out.println(i + ". " + listProduct[i - 1][0] + " seharga Rp" + listProduct[i - 1][1]);
        }
        System.out.println("Catatan: barang yang telah dipilih tidak dapat dipilih kembali.");

        while (loop) {
            int count = 0;
            while (temp < 1 || temp > listProduct.length || productAlready == true) {
                if (count > 0) {
                    if (productAlready) {
                        System.out.println("Produk telah dipilih sebelumnya!");
                        productAlready = false;
                    } else {
                        System.out.println("Masukkan tidak sesuai!");
                    }
                }
                System.out.print("Masukkan barang yang akan dipilih(1-" + listProduct.length + "): ");
                temp = scan.nextInt();
                if (productAlready(products, temp)) {
                    productAlready = true;
                }
                count++;
            }
            products = productCheckOut(products, (temp - 1));
            temp = 0;
            System.out.print("Lanjutkan?(y/n): ");
            // https://www.reddit.com/r/learnjava/comments/fbhzf3/problems_with_nextline_not_waiting_for_user_input/
            // https://stackoverflow.com/questions/69734154/scanner-doesnt-wait-for-input-when-i-used-nextline-after-using-nextint-is-it
            // https://www.reddit.com/r/javahelp/wiki/scanner/
            scan.nextLine();
            String addMore = scan.nextLine();
            if (addMore.equalsIgnoreCase("n")) {
                loop = false;
            }
        }

        System.out.println("List Barang yang anda pilih adalah :");
        for (int i = 1; i <= products.length; i++) {
            System.out.println(
                    i + ". " + listProduct[products[i - 1]][0] + " seharga Rp" + listProduct[products[i - 1]][1]);
            hargaBeli += Integer.parseInt(listProduct[products[i - 1]][1]);
        }
        System.out.println("Dengan total harga sejumlah Rp" + hargaBeli);
        System.out.println("Terimakasih telah berkunjung ke toko kami #sampaiJumpaDiKehidupanYangLain");

        scan.close();
    }

    private static int[] productCheckOut(int[] products, int newProduct) {
        int[] newProducts = new int[products.length + 1];
        for (int i = 0; i < newProducts.length; i++) {
            if (i > (products.length - 1)) {
                newProducts[i] = newProduct;
            } else {
                newProducts[i] = products[i];
            }
        }
        return newProducts;
    }

    private static boolean productAlready(int[] products, int newProduct) {
        for (int product : products) {
            if (product == (newProduct - 1)) {
                return true;
            }
        }
        return false;
    }
}

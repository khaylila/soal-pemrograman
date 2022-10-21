package array.tugas;

import java.util.Scanner;

public class TokoKomputer {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[][] listProduct = {
                { "Printer", "1500000" },
                { "Monitor", "1000000" },
                { "Keyboard", "100000" },
                { "Mouse", "50000" },
                { "SSD 120GB", "300000" },
                { "Ryzen 3", "2000000" },
                { "RAM DDR4 2x4", "800000" },
                { "MotherBoard", "1000000" },
                { "Casing", "350000" },
                { "Power Supply", "500000" },
                { "Kabel Lan 5 Meter", "20000" },
                { "Router", "150000" },
                { "Kabel Sata", "10000" },
        };
        int[] products = {};
        boolean loop = true, productAlready = false;
        int temp = 0, hargaBeli = 0;

        System.out.println("~~~Selamat datang di toko Pemuja Rahasia~~~");
        System.out.println("List Produk Kami:");
        for (int i = 1; i <= listProduct.length; i++) {
            System.out.println(i + ". " + listProduct[i - 1][0] + " seharga Rp" + listProduct[i - 1][1]);
        }
        System.out.println("Catatan: barang yang telah dipilih tidak dapat dipilih kembali.");

        while (loop) {
            int count = 0;
            while (temp < 1 || temp > 13 || productAlready == true) {
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
            products = productCheckOut(products, temp);
            temp = 0;
            System.out.print("Lanjutkan?(y/n): ");
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
        System.out.println("Terimakasih telah berkunjung ke toko kami :d");

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
            if (product == newProduct) {
                return true;
            }
        }
        return false;
    }
}

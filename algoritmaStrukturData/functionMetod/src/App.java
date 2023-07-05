public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println(faktorial(5));

    }

    private static int faktorial(int n) {
        int hasil = 0;
        if (n == 1) {
            hasil = 1;
        } else {
            hasil = n * faktorial(n - 1);
        }

        return hasil;
    }
}
// parameter/argumen
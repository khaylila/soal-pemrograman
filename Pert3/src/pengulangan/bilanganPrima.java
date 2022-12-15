package pengulangan;

public class bilanganPrima {
    public static void main(String[] args) {
        int bilangan = 19;
        int temp = 0;
        for (int i = 1; i <= bilangan; i++) {
            if (bilangan % i == 0) {
                temp++;
            }
        }
        System.out.println((temp > 2 ? "bukan" : "") + " bilangan prima");
    }
}

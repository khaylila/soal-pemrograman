package swing;

public class rekrusif {
    public static void main(String[] args) {
        System.out.println(recr(6));
    }

    private static int recr(int n) {
        // if (n == 1) {
        // return n;
        // }
        // return n * recr(n - 1);
        if (n == 1) {
            return n;
        }
        n--;
        return recr(n);
    }
}

package swing;

public class faktorial {
    public static void main(String[] args) {
        int n = 5;
    }

    private int faktorial(int n) {
        int f = 1;
        if (n > 0) {
            return faktorial(n) + faktorial(n - 1);
        }
        return f;
    }
}

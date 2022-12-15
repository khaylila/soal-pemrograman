class Salah extends Exception {
    public Salah() {
    }

    public Salah(String pesan) {
        super(pesan);
    }
}

public class exceptionEnam extends Exception {
    public static void main(String[] args) throws Salah {
        Salah s = new Salah("Salah disengaja ha... ha...");
        int i = 0;
        if (i == 0)
            throw s;
    }
}

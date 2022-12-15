package exception.tugas;

class Salah extends Exception {
    public Salah() {
    }

    public Salah(String pesan) {
        super(pesan);
    }
}

public class tesSalah {
    public static void main(String[] arg) throws Salah {
        Salah s = new Salah("Salah disengaja ha..ha..");
        int i = 0;
        if (i == 0) {
            throw s;
        }
    }
}

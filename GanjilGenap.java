public class GanjilGenap {
    public static void main(String args[]) {
        System.out.println("Hello World!");
        int bilangan = 12;
        // if (bilangan % 2 == 0) {
        // System.out.println("Bilangan " + bilangan + " genap");
        // } else {
        // System.out.println("Bilangan " + bilangan + " ganjil");
        // }

        GanjilGenap ganGen = new GanjilGenap();
        boolean x = ganGen.checkBilangan(bilangan);

        if (x) {
            System.out.println("Bilangan " + bilangan + " genap");
        } else {
            System.out.println("Bilangan " + bilangan + " ganjil");
        }

        // if (checkBilangan(12, "Aku Padamu")) {
        // System.out.println("Bilangan " + bilangan + " genap");
        // } else {
        // System.out.println("Bilangan " + bilangan + " ganjil");
        // }
    }

    // private boolean checkBilangan() {
    // return false;
    // }

    private boolean checkBilangan(Integer bilangan) {
        if (bilangan % 2 == 0) {
            return true;
        }

        return false;
    }
}
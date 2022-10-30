package belajarMethod;

/**
 * Method
 */
public class Method {

    public static void main(String[] args) {
        String m = (new Method()).methodPerkalian();
        // String d = m.methodPerkalian();
        System.out.println(m);
        // System.out.println(methodPerkalian());
    }

    public String methodPerkalian() {
        int a = 2, b = 3, c = a * b;
        String s = "Hasil dari a x b = " + c;
        return s;
    }
}
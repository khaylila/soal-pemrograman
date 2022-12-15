public class exceptionEmpat {
    private static void f1() {
        System.out.print("1");
        try {
            System.out.print("2");
            f2();
            System.out.print("3");
        } catch (Exception e) {
            System.out.print("4");
        } finally {
            System.out.print("5");
        }
        System.out.print("6");
    }

    private static void f2() throws Exception {
        if (true)
            throw new Exception();
    }

    public static void main(String[] args) {
        f1();
    }
}

package exception.tugas;

class counterException extends Exception { // Define
    String complaint;

    public counterException(String c) {
        this.complaint = c;
    }

    public String toString() {
        return "counter Exception " + complaint;
    }
}

class counter {
    int n = 0;

    public int zero() {
        return n = 0;
    }

    public int up() {
        return ++n;
    }

    public int down() throws counterException { // Throw
        if (n <= 0)
            throw new counterException(n + " count Down failed.");
        return --n;
    }
}

public class example1 {
    public static void main(String args[]) {
        counter aCounter = new counter();
        aCounter.zero();
        aCounter.up();
        try {
            aCounter.down();
        } catch (counterException ce) { // Catch
            System.out.println("" + ce);
        }
        try {
            aCounter.down();
        } catch (counterException ce) { // Catch
            System.out.println("" + ce);
        } finally {
            System.out.println("Finally");
        }
    }
}

class counterException extends Exception {
    // define
    String complaint;

    public counterException(String c) {
        this.complaint = c;
    }

    public String toString() {
        return "Counter Exception " + complaint;
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

    public int down() throws counterException {
        // throw
        if (n <= 0)
            throw new counterException(n + " count down failed.");
        return --n;
    }
}

public class exceptionTujuh {
    public static void main(String[] args) {
        counter aCounter = new counter();
        aCounter.zero();
        aCounter.up();
        try {
            aCounter.down();
        } catch (counterException ce) {
            System.out.println(ce);
        }
        try {
            aCounter.down();
        } catch (counterException ce) {
            System.out.println(ce);
        } finally {
            System.out.println("Finally");
        }
    }
}

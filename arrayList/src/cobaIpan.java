import java.util.Stack;

public class cobaIpan {
    public static void main(String[] args) {
        Stack<Integer> t = new Stack<>();
        Stack<Integer> s = new Stack<>();
        Stack<Integer> r = new Stack<>();

        // Menambah elemen ke stack t

        r.push(1);
        r.push(2);
        r.push(3);

        s.push(4);
        s.push(5);

        t.push(6);
        t.push(7);
        t.push(8);
        t.push(9);

        // Memasukkan elemen-elemen dari stack t ke stack s
        while (!s.isEmpty()) {
            t.push(s.remove(0));
        }
        s = t;

        // Menampilkan elemen-elemen dalam stack s dan r
        System.out.println("Isi Stack s: " + s);
        System.out.println("Isi Stack r: " + r);
    }
}

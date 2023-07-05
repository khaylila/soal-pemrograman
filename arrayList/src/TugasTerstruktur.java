// rev2.0 change method remove() to pop()

// Suppose you have three nonempty stacks R, S, and T. Describe a sequence of operations that results 
// in S storing all elements originally in T below all of S’s original elements, with both sets of 
// those elements in their original order. The ﬁnal conﬁguration for R should be the same as its 
// original conﬁguration. For example,
// if R = (1, 2, 3), S = (4, 5), and T = (6, 7, 8, 9), when ordered from bottom to top, then the ﬁnal 
// conﬁguration should have R = (1, 2, 3) and S = (6, 7, 8, 9, 4, 5).

import java.util.Scanner;
import java.util.Stack;

public class TugasTerstruktur {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Stack<Integer> rStack = new Stack<Integer>();
        Stack<Integer> sStack = new Stack<Integer>();
        Stack<Integer> tStack = new Stack<Integer>();

        int tempStackValue = 0;
        // rStack
        do {
            System.out.print("Masukkan angka untuk Stack R (masukkan -1 untuk melanjutkan): ");
            tempStackValue = Integer.parseInt(scan.next());
            rStack.add(tempStackValue);
        } while (tempStackValue != -1);
        rStack.pop();
        // sStack
        do {
            System.out.print("Masukkan angka untuk Stack S (masukkan -1 untuk melanjutkan): ");
            tempStackValue = Integer.parseInt(scan.next());
            sStack.add(tempStackValue);
        } while (tempStackValue != -1);
        sStack.pop();
        // tStack
        do {
            System.out.print("Masukkan angka untuk Stack T (masukkan -1 untuk melanjutkan): ");
            tempStackValue = Integer.parseInt(scan.next());
            tStack.add(tempStackValue);
        } while (tempStackValue != -1);
        tStack.pop();

        System.out.println("Input");
        System.out.println("R Stack: " + rStack);
        System.out.println("S Stack: " + sStack);
        System.out.println("T Stack: " + tStack);

        Stack<Integer> tempStack = new Stack<Integer>();
        while (!sStack.empty()) {
            tempStack.add(sStack.pop());
        }
        while (!tempStack.isEmpty()) {
            tStack.add(tempStack.pop());
        }

        System.out.println("Output");
        System.out.println("R Stack: " + rStack);
        System.out.println("S Stack: " + tStack);
    }
}

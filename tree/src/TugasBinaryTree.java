import java.util.Scanner;

public class TugasBinaryTree {
    public static void main(String[] args) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~Tugas Tersturktur - Binary Tree~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Scanner scan = new Scanner(System.in);
        Integer i = 0, inputNilai = 0;
        NodeTree root = new NodeTree();
        while (inputNilai != -1) {
            System.out.print("Masukkan angka: ");
            inputNilai = Integer.parseInt(scan.next());
            if (inputNilai != -1) {
                if (i == 0) {
                    root = new NodeTree(inputNilai);
                } else {
                    root.checkNodeTree(inputNilai);
                }
            }
            i++;
        }

        System.out.println("Output:");
        // pre
        System.out.println("1. Pengurutan PreOrderTranversal");
        root.orderTraversalType("pre");
        // in
        System.out.println("\n2. Pengurutan InOrderTranversal");
        root.orderTraversalType("in");
        // post
        System.out.println("\n3. Pengurutan PostOrderTranversal");
        root.orderTraversalType("post");
    }
}

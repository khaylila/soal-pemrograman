/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class TreeBuilder {
    public static TreeNode buildTree() {
        TreeNode root = null;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Masukkan angka (berhenti dengan -1): ");
            int value = scanner.nextInt();
            if (value == -1) {
                break;
            }
            if (root == null) {
                root = new TreeNode(value);
            } else {
                root.insert(value);
            }
        }
        return root;
    }

    public static void preOrderTraversal(TreeNode node) {
        if (node != null) {
            System.out.print(node.getValue() + " ");
            preOrderTraversal(node.getLeft());
            preOrderTraversal(node.getRight());
        }
    }

    public static void inOrderTraversal(TreeNode node) {
        if (node != null) {
            inOrderTraversal(node.getLeft());
            System.out.print(node.getValue() + " ");
            inOrderTraversal(node.getRight());
        }
    }

    public static void postOrderTraversal(TreeNode node) {
        if (node != null) {
            postOrderTraversal(node.getLeft());
            postOrderTraversal(node.getRight());
            System.out.print(node.getValue() + " ");
        }
    }

    public static void main(String[] args) {
        TreeNode tree = buildTree();

        System.out.println("Traversal Pre-order:");
        preOrderTraversal(tree);
        System.out.println();

        System.out.println("Traversal In-order:");
        inOrderTraversal(tree);
        System.out.println();

        System.out.println("Traversal Post-order:");
        postOrderTraversal(tree);
        System.out.println();
    }
}
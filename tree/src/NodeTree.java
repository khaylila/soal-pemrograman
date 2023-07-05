/**
 * NodeTree
 */
public class NodeTree {
    Integer angka;
    NodeTree left;
    NodeTree right;
    NodeTree parent;

    public NodeTree() {
    }

    public NodeTree(Integer angka) {
        this.angka = angka;
    }

    public void addChild(NodeTree child, String typeAdd) {
        if (typeAdd == "left") {
            this.left = child;
        } else {
            this.right = child;
        }
        child.parent = this;
    }

    public void checkNodeTree(Integer angka) {
        if (angka <= this.angka) {
            if (this.left != null) {
                this.left.checkNodeTree(angka);
            } else {
                NodeTree child = new NodeTree(angka);
                this.addChild(child, "left");
            }
        } else {
            if (this.right != null) {
                this.right.checkNodeTree(angka);
            } else {
                NodeTree child = new NodeTree(angka);
                this.addChild(child, "right");
            }
        }
    }

    public void orderTraversalType(String type) {
        if (type == "pre") {
            System.out.print(angka + " ");
            if (this.left != null) {
                this.left.orderTraversalType("pre");
            }
            if (this.right != null) {
                this.right.orderTraversalType("pre");
            }
        } else if (type == "in") {
            if (this.left != null) {
                this.left.orderTraversalType("in");
            }
            System.out.print(angka + " ");
            if (this.right != null) {
                this.right.orderTraversalType("in");
            }
        } else if (type == "post") {
            if (this.left != null) {
                this.left.orderTraversalType("post");
            }
            if (this.right != null) {
                this.right.orderTraversalType("post");
            }
            System.out.print(angka + " ");
        }
    }
}

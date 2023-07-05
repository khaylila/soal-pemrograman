// class NodeTree {
// String data;
// NodeTree left;
// NodeTree right;
// NodeTree parent;

// public void addChild(NodeTree child, String typeAdd) {
// // this.{typeAdd=="left"?"left":"right"} = child;
// // this.(typeAdd == "left"?"right") = child;
// if (typeAdd == "left") {
// this.left = child;
// } else {
// this.right = child;
// }
// child.parent = this;
// }

// public void orderTraversalType(String type) {
// if (type == "pre") {
// System.out.println(data);
// if (this.left != null) {
// this.left.orderTraversalType("pre");
// }
// if (this.right != null) {
// this.right.orderTraversalType("pre");
// }
// } else if (type == "in") {
// if (this.left != null) {
// this.left.orderTraversalType("in");
// }
// System.out.println(data);
// if (this.right != null) {
// this.right.orderTraversalType("in");
// }
// } else if (type == "post") {
// if (this.left != null) {
// this.left.orderTraversalType("post");
// }
// if (this.right != null) {
// this.right.orderTraversalType("post");
// }
// System.out.println(data);
// }
// }
// }

// public class App {
// public static void main(String[] args) throws Exception {
// NodeTree root = new NodeTree();
// root.data = "Yusuf";

// NodeTree child1 = new NodeTree();
// child1.data = "Abdullah";

// NodeTree child2 = new NodeTree();
// child2.data = "Ibrahim";

// NodeTree child3 = new NodeTree();
// child3.data = "Khaled";

// root.addChild(child1, "left");
// root.addChild(child2, "right");
// child2.addChild(child3, "left");
// child2.addChild(new NodeTree(), "right");
// child2.right.data = "rani";

// root.orderTraversalType("pre");
// System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
// root.orderTraversalType("in");
// System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
// root.orderTraversalType("post");
// }
// }

public class NodeTreeTest {
    public static void main(String[] args) {
        NodeTree root = new NodeTree(8);
        NodeTree child1 = new NodeTree(5);
        NodeTree child2 = new NodeTree(10);
        NodeTree child3 = new NodeTree(7);
        NodeTree child4 = new NodeTree(9);

        root.left = child1;
        root.right = child2;
        root.left.right = child3;
        root.right.left = child4;

        root.orderTraversalType("post");
        // 8 5 10 7 9
        // 8
        // 5 10
        // 7 9
    }
}

import java.util.ArrayList;

class NodeGraph {
    ArrayList<ArrayList<Integer>> graph;
    int V;

    public NodeGraph(int nodes) {
        V = nodes;
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<Integer>());
        }
    }

    void addEdge(int v, int u) {
        graph.get(v).add(u);
        graph.get(u).add(v);
    }

    void printGraph() {
        for (int i = 0; i < V; i++) {
            System.out.print("Node " + i + ":");
            for (int x : graph.get(i)) {
                System.out.print(" -> " + x);
            }
            System.out.println();
        }
    }
}

/**
 * Graph
 */
public class Graph {
    public static void main(String[] args) {
        NodeGraph g = new NodeGraph(5);
        g.addEdge(0, 1);
        g.addEdge(3, 2);
        g.addEdge(2, 4);
        g.addEdge(1, 4);
        g.addEdge(3, 1);
        g.addEdge(2, 0);
        g.printGraph();

    }
}
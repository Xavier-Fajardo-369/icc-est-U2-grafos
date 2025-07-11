import java.util.*;

public class Graph {
    private List<Node> nodes;
    private Map<Node, Set<Node>> adjacencyList;

    public Graph() {
        nodes = new ArrayList<>();
        adjacencyList = new HashMap<>();
    }

    public Node addNode(int value) {
        Node node = new Node(value);
        if (!nodes.contains(node)) {
            nodes.add(node);
            adjacencyList.put(node, new LinkedHashSet<>()); // mantiene orden
        }
        return node;
    }

    public void addEdge(Node src, Node dest) {
        adjacencyList.get(src).add(dest);
        adjacencyList.get(dest).add(src); // para grafo no dirigido
    }

    public void printGraph() {
        for (Node node : nodes) {
            System.out.print("Vertex " + node.value + ":");
            Set<Node> neighbors = adjacencyList.getOrDefault(node, new LinkedHashSet<>());
            for (Node neighbor : neighbors) {
                System.out.print(" -> " + neighbor.value);
            }
            System.out.println();
        }
    }

    // Otros métodos opcionales (DFS, BFS, matriz) puedes agregarlos si te los piden.
}
    

   

    


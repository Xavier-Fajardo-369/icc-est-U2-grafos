

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Xavier Fajardo");
        System.out.println("Xavier Fajardo");
        Graph graph = new Graph();
        Node v0 = graph.addNode(0);
        Node v1 = graph.addNode(1);
        Node v2 = graph.addNode(2);
        Node v3 = graph.addNode(3);
        Node v4 = graph.addNode(4);
        Node v5 = graph.addNode(5);
        Node v6 = graph.addNode(6);
        Node v7 = graph.addNode(7);
        Node v8 = graph.addNode(8);
        Node v9 = graph.addNode(9);

        graph.addEdge(v0, v1);
        graph.addEdge(v0, v3);
        graph.addEdge(v0, v5);

        graph.addEdge(v1, v3);

        graph.addEdge(v2, v1);
        graph.addEdge(v2, v3);
        graph.addEdge(v2, v4);
        graph.addEdge(v2, v8);

        graph.addEdge(v3, v4);
        graph.addEdge(v3, v7);
        graph.addEdge(v3, v9);

        graph.addEdge(v5, v3);
        graph.addEdge(v6, v8);

        graph.printGraph(); 

        
       
    }
}

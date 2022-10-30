import java.util.*;

public class Main {
    public static void main(String[] args) {
       Graph graph = new Graph();
       List<String> a  =new ArrayList<>();
       a.add("A");
       a.add("B");
       a.add("C");
       graph.addEdge("A","B", "2");
       graph.addEdge("A","C", "1");
       graph.addEdge("A","D", "6");
       graph.addEdge("B","E", "1");
       graph.addEdge("C","E", "3");
       graph.addEdge("D","E", "8");
       graph.addEdge("E","F", "7");
       graph.addEdge("E","G", "5");
       graph.addEdge("F","H", "5");
       graph.addEdge("G","H", "6");
       System.out.println(graph);
       graph.find();
    }
}
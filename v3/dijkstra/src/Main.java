import java.util.*;

public class Main {
    public static void main(String[] args) {
//       GraphOld graphOld = new GraphOld();
//       List<String> a  =new ArrayList<>();
//       a.add("A");
//       a.add("B");
//       a.add("C");
//       graphOld.addEdge("A","B", "2");
//       graphOld.addEdge("A","C", "1");
//       graphOld.addEdge("A","D", "6");
//       graphOld.addEdge("B","E", "1");
//       graphOld.addEdge("C","E", "3");
//       graphOld.addEdge("D","E", "8");
//       graphOld.addEdge("E","F", "7");
//       graphOld.addEdge("E","G", "5");
//       graphOld.addEdge("F","H", "5");
//       graphOld.addEdge("G","H", "6");
//       System.out.println(graphOld);
//       graphOld.find();

       GraphNew graphNew = new GraphNew();
       List<String> a  =new ArrayList<>();
       a.add("A");
       a.add("B");
       a.add("C");
       graphNew.addEdge("A","B", "2");
       graphNew.addEdge("A","C", "1");
       graphNew.addEdge("A","D", "6");
       graphNew.addEdge("B","E", "1");
       graphNew.addEdge("C","E", "3");
       graphNew.addEdge("D","E", "8");
       graphNew.addEdge("E","F", "7");
       graphNew.addEdge("E","G", "5");
       graphNew.addEdge("F","H", "5");
       graphNew.addEdge("G","H", "6");
       System.out.println(graphNew.adj);
       graphNew.find("D");
    }
    }


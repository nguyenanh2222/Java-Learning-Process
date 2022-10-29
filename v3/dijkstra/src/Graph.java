import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
    private final int V;
    private int E;
    private Map<String, List<List>> adj;


    public Graph() {
        this.V = 8;
        this.E = 10;
        this.adj =  new HashMap<>();
        String v = "ABCDEFGH";
        for (int i = 0; i < v.length(); i++) {
            List<List> tempArr = new ArrayList<>();
            this.adj.put(String.valueOf(v.charAt(i)), tempArr);

    }
    }
    public int V() { return V; }
    public int E() { return E; }
    public void addEdge(String v, String w, String distant) {
        List<String> temp_v = new ArrayList<String>();
        temp_v.add(v);
        temp_v.add(distant);
        List<String> temp_w = new ArrayList<String>();
        temp_w.add(w);
        temp_w.add(distant);
        this.adj.get(temp_v.get(0)).add(temp_w);
        this.adj.get(temp_w.get(0)).add(temp_v);
    }
//    public void addEdge1(String v, String w/*, int W) {
//    Map<String,Integer> map1 =  new HashMap();
//    map1.put(v,W);
//    Map<String,Integer> map2 =  new HashMap();
//    map2.put(w,W);
//    this.adj.get(v).add(map1);
//    this.adj.get(w).add(map2);
//    }*/

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Graph{");
        sb.append("V=").append(V);
        sb.append(", E=").append(E);
        sb.append(", adj=").append(adj);
        sb.append('}');
        return sb.toString();
    }

//    public Iterable<Integer> adj(int v) { return adj[v]; }
//
//    public String showList(int v){
//        temp_str = (String) v;
//        for (string item: this.adj[v])
//            temp_str += "->" + item;
//        return temp_str;
//    }
//
//    @java.lang.Override
//    public java.lang.String toString() {
//        temp_string = "";
//        for (int i=0; i<V; i++)
//            temp_str+=showList(i) + "\n";
//
//       return temp_string;
//    }

}


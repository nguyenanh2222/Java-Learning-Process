import java.util.*;

public class Graph {
    public final int V;
    public final int E;
    public Map<String, List<List<String>>> adj;


    public Graph() {
        this.V = 8;
        this.E = 10;
        this.adj =  new HashMap<String, List<List<String>>>();
        String v = "ABCDEFGH";
        for (int i = 0; i < v.length(); i++) {
            List<List<String>> tempArr = new ArrayList<>();
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
    public void find() {
        Map<String, String> distance = new HashMap<String, String>();
        String queue = "ABCDEFGH";
        List<String> previous = new ArrayList<String>();
        String defaultChoose = "C";
        int i;
        for (i = 0; i < this.V; i++)
        {
            distance.put(String.valueOf(queue.charAt(i)),null);
            previous.add(defaultChoose);
        }
        distance.replace(defaultChoose, "0");
        queue = queue.replace(defaultChoose,"");
        List<Object> SP = new ArrayList<>();
        SP.add(defaultChoose);
        while (!queue.equals("")){
        int chunk = 999999;
        System.out.println(chunk);
            for (String item : distance.values()){
                if (item == null);
                else {
                    if (chunk > Integer.parseInt(item)) chunk = Integer.parseInt(item);
                    System.out.println(chunk);
                }
            }
        String x = null;
            for (String item : distance.keySet()){
                System.out.println(String.valueOf(chunk));
                if (Objects.equals(distance.get(item), String.valueOf(chunk))){
                    System.out.println("");
                    x = item;
                    break;
                }
        }
            System.out.println(x);

//            defaultChoose = queue;

//            if (distance(x)=Min.distance(Queue));
//                SP.add(x);
//                if (y in Queue and Queue.getIndex(y)==Queue.getIndex(x)+1){
//                    distance(y) > distance(x)+c(x,y) {
//                    distance(y) = distance(x) + c(x, y);
//                    previous(y) = x;
//
//                }
//            }
//
//        }
//        return SP;
    }



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


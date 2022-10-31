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
        Map<String, String> previous = new HashMap<>();
        String defaultChoose = "C";
        int i;
        for (i = 0; i < this.V; i++) {
            distance.put(String.valueOf(queue.charAt(i)),null);
            previous.put(defaultChoose, "0");
        }
        queue = queue.replace(defaultChoose,"");
        distance.replace(defaultChoose, "0");
        distance.replace("A", "1");
        List<Object> SP = new ArrayList<>();
        SP.add(defaultChoose);
        Collection<String> temp_distance = distance.values();
        for (i=0; i<8; i++){
            int chunk = 999999;
            for (String item : temp_distance) {
                if (item == null) continue;
                else {
                    if (chunk > Integer.parseInt(item)) {
                        chunk = Integer.parseInt(item);
//                        temp_distance.remove(item);}
                    }
                        if(chunk < Integer.parseInt(item)){

                    }
                }
            }
            String x = null;
            StringBuilder temp_queue = new StringBuilder();
            for (String item : distance.keySet()) {
                if (Objects.equals(distance.get(item), String.valueOf(chunk))) {
                    x = item;
                    temp_queue.append(x);
//                    break`;
                }
            }
            System.out.println(temp_queue);
            System.out.println(x);
            SP.add(x);
            List<List<String>> v = adj.get(x);
            for (List itemV : v) {
                String keyMap = (String) itemV.get(0);
                if (distance.get(keyMap) == null) {
                    String value = (String) itemV.get(1);
                    int valAfter = Integer.parseInt(value) + chunk;
                    distance.replace(keyMap, String.valueOf(valAfter));
                    previous.put(keyMap, x);
                } else {
                    int val = 0;
                    if (Integer.parseInt(distance.get(keyMap)) > Integer.parseInt((String) itemV.get(1))) {
                        val = Integer.parseInt(String.valueOf(chunk)) + Integer.parseInt((String) itemV.get(1));
                        distance.replace(keyMap, String.valueOf(val));
                        previous.replace(keyMap, x);
                    }
                }
            }
        }
            System.out.println(previous);
            System.out.println(distance);
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


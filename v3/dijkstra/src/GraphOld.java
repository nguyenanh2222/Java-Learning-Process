import java.util.*;

public class GraphOld {
    public final int V;
    public final int E;
    public Map<String, List<List<String>>> adj;


    public GraphOld() {
        this.V = 8;
        this.E = 10;
        this.adj = new HashMap<String, List<List<String>>>();
        String v = "ABCDEFGH";
        for (int i = 0; i < v.length(); i++) {
            List<List<String>> tempArr = new ArrayList<>();
            this.adj.put(String.valueOf(v.charAt(i)), tempArr);

        }
    }

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
        StringBuilder temp_queue = new StringBuilder();
        Map<String, String> previous = new HashMap<>();
        String defaultChoose = "C";
        int i;
        for (i = 0; i < this.V; i++) {
            distance.put(String.valueOf(queue.charAt(i)), null);
            previous.put(defaultChoose, "0");
        }
        queue = queue.replace(defaultChoose, "");
        distance.replace(defaultChoose, "0");
//        distance.replace("A", "1");
        List<Object> SP = new ArrayList<>();
        SP.add(defaultChoose);
        List<Integer> temp_distance = new ArrayList<Integer>();
        int position = 0;
        while (temp_queue.length() != queue.length()) {
            int chunk = 999999;
            temp_distance.clear();
//            System.out.println(position);
            for (String item : distance.values()) {
                if (item == null) ;
                else {
                    temp_distance.add(Integer.valueOf(item));
//                    chunk = temp_distance.get(position);
//                    position+=1;
                }
            }

            Collections.sort(temp_distance);
            chunk = temp_distance.get(position);
//            System.out.println(temp_distance);
//            System.out.println(position);
            String x = null;
            System.out.println("TEMP " + temp_queue);
            for (String item : distance.keySet()) {
                if (String.valueOf(temp_queue).equals("")) {
                    System.out.println("12312");
                    x = defaultChoose;
                    temp_queue.append(x);
                } else {
                    for (i = 0; i < temp_queue.length(); i++) {
                        System.out.println(i);
                        if (Objects.equals(distance.get(item), String.valueOf(chunk)))
                            System.out.println("OK");
                        if (String.valueOf(temp_queue.charAt(i)).equals(item))
                            continue;
                        else {
                            x = item;
                            temp_queue.append(x);
                            break;
                        }
                    }
                }
            }
            System.out.println("distance : " + distance);
            System.out.println("TEMP_QUEUE" + temp_queue);
            System.out.println("x: " + x);
            SP.add(x);
            List<List<String>> v = adj.get(x);
            for (List<String> itemV : v) {
                String keyMap = itemV.get(0);
                if (distance.get(keyMap) == null) {
                    String value = itemV.get(1);
                    int valAfter = Integer.parseInt(value) + chunk;
                    distance.replace(keyMap, String.valueOf(valAfter));
                    previous.put(keyMap, x);
                } else {
                    int val = 0;
                    if (Integer.parseInt(distance.get(keyMap)) > Integer.parseInt(itemV.get(1)) + chunk) {
                        val = Integer.parseInt(String.valueOf(chunk)) + Integer.parseInt(itemV.get(1));
                        distance.replace(keyMap, String.valueOf(val));
                        previous.replace(keyMap, x);
                    }
                }
            }
            System.out.println(distance);
            position += 1;
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


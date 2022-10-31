import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GraphNew {
    public final int V;
    public final int E;
    public Map<String, List<List<String>>> adj;

    public GraphNew() {
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
        List<String> temp_v = new ArrayList<>();
        temp_v.add(v);
        temp_v.add(distant);
        List<String> temp_w = new ArrayList<>();
        temp_w.add(w);
        temp_w.add(distant);
        this.adj.get(temp_v.get(0)).add(temp_w);
        this.adj.get(temp_w.get(0)).add(temp_v);
    }

    public void find(String defaultChoose) {
        //        String defaultChoose = "D";
        Map<String, String> distance = new HashMap<>();
        String queue = "ABCDEFGH";
        Map<String, String> previous = new HashMap<>();

        int i;
        for (i = 0; i < this.V; i++) {
            distance.put(String.valueOf(queue.charAt(i)), null);
            previous.put(defaultChoose, "0");
        }

//        System.out.println("distance :" + distance);
//        System.out.println("previous :" + previous);
//        System.out.println(queue);
//        queue = queue.replace(defaultChoose, "");

        distance.replace(defaultChoose, "0");
        List<Object> SP = new ArrayList<>();
//        SP.add(defaultChoose);

//        System.out.println("distance :" + distance);
//        System.out.println("previous :" + previous);
//        System.out.println("SP :" + SP);

//        Collection<String> temp_distance = distance.values();

        for (i = 0; i < 8; i++) {
            int chunk = 999999;
            String x = null;
            for (String keyMap : distance.keySet()) {
                if (distance.get(keyMap) != null) {
                    boolean status = false;
                    int j;
                    for (j = 0; j < queue.length()-1; j++){
                        if (String.valueOf(queue.charAt(j)).equals(keyMap)) {
                            System.out.println("key map distance: " + keyMap);
                            status = true;
                        }}
                    if (status) {
                        if (chunk > Integer.parseInt(distance.get(keyMap))) {
                            chunk = Integer.parseInt(distance.get(keyMap));
                            x = keyMap;
                            System.out.println("x: "+ x);
                        }
                    }
                }
            }
            SP.add(x);

            List<List<String>> v = adj.get(x);
            System.out.println("distance :" + distance);
            System.out.println("previous :" + previous);
            System.out.println("SP :" + SP);
            System.out.println("v(x): " + v);


            for (List<String> itemV : v) {
                String keyMap =  itemV.get(0);
                if (distance.get(keyMap) == null) {
                    String value = itemV.get(1);
                    int valAfter = Integer.parseInt(value) + chunk;
                    distance.replace(keyMap, String.valueOf(valAfter));
                    previous.put(keyMap, x);
                } else {
                    if (Integer.parseInt(distance.get(keyMap)) > Integer.parseInt(itemV.get(1))+chunk) {
                        int val = Integer.parseInt(String.valueOf(chunk)) + Integer.parseInt((itemV.get(1)));
                        distance.replace(keyMap, String.valueOf(val));
                        previous.replace(keyMap, x);
                    }
                }
            }
            queue = queue.replace(x, "");
            System.out.println(queue);
        }

        System.out.println(previous);
        System.out.println(distance);

    }
}

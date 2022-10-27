import java.util.ArrayList;
import java.util.List;

public class QuickSort {
    public List<Integer> quickSort(List<Integer> a, int low, int high) {
        if (low < high) {
            int index = partition(a, low, high);
            quickSort(a, low, index - 1);
            quickSort(a, index + 1, high);
        }
        System.out.println(a);
        return a;
    }

    public int partition(List<Integer> a, int low, int high) {
        int pivot = a.get(high);
        System.out.println(pivot);

        int i = low - 1;
        int j;
        for (j = low; j <= high - 1; j++) {
            if (a.get(j) < pivot) {
                i++;
                Integer save_index = a.get(j);
                a.set(j, a.get(i));
                a.set(i, save_index);
            }
        }
        Integer save_index = a.get(i+1);
        a.set(i+1, a.get(high));
        a.set(high, save_index);
        return (i + 1);
    }
        public static void main(String[] args) {
            List<Integer> a = new ArrayList<>();
            a.add(3);
            a.add(7);
            a.add(4);
            a.add(9);
            a.add(2);
            System.out.println(a);
            QuickSort sort = new QuickSort();
            System.out.print(sort.quickSort(a,0,a.size()-1));
        }
    }

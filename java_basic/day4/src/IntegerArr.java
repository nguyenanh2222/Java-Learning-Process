import java.util.*;

//BÀI 1:
//        Viết chương trình nhập mảng số nguyên từ bàn phím.
//         Sắp xếp và xuất mảng vừa nhập ra màn hình.
//         Xuất phần tử có giá trị nhỏ nhất ra màn hình
//         Tính và xuất ra màn hình trung bình cộng các phần tử chia hết cho 3
public class IntegerArr {
    private Integer n;
    public List<Integer>  listInteger;

    public List<Integer> input() {
        this.listInteger = new ArrayList<Integer>();
        int count = 1;
        while (count == 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập n: ");
            this.listInteger.add(scanner.nextInt());
            System.out.print("Tiếp tục (1), dừng (0): ");
            Scanner scanner_count = new Scanner(System.in);
            count = scanner_count.nextInt();
        }
        return this.listInteger;
    }
    public List<Integer> quickSort(List<Integer> a, int low, int high) {
        if (low < high) {
            int index = partition(a, low, high);
            quickSort(a, low, index - 1);
            quickSort(a, index + 1, high);
        }
        return a;
    }

    public int partition(List<Integer> a, int low, int high) {
        int pivot = a.get(high);
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
    public int findMin() {
        Integer min = this.listInteger.get(0);
        for (int i = this.listInteger.size(); i < 0; i--){
            if (this.listInteger.get(i) < this.listInteger.get(i - 1)) {
                min = this.listInteger.get(i);
            } else {
                min = this.listInteger.get(i - 1);
            }
        }
        return min;
    }
    public int arithmeticMeanWithThree() {
        int chunk = 0;
        int count = 0;
        for (Integer element: this.listInteger) {
            if (element % 3 == 0) {
                chunk += element;
                count+=1;
            }
        }
        return chunk / count;
    }

        public static void main (String[]args){
            IntegerArr integerArr = new IntegerArr();
            List<Integer> arr = integerArr.input();
            System.out.println(arr);
            System.out.println("Quick Sort Arr");
            System.out.println(integerArr.quickSort(arr, 0, arr.size() - 1));
            System.out.println("Finding min value");
            System.out.println(integerArr.findMin());
            System.out.println("Finding arithmetic mean with 3 values");
            System.out.println(integerArr.arithmeticMeanWithThree());
        }
    }



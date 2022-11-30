import java.util.*;

/*
Đi mua táo
Yêu cầu
Hôm nay Minh được giao nhiệm vụ đi siêu thị để mua 'k' kg táo cho mẹ, để tiếp đãi 'n' khách.
Trong siêu thị, giá của các mặt hàng là khác nhau.
Khi Minh đi đến quầy bán táo, nhân viên báo rằng giá bán của táo không tính theo kg.
Vì táo được đóng gói thành từng gói , mỗi gói chứa 'x' kg táo, x> 0 và 'x' là một số nguyên.
Mỗi 'x' kg táo sẽ có giá là 'y'. Minh sẽ thấy các bảng giá chứa 'y' biểu thị giá của 'x' kg táo.
Nếu 'y' là -1 có nghĩa là số cân táo tương ứng không có sẵn.
Bây giờ vì táo chỉ có sẵn trong các gói, anh ấy quyết định mua ít nhất 'n' bìa táo cho 'n' vị khách của mẹ,
anh ấy sẽ không mua nhiều hơn n bìa táo.

Vì muốn hoàn thành nhiệm vụ để được mẹ thưởng.
Bạn hãy giúp Minh hoàn thành nhiệm vụ này,
biết rằng bạn sẽ được biết có bao nhiêu vị khách và bạn phải tính cho anh ấy biết số tiền tối thiểu phải chi cho bạn bè của mình.

Đầu vào

Dòng đầu tiên  sẽ chứa số lượng trường hợp C.
Mỗi trường hợp sẽ chứa hai dòng.
Dòng đầu tiên gồm N và K, biểu thị số khách có và số lượng táo tính theo kilogram mà anh ta nên mua.
Dòng thứ hai chứa K số nguyên được phân tách bằng dấu cách, trong đó số nguyên thứ i chỉ định giá của gói táo 'i'kg. Giá trị -1 biểu thị rằng không có gói táo tương ứng.
Điều kiện

Số nguyên N thỏa mãn  0<N≤100
Số nguyên K thỏa mãn  0<K≤100
Giá M thỏa mãn  0<M≤1000
Đầu ra

Đầu ra cho mỗi trường hợp phải là một dòng duy nhất chứa số tiền tối thiểu mà Minh phải chi.
In -1 nếu Minh không thể mua số táo thỏa mãn.

Ví dụ

Đầu vào

2
3 5
-1 -1 4 5 -1
5 5
1 2 3 4 5
Đầu ra:

-1 5
Giải thích

Vì cửa hàng chỉ có gói 3 và 4kg nên anh ta sẽ không thể làm hài lòng bạn bè vì anh ta sẽ không thể mua đúng 5kg táo.
Anh ta có thể mua năm gói 1kg vì anh ta phải mua 5 kg. Vì vậy, số tiền tối thiểu anh ta nên chi là 5.
*/
public class DiMuaTao {
    public int tienMuaTao(Integer n, Integer k, List<Integer> arr) {
        List<Integer> y = new ArrayList<>(arr);
        Map<Integer, Integer> v = new HashMap<>();
        int count = 0;
        for (Integer item : y) {
            count += 1;
            if (item != -1) {
                v.put(count, item);
            }
        }
        Integer a;
        Integer b;
        for (a = 0; a <= k; a++) {
            if (a>0 && k%a == 0 && v.containsKey(a)) {
                return k/a*v.get(a);}
            for (b = 0; b <= k; b++) {
                if (a + b == k && v.containsKey(a) && v.containsKey(b)) {
                    k = v.get(a) + v.get(b);
                    return k;}
            }
        }return -1;
    }

            public static void main (String[]args){
                System.out.println("----------------hello----------------------");
                System.out.println("Nhap so truong hop");
                Scanner th = new Scanner(System.in);
                int c = th.nextInt();
                while (c > 0) {
                    System.out.println("------------------begin--------------------");
                    System.out.println("Nhap so khach");
                    Scanner n = new Scanner(System.in);
                    int nInput = n.nextInt();

                    System.out.println("Nhap so kg");
                    Scanner k = new Scanner(System.in);
                    int kInput = k.nextInt();
                    Scanner s = new Scanner(System.in);
                    List<Integer> arr = new ArrayList<>();
                    System.out.println("Nhap gia mat hang");
                    for (int i = 1; i <= kInput; i++) {
                        arr.add(s.nextInt());
                    }
                    DiMuaTao diMuaTao = new DiMuaTao();
                    System.out.print("Tien mua tao: ");
                    System.out.println(diMuaTao.tienMuaTao(nInput, kInput, arr));
                    System.out.println("------------------end--------------------");
                    c--;
                }
            }
        }



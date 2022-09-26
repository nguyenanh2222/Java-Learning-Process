package homework;
import java.util.Scanner;
import static java.lang.Math.pow;
//BÀI 5
//        Đổi sang số nhị phân của 1 số nguyên dương n
//        Ví dụ nhập sao số dương 8 in ra màn hình số nhị phân của nó là 1000
//        7 -&gt; 111
//        9 -&gt; 1001
//        16 -&gt; 10000
public class Decimal2Binary {
    private Integer n;

    public void setN(Integer n) {
        this.n = n;
    }

    public long Dec2Bin() // Ctrl H => find & replace
    {
        long binaryNumber = 0;
        int p = 0;
        while (this.n > 0)
        {
            binaryNumber += (this.n % 2) * pow(10, p);
            ++p;
            this.n /= 2;
        }
        return binaryNumber;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n: ");
        Decimal2Binary binary = new Decimal2Binary();
        binary.setN(scanner.nextInt());
        System.out.print(binary.Dec2Bin());
    }
}


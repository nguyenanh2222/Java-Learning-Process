package homework;
//BÀI 4
//        Viết lại chữ số đảo ngược
//        Ví dụ nhập vào số 1357 thì in ra số đảo ngược là 7531
//        (Không sử dụng nhập vào chuỗi số là String)
import java.util.Scanner;

public class ReverseNumber {
    public Integer n;

    public void setN(Integer n) {
        this.n = n;
    }
    public int reverse(){
        int reverse = 0;
        while (this.n > 0) {
            reverse = reverse * 10 + this.n % 10;
            this.n /= 10;
        }
        return reverse;
    }




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n: ");
        ReverseNumber reverseNumber = new ReverseNumber();
        reverseNumber.setN(scanner.nextInt());
        System.out.print(reverseNumber.reverse());
    }
}



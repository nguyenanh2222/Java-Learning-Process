package homework;
//Công thức của dãy fibonacci có dạng: f(n) = f(n-1) + f(n-2) .
//        Với f(1) = 1; f(2) =1;
//        Nhập n từ bàn phím (n dương, bắt nhập lại nếu n âm, chỉ được phép sử
//        dụng vòng for) và in ra màn hình dãy f(n)

import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {
    public Integer n;

    public void setN() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n: ");
        this.n = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        if (this.n < 0){
            while (this.n < 0){
                System.out.print("Nhap lai n: ");
                this.n = scanner.nextInt();
            }
        }
        if (this.n >= 0) {
            for (int i = 0; i < n; i++) {
                int temp = i + 2;
                int number = list.get(temp - 1) + list.get(temp - 2);
                list.add(number);
            }
            System.out.println(list);
        }
    }
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.setN();

    }
}


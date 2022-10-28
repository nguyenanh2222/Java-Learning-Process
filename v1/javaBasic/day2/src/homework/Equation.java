//BÀI 1
//        Viết chương trình cho phép giải phương trình bậc nhất trong đó các hệ số a và
//        b nhập từ bàn phím
package homework;

import java.util.Scanner;

public class Equation {
    public Integer a;
    public Integer b;

    public void calculation() {

        Scanner a = new Scanner(System.in);
        System.out.println("Nhập a: ");
        this.a = a.nextInt();
        Scanner b = new Scanner(System.in);
        System.out.println("Nhập b: ");
        this.b = b.nextInt();
        if (this.a == 0) {
            System.out.println("Phương trình vô nghiệm");
        } else {
            System.out.println("Phương trình có nghiệm ");
            System.out.println(-this.b / this.a);
        }
    }


    public static void main(String[] args) {
        Equation equation = new Equation();
        equation.calculation();
    }
}





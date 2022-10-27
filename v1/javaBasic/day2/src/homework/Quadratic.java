package homework;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Quadratic {
    public Integer a;
    public Integer b;
    public Integer c;

    public void calculation() {

        Scanner a = new Scanner(System.in);
        System.out.println("Nhập a: ");
        this.a = a.nextInt();
        Scanner b = new Scanner(System.in);
        System.out.println("Nhập b: ");
        this.b = b.nextInt();
        Scanner c = new Scanner(System.in);
        System.out.println("Nhập c: ");
        this.c = c.nextInt();

        if (this.a == 0 && this.b == 0) {
            System.out.println("Phương trình vô nghiệm");
        }
        if (this.a == 0) {
            System.out.println("Phương trình khong phải phương trình bậc 2");
        } else {
            double delta = pow(this.b, 2) - 4 * this.a * this.c;
            double x1;
            double x2;
            if (delta > 0) {
                x1 = (-this.b + Math.sqrt(delta)) / (2 * this.a);
                x2 = (-this.b - Math.sqrt(delta)) / (2 * this.a);
                System.out.println("Phương trình có 2 nghiệm là: "
                        + "x1 = " + x1 + " và x2 = " + x2);
            } else if (delta == 0) {
                int x = (-this.b) / (2 * this.a);
                System.out.println("Phương trình có nghiệm kép: "
                        + "x1 = x2 = " + x);
            } else {
                System.out.println("Phương trình vô nghiệm!");
            }
        }
    }
    public static void main(String[] args) {
        Quadratic quadratic = new Quadratic();
        quadratic.calculation();
        ;
    }
}



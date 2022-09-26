
package homework;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Circle {
    public Integer r;

    public void setR() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập bán kính hình tròn: ");
        this.r = input.nextInt();
    }

    public Double Area() {
        return Math.PI * this.r * 2;
    }


    public Double Perimeter() {
        return pow(this.r, 2) * Math.PI;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setR();
        System.out.println(circle.Area());
        System.out.println(circle.Perimeter());
    }
}



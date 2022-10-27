package homework;

import java.util.Scanner;

import static java.lang.Math.pow;

class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào cạnh thứ nhất: ");
        double a = sc.nextDouble();
        System.out.print("Nhập vào cạnh thứ hai: ");
        double b = sc.nextDouble();
        System.out.print("Nhập vào cạnh thứ ba: ");
        double c = sc.nextDouble();

        if (a + b > c && a + c > b && b + c > a){
            if ((a == b) && (b == c)) {
                System.out.println("Equilateral Triangle");
            }
            else if (((a == b) && (pow(c, 2) == pow(a, 2) + pow(b, 2))) || ((a == c) && (pow(b, 2) == pow(a, 2) + pow(c, 2))) || (b == c)&& (pow(a, 2) == pow(b, 2) + pow(c, 2)))
            {
                System.out.println("Isosceles Right-Angled Triangle");
            }
            else if ((a == b) || (a == c) || (b == c))
            {
                System.out.println("Isosceles Triangle");
            }
            else if ((pow(a, 2) == pow(b, 2) + pow(c, 2)) || (pow(b, 2) == pow(a, 2) + pow(c, 2)) || (pow(c, 2) == pow(a, 2) + pow(b, 2)))
            {
                System.out.println("Right-Angled Triangle");
            }
            else
            {
                System.out.println("Scalene Triangle");
            }
        }
        else {
            System.out.println("a, b, c aren't angles of triangle");
        }
        sc.close();
    }
}


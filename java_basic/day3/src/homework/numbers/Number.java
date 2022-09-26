package homework.numbers;

import java.util.ArrayList;
import java.util.Scanner;

public class Number {
    public Integer n;

    public void setN() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n: ");
        this.n = scanner.nextInt();
    }

    public ArrayList<Object> PrimedNumbers() {
        int i = 2;
        ArrayList<Object> listPrimeNumbers = new ArrayList<>();
        while (this.n > 1) {
            if (this.n % i == 0) {
                n = n / i;
                listPrimeNumbers.add(i);
            } else {
                i++;
            }
        }
        if (listPrimeNumbers.isEmpty()) {
            listPrimeNumbers.add(n);
        }
        ArrayList<Object> newList = new ArrayList<>();
        for (Object element : listPrimeNumbers) {
            if (!newList.contains(element)) {
                newList.add(element);
            }
        }
        return newList;
    }

    public int gcd(Number a){
        {
            // Lặp tới khi 1 trong 2 số bằng 0
            while (a.n*this.n != 0){
                if (a.n > this.n){
                    a.n %= this.n; // a = a % b
                }else{
                    this.n %= a.n;
                }
            }
            return a.n + this.n; // return a + b, bởi vì lúc này hoặc a hoặc b đã bằng 0.
        }
    }
    public int scd(Number a){
        System.out.println(a.n);
        System.out.println(this.n);
        int gcd = a.gcd(this);
        System.out.println(gcd);
        return (a.n*this.n/gcd);
    }
    public static void main(String[] args) {
        Number n1 = new Number();
        n1.setN();
        Number n2 = new Number();
        n2.setN();
        n2.gcd(n1);
//        System.out.println(n2.gcd(n1));
        System.out.println(n2.scd(n1));


    }
}



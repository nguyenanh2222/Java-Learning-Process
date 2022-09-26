package homework;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Math.pow;

//Bài 2
//        Tính S(n) = 1^3 + 2^3 + 3^3 + … + n^3 n nhập từ bàn phím
public class SeriesOfTerms {
    private static long S;
    public Integer n;
    public double s;

    public void calulationS() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n: ");
        this.n = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Double> list_pow = new ArrayList<>();

        if (this.n < 0){
            while (this.n < 0){
                System.out.print("Nhap lai n: ");
                this.n = scanner.nextInt();
            }
        }
        if (this.n >= 0) {
            for (int i = 1; i <= n; i++) {
                list.add(i);
                Integer temp = list.get(i-1);
                double pow_temp = pow(temp, 3);
                list_pow.add(pow_temp);
            }
            for (int i = 1; i <= n; i++)
            {
                s += list_pow.get(i-1);
            }
            System.out.println(s);
        }
    }
    public static void main(String[] args) {
        SeriesOfTerms s = new SeriesOfTerms();
        s.calulationS();
    }
}


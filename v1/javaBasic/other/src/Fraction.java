import java.util.Scanner;

//Bài tập 2: Xây dựng và sử dụng lớp Fraction
//
//        ❑ Data members: numerator, denominator
//        ❑ Member functions: print(), input(), add()
//        Ghi chú: hàm add() là hàm dùng để cộng 2 phân số. Hàm cần thêm 1 tham số có kiểu Fraction
public class Fraction {
    public Integer numerator;
    public Integer denominator;


    public Integer getDenominator() {
        return denominator;
    }

    public Integer getNumerator() {
        return numerator;
    }

    public void input() {
        Scanner numerator = new Scanner(System.in);
        System.out.println("Nhập tử số: ");
        this.numerator = numerator.nextInt();
        Scanner denominator = new Scanner(System.in);
        System.out.println("Nhập mẫu số: ");
        this.denominator = denominator.nextInt();

    }

    public void print() {
        System.out.println("Phân số đã nhập: " + this.numerator + "/" + this.denominator);
    }

    public void add(Fraction fractionTwo) {
        int numer = (this.numerator * fractionTwo.getDenominator()) + (fractionTwo.getNumerator() * this.denominator);
        int denr = this.denominator * fractionTwo.getDenominator();
        Fraction fraction_new = new Fraction();
        fraction_new.numerator = numer;
        fraction_new.denominator = denr;
        System.out.println("Phân số thứ 1: " + this.numerator + "/" + this.denominator);
        System.out.println("Phân số thứ 2: " + fractionTwo.getNumerator() + "/" + fractionTwo.getDenominator());
        System.out.println("Đáp số: " + numer + "/" + denr);
    }

        public static void main(String[] args) {
            Fraction fraction = new Fraction();
            fraction.input();
            fraction.print();
            Fraction fraction_two = new Fraction();
            fraction_two.input();
            fraction.add(fraction_two);
        }
    }







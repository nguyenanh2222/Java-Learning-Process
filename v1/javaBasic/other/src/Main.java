public class Main {
    public static void main(String[] args) {
        Fraction fraction = new Fraction();
        fraction.input();
        fraction.print();
        Fraction fraction_two = new Fraction();
        fraction_two.input();
        fraction.add(fraction_two);
    }
}
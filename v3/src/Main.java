import java.time.Year;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        System.out.println(product.getPrice());
        product.setPrice(5000.0);
        System.out.println(product.getPrice());
        System.out.println(product.getCode());
        System.out.println(product.getName());
        System.out.println(product.total(product, 20));
        System.out.println(product.total(product, 30));
        System.out.println(product.total(product, 50));
        System.out.println(product.checkDate(product));
    }
}
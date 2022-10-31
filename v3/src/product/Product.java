package product;

import java.time.Year;

public class Product {
    private final int code;
    private String name;
    private double price;
    private final Year epiryDate;

    public Product() {
        this.code = 0;
        this.name = "";
        this.price = 0;
        this.epiryDate = Year.of(2022);
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Year getEpiryDate() {
        return epiryDate;
    }

    public double total(Product product, int quantity) {
        double discount = 0;
        double pay = (quantity * product.price) - (quantity * product.price)*discount;
        if (quantity >= 50){
            discount = 8/100;
            return pay;
        }
        else if(quantity >= 20 && quantity <= 30){
            discount = 5/100;
            return pay;
        }
        return pay;
    }
    public boolean checkDate(Product product) {
        int year = Year.now().getValue();
        return product.epiryDate.getValue() == year;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Product{");
        sb.append("code=").append(code);
        sb.append(", name='").append(name).append('\'');
        sb.append(", price=").append(price);
        sb.append(", epiryDate=").append(epiryDate);
        sb.append('}');
        return sb.toString();
    }
}

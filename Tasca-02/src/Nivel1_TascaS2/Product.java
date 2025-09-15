package Nivel1_TascaS2;

public class Product {
    private String name;
    private double price;


    public Product(String name, double price) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("The procduct's name is not valid.");
        }
        if (price <= 0) {
            throw new IllegalArgumentException("The product's price is not valid.");
        }
        this.name = name;
        this.price = price;

    }


    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

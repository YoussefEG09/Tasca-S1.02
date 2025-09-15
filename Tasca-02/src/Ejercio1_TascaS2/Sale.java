package Ejercio1_TascaS2;

import java.util.ArrayList;
import java.util.List;

public class Sale {
    private final List<Product> list_products;
    private double final_price = 0.0;


    public Sale() {
        this.list_products = new ArrayList<>();
    }

    public List<Product> getList_products() {
        return list_products;
    }

    public double getFinal_price() {
        return final_price;
    }

    public double calculateTotal() throws SaleEmptyException {
        if (list_products.isEmpty()) {
            throw new SaleEmptyException();
        }
        double totalPrice = 0.0;
        for (Product product : list_products) {
            totalPrice += product.getPrice();
        }
        this.final_price = totalPrice;
        return totalPrice;
    }


    public void addProduct(Product product) {
        list_products.add(product);
    }


}

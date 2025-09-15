package Ejercio1_TascaS2;

import java.util.ArrayList;
import java.util.List;

public class Sale {
    private final List<Product> list_products;
    private double final_price;


    public Sale(double final_price) {
        this.final_price = final_price;

        this.list_products = new ArrayList<>();
    }

    public List<Product> getList_products() {
        return list_products;
    }

    public double getFinal_price() {
        return final_price;
    }

    public double Calculate_Total() {
        if (list_products.isEmpty()) {
            throw new SaleEmptyException("To make a sale, you first need to add products.");
        }
        double totalPrice = 0.0;
        int i = 0;
        for (Product:list_products) {
            totalPrice += Product.getPrice();

        }
    }


}

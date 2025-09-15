package Ejercio1_TascaS2;

import java.util.ArrayList;
import java.util.List;

public class Sale {
    private final List<Product> list_products;
    private double final_price;



    public Sale (double final_price) {
        this.final_price = final_price;

        this.list_products = new ArrayList<>();
    }


}

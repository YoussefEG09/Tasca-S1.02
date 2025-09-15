package Nivel1_TascaS2;

public class Main {
    public static void main(String[] args) {

        try {
            Sale sale = new Sale();
            sale.calculateTotal();
        } catch (SaleEmptyException e) {

            System.out.println(e.getMessage());
        }


        try {
            Sale sale = new Sale();
            sale.addProduct(new Product("milk", 2.15));
            sale.addProduct(new Product("bread", 4.15));
            System.out.println("Total price :" + sale.calculateTotal());
        } catch (SaleEmptyException e) {
            System.out.println(e.getMessage());
        }

        try {
            Sale sale = new Sale();
            sale.addProduct(new Product("chocolate", 1.95));
            sale.addProduct(new Product("cookie" , 1.30));
            System.out.println("Total price : " + sale.calculateTotal());
            Product p = sale.getList_products().get(5);
        }   catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        } catch (SaleEmptyException e){
            System.out.println(e.getMessage());
        }

    }
    }


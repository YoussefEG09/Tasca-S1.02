package Ejercio1_TascaS2;

public class Main {
    public static void main(String[] args) {



        try {
            Sale sale = new Sale();
            sale.CalculateTotal();
        } catch (SaleEmptyException e) {

            System.out.println(e.getMessage());
        }





    }
}

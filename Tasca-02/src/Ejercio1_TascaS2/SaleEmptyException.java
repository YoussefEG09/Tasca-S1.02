package Ejercio1_TascaS2;

public class SaleEmptyException extends Exception{

    public SaleEmptyException(){
        super ("To make a sale, you first need to add products.");
    }
}

package Decorator.Example.Component;

public class DecafBeverage extends Beverage {

    @Override
   public void getInfo() {
        super.getInfo();
        System.out.print(" Decaf");
    }

    @Override
    public int cost() {
        return 2;
    }
}

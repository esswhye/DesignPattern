package Decorator.Example.Component;

public class EspressoBeverage extends Beverage {

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.print("Espresso");
    }

    @Override
    public int cost() {
        return 0;
    }
}

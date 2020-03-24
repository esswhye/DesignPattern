package Decorator.Example.Decorator;


import Decorator.Example.Component.Beverage;

public class Caramel extends BeverageDecorator {

    private Beverage beverage;

    public Caramel(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public void getInfo() {
        this.beverage.getInfo();
        System.out.print("Add on Caramel (1)");
    }

    @Override
    public int cost() {
        return this.beverage.cost() + 1;
    }
}

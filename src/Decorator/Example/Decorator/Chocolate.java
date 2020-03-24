package Decorator.Example.Decorator;

import Decorator.Example.Component.Beverage;

public class Chocolate extends BeverageDecorator {
    private Beverage beverage;

    public Chocolate(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.print("Add on Chocolate (3)");
    }

    @Override
    public int cost() {
        return this.beverage.cost() + 3;
    }
}

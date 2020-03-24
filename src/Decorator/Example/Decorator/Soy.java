package Decorator.Example.Decorator;

import Decorator.Example.Component.Beverage;

public class Soy extends BeverageDecorator {

    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public void getInfo() {
        this.beverage.getInfo();
        System.out.println("Add on Soy (2)");
    }

    @Override
    public int cost() {
        return this.beverage.cost() + 2;
    }
}

package Decorator.Example.Component;

public abstract class Beverage {
    public void getInfo()
    {
        System.out.println("This is a Beverage");
    }
   public abstract int cost();
}

package Decorator.Example;

import Decorator.Example.Component.Beverage;
import Decorator.Example.Component.EspressoBeverage;
import Decorator.Example.Component.DecafBeverage;
import Decorator.Example.Decorator.BeverageDecorator;
import Decorator.Example.Decorator.Caramel;
import Decorator.Example.Decorator.Chocolate;
import Decorator.Example.Decorator.Soy;

public class Main {

    public static void main(String[] args) {
        DecafBeverage decafBeverage = new DecafBeverage();

        Beverage espressoBeverage = new EspressoBeverage();

        Beverage defSoyCaramel = new Caramel(decafBeverage);


        defSoyCaramel.getInfo();
        System.out.println();
        System.out.println("Total cost {} " + defSoyCaramel.cost());

        Beverage defAddOnespresso = new Caramel(new Soy(new Chocolate(espressoBeverage)));

        defAddOnespresso.getInfo();
        System.out.println();
        System.out.println("Total cost {} " + defAddOnespresso.cost());

    }
}

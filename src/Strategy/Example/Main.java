package Strategy.Example;

public class Main {
    public static void main(String[] args) {
        Duck duck = new Duck(new SimpleFly(), new SimpleQuack());
        duck.quack();
        duck.fly();

        Duck muteDuck = new Duck(new NoFly(),new NoQuack());
        muteDuck.fly();
        muteDuck.quack();
    }
}

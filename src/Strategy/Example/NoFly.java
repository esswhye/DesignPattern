package Strategy.Example;

public class NoFly implements iFly {

    @Override
    public void fly() {
        System.out.println("Can't fly..");
    }
}

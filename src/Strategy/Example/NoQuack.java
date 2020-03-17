package Strategy.Example;

public class NoQuack implements iQuack {
    @Override
    public void Quack() {
        System.out.println("Can't Quack");
    }
}

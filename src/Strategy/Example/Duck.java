package Strategy.Example;

public class Duck {
    private iFly fly;
    private iQuack quack;

    public Duck(iFly fly, iQuack quack) {
        this.fly = fly;
        this.quack = quack;
    }

    public void fly()
    {
        this.fly.fly();
    }

    public void quack()
    {
        this.quack.Quack();
    }

}

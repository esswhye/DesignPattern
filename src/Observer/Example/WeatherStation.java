package Observer.Example;

import java.util.LinkedList;
import java.util.List;

public class WeatherStation implements IObservable{

    private List<IObserver> observers = new LinkedList<>();

    private Double temp;

    @Override
    public void add(IObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        observers.forEach(observer -> observer.update());
    }

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }
}

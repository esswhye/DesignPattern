package Observer.Example;

public class FridgeDisplayWeatherApp implements IObserver{

    private WeatherStation weatherStation;

    public FridgeDisplayWeatherApp(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        this.weatherStation.add(this);
    }

    @Override
    public void update() {
        System.out.println(this + ": The current temperature now is " + weatherStation.getTemp().toString() + " degree!");
    }
}

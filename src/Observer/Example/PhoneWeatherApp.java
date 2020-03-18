package Observer.Example;

public class PhoneWeatherApp implements IObserver {

    private WeatherStation weatherStation;

    public PhoneWeatherApp(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        //this.
        this.weatherStation.add(this);
    }

    @Override
    public void update() {
        System.out.println(this + ": The current temperature now is " + weatherStation.getTemp().toString() + " degree!");
    }
}

package Observer.Example;

public class Main {

    public static void main(String[] args) {

        WeatherStation weatherStation = new WeatherStation();
        PhoneWeatherApp phoneWeatherApp = new PhoneWeatherApp(weatherStation);
        PhoneWeatherApp phoneWeatherApp1 = new PhoneWeatherApp(weatherStation);
        FridgeDisplayWeatherApp fridgeDisplayWeatherApp = new FridgeDisplayWeatherApp(weatherStation);
        weatherStation.setTemp(36.00);
        weatherStation.notifyObserver();

        new Thread(()->{
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            weatherStation.setTemp(40.00);
            weatherStation.notifyObserver();
        }).start();
    }
}

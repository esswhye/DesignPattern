package AbstractFactory.Example;

public class Main {

    public static void main(String[] args) {
        LightPhoneUI lightPhoneUI = new LightPhoneUI();
        lightPhoneUI.print();

        DarkPhoneUI darkPhoneUI = new DarkPhoneUI();
        darkPhoneUI.print();

    }
}

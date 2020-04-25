package AbstractFactory.Example.Font;

public class WhiteFontImpl implements Font {
    @Override
    public void colour() {
        System.out.println("Font Colour: White");
    }
}

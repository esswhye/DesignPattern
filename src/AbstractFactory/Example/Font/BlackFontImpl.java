package AbstractFactory.Example.Font;

public class BlackFontImpl implements Font {
    @Override
    public void colour() {
        System.out.println("Font Colour: Black");
    }
}

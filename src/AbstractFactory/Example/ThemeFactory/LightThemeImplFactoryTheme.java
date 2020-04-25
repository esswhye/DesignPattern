package AbstractFactory.Example.ThemeFactory;

import AbstractFactory.Example.Background.Background;
import AbstractFactory.Example.Background.WhiteImplBackground;
import AbstractFactory.Example.Button.Button;
import AbstractFactory.Example.Button.CircleImplButton;
import AbstractFactory.Example.Font.BlackFontImpl;
import AbstractFactory.Example.Font.Font;

public class LightThemeImplFactoryTheme implements FactoryTheme {
    @Override
    public Background background() {
        return new WhiteImplBackground();
    }

    @Override
    public Font font() {
        return new BlackFontImpl();
    }

    @Override
    public Button button() {
        return new CircleImplButton();
    }

}

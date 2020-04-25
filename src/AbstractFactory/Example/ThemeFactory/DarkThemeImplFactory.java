package AbstractFactory.Example.ThemeFactory;

import AbstractFactory.Example.Background.Background;
import AbstractFactory.Example.Background.BlackImplBackground;
import AbstractFactory.Example.Button.Button;
import AbstractFactory.Example.Button.RectangleImplButton;
import AbstractFactory.Example.Font.Font;
import AbstractFactory.Example.Font.WhiteFontImpl;

public class DarkThemeImplFactory implements FactoryTheme {
    @Override
    public Background background() {
        return new BlackImplBackground();
    }

    @Override
    public Font font() {
        return new WhiteFontImpl();
    }

    @Override
    public Button button() {
        return new RectangleImplButton();
    }
}

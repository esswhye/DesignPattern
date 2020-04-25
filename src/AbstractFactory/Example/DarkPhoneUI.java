package AbstractFactory.Example;

import AbstractFactory.Example.Background.Background;
import AbstractFactory.Example.Button.Button;
import AbstractFactory.Example.Font.Font;
import AbstractFactory.Example.ThemeFactory.DarkThemeImplFactory;
import AbstractFactory.Example.ThemeFactory.FactoryTheme;
import AbstractFactory.Example.ThemeFactory.LightThemeImplFactoryTheme;

public class DarkPhoneUI {
    private FactoryTheme lightTheme;
    private Background background;
    private Font font;
    private Button button;

    public DarkPhoneUI() {
        this.lightTheme = new DarkThemeImplFactory();
        this.background = lightTheme.background();
        this.font = lightTheme.font();
        this.button = lightTheme.button();
    }

    void print() {
        button.button();
        background.background();
        font.colour();
    }
}

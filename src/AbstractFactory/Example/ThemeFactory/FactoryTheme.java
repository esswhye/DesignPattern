package AbstractFactory.Example.ThemeFactory;

import AbstractFactory.Example.Background.Background;
import AbstractFactory.Example.Button.Button;
import AbstractFactory.Example.Font.Font;

public interface FactoryTheme {
    Background background();

    Font font();

    Button button();

}

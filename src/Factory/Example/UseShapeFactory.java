package Factory.Example;

import Factory.Example.Factory.GetShapeImpl;
import Factory.Example.Shape.Shape;

public class UseShapeFactory {
    public static void main(String[] args) {
        GetShapeImpl getShape = new GetShapeImpl();
        Shape shape = getShape.getShape(2);
        shape.printShape();
    }
}

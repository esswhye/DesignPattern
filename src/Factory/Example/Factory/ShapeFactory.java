package Factory.Example.Factory;

import Factory.Example.Shape.Shape;

public interface ShapeFactory {

    Shape getShape(int n);
}

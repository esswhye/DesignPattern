package Factory.Example.Factory;

import Factory.Example.Shape.CircleImpl;
import Factory.Example.Shape.RectangleImpl;
import Factory.Example.Shape.Shape;
import Factory.Example.Shape.TriangleImpl;

public class GetShapeImpl implements ShapeFactory {

    @Override
    public Shape getShape(int n) {
        switch (n) {
            case 1:
                return new CircleImpl();
            case 2:
                return new RectangleImpl();
            case 3:
                return new TriangleImpl();
            default:
                System.out.println("1-3");
        }
        return null;
    }
}

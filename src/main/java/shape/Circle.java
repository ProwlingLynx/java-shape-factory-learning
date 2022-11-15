package shape;

import base.ShapeBase;

public class Circle extends ShapeBase {
    public Circle(String name, int width, int height) {
        super(name, width, height);
    }

    @Override
    public int calculateArea() {
        return (int) 3.14 * (width/2) * (width/2);
    }
}
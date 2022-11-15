package shape;

import base.ShapeBase;

public class Circle extends ShapeBase {
    public Circle(String name, int width, int height) {
        super(name, width, height);
    }

    @Override
    public double calculateArea() {
        return Math.PI * (width/2) * (width/2);
    }
}

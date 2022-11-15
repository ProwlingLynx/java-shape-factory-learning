package shape;

import base.ShapeBase;

public class Oval extends ShapeBase {
    public Oval(String name, int width, int height) {
        super(name, width, height);
    }

    @Override
    public double calculateArea() {
        return (width / 2) * (height / 2) * Math.PI;
    }
}

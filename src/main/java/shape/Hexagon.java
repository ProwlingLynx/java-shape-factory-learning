package shape;

import base.ShapeBase;

public class Hexagon extends ShapeBase {
    public Hexagon(String name, int width, int height) {
        super(name, width, height);
    }

    @Override
    public double calculateArea() {
        return ((3 * Math.sqrt(3))/2) * (width/2) * (height/2);
    }
}

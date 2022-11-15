package test;

import base.ShapeBase;
import shape.*;

public class Test {
    private static void displayArea(ShapeBase base) {

        System.out.println("Display the area for shape named " + base.getName()
                        + " width =" + base.getWidth()
                        + " height=" + base.getHeight()
                        + " The area is " + base.calculateArea()
                );
    }

    public static void main(String[] args) {
        ShapeBase[] shapes = new ShapeBase[5];
        shapes[0] = new Rectangle("rect", 10, 20);
        shapes[1] = new Triangle("tri", 10, 20);
        shapes[2] = new Hexagon("hex", 20,20);
        shapes[3] = new Circle("circ", 20, 20);
        shapes[4] = new Oval("oval", 20, 10);

        for (int i =0; i < shapes.length; i++) {
            displayArea(shapes[i]);
        }
    }
}

package base;

public class ShapeBase implements IShape {
    protected String name;
    protected int width, height;

    public ShapeBase(String name, int width, int height) {
        this.name = name;
        this.width = width;
        this.height = height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public double calculateArea() {
        return 0;
    }
}

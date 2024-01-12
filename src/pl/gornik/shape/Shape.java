package pl.gornik.shape;

public class Shape {

    private String name;
    private char size;
    private Color color;

    public Shape(String name, char size, Color color) {
        this.name = name;
        this.size = size;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", color=" + color.getColor() +
                '}';
    }
}

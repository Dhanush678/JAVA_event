abstract class Shapeclass {

    protected double area;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public abstract void calculateArea();
}

class Triangleclass extends Shapeclass {

    private double base;
    private double height;

    public Triangleclass(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void calculateArea() {
        area = 0.5 * base * height;
    }
}

class Rectangleclass extends Shapeclass {

    private double width;
    private double height;

    public Rectangleclass(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void calculateArea() {
        area = width * height;
    }
}

class Circleclass extends Shapeclass {

    private double radius;

    public Circleclass(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        area = Math.PI * radius * radius;
    }
}

public class problem_12 {

    public static void main(String[] args) {
        Triangleclass Triangleclass = new Triangleclass(10, 20);
        Triangleclass.calculateArea();
        System.out.println("The area of the Triangleclass is: " + Triangleclass.getArea());

        Rectangleclass Rectangleclass = new Rectangleclass(10, 20);
        Rectangleclass.calculateArea();
        System.out.println("The area of the Rectangleclass is: " + Rectangleclass.getArea());

        Circleclass Circleclass = new Circleclass(10);
        Circleclass.calculateArea();
        System.out.println("The area of the Circleclass is: " + Circleclass.getArea());
    }
}

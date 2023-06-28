abstract class Shape {
     int width;
     int height;
    public Shape(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public abstract void printArea();
}
class Rectangle extends Shape {
    public Rectangle(int width, int height) {
        super(width, height);
    }
    public void printArea() {
        int area = width * height;
        System.out.println("Area of Rectangle: " + area);
    }
}
class Triangle extends Shape {
    public Triangle(int width, int height) {
        super(width, height);
    }
    public void printArea() {
        double area = 0.5 * width * height;
        System.out.println("Area of Triangle: " + area);
    }
}
class Circle extends Shape {
    public Circle(int radius) {
        super(radius, 0);
    }
    public void printArea() {
        double area = Math.PI * width * width;
        System.out.println("Area of Circle: " + area);
    }
}
public class problem_10 {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(4, 5);
        rectangle.printArea();

        Shape triangle = new Triangle(3, 6);
        triangle.printArea();

        Shape circle = new Circle(2);
        circle.printArea();
    }
}

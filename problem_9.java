public class problem_9 {

    public static double calculateArea(double length, double width) {
        return length * width;
    }
    public static double calculateArea(double side) {
        return side * side;
    }
    public static double calculateArea(double radius,int pi) {
        return pi * radius * radius;
    }
    public static void main(String[] args) {
        double length = 5.0;
        double width = 3.0;
        double side = 4.0;
        double radius = 2.5;
        double rectangleArea = calculateArea(length, width);
        System.out.println("Area of Rectangle: " + rectangleArea);
        double squareArea = calculateArea(side);
        System.out.println("Area of Square: " + squareArea);
        double circleArea = calculateArea(radius,3.14);
        System.out.println("Area of Circle: " + circleArea);
    }
}

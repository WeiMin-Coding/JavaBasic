public class Homework05 {
    public static void main(String[] args) {
        Circle circle = new Circle(4.5);
        double res = circle.calculatePerimeter();
        System.out.println(res);
    }
}

class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculatePerimeter() {
        return 3.14 * radius * radius;
    }
}

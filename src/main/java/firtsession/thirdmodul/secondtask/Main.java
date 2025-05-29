package firtsession.thirdmodul.secondtask;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        Circle circle = new Circle(3.6);
        double areaOfRectangle = ShapeMetricCalculator.calculateRectangleArea(rectangle);
        double areaOfCircle = ShapeMetricCalculator.calculateCircleArea(circle);

        System.out.println(areaOfRectangle);
        System.out.println(areaOfCircle);
    }
}

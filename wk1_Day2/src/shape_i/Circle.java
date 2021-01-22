package shape_i;

/**
 * @author jeongkim
 *
 */

public class Circle implements Shape {

    private double radius;

    public Circle(double radius) {

        this.radius = radius;

    }

    @Override
    public double calculateArea() {

        double area = Math.PI * (radius * radius);

        return area;

    }


}

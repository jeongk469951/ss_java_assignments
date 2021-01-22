package shape_i;


/**
 * @author jeongkim
 */

public class Triangle implements Shape {

    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }


    @Override
    public double calculateArea() {

        double area = 0.5 * (base * height);

        return area;
    }





}

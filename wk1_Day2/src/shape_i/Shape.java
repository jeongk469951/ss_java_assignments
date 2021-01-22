package shape_i;

/**
 * @author jeongkim
 */

public interface Shape {

    double calculateArea();

    default void display() {
        System.out.println("Area is " + calculateArea());
    }
}

import java.nio.channels.ClosedByInterruptException;
import java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy;

public class Circle {
    private double radius;
    private Point2D center = new Point2D(5, 2);
    private double pi = 3.14159265359;

    public Circle(double radius, Point2D center) {
        this.radius = radius;
        this.center = center;
    }

    public Circle(int i, int j, int k) {
    }

    public double getArea() {
        double res = 0.0;
        res = (pi)*(radius*radius);
        return res;
    }
    public double getCircumference() {
        double res = 0.0;
        res = 2*(pi)*(radius);
        return res;
    }

    public boolean intersects(Circle other) {
        if (center.distanceTo(other.center) < radius+other.radius) {
            return true;
        } else {
            return false;
        }
    }

    public boolean contains(Circle other) {
        if ((center.distanceTo(other.center) + other.radius) < radius) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
        Point2D AC = new Point2D(0, 0);
        Point2D BC = new Point2D(10, 0);
        Circle A = new Circle(5,BC);
        Circle B = new Circle(4,AC);

        System.out.println("The area of Circle A is " + A.getArea());
        System.out.println("The area of Circle B is " + B.getArea());
        System.out.println("The circumference of Circle A is " + A.getCircumference());
        System.out.println("The circumference of Circle B is " + B.getCircumference());

        if (A.intersects(B)) {
            System.out.println("Circle A intersects Circle B");
        } else {
            System.out.println("Circle A does not intersect Circle B");
        }
        if (A.contains(B)) {
            System.out.println("Circle A contains Circle B");
        } else if (B.contains(A)) {
            System.out.println("Circle B contains Circle A");
        } else {
            System.out.println("Neither Circle A or B contain one another");
        }

    }
}

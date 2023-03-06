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

    public double getArea() {
        double res = 0.0;
        res = (pi*radius)*(pi*radius);
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
        
    }
}

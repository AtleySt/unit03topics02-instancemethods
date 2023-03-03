import javax.print.attribute.standard.MediaSize.Other;

public class Point2D {
    private double X;
    private double Y;

    public Point2D(int X, int Y) {
        this.X = X;
        this.Y = Y;
    }

    // accessor methods
    public double getX() {
        return X;
    }
    public double getY() {
        return Y;
    }

    // mutator methods
    public void setX(double x) {
        X = x;
    }
    public void setY(double y) {
        Y = y;
    }
    public double distanceTo(Point2D other) {
        double result = 0;
        result = (Math.sqrt(((other.X-X)*(other.X-X))+((other.Y-Y)*(other.Y-Y))));
        return result;
    }

    public String toString() {
        String result = "";
        result = "("+ X + ", " + Y + ")";
        return result;
    }

    public static void main(String[] args) {
        Point2D A = new Point2D(0, 0);
        Point2D B = new Point2D(4, 3);

        System.out.println(A.distanceTo(B));
    }
}

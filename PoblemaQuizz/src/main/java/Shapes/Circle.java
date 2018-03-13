package Shapes;

public class Circle {
    public int r;
    static double pi = 3.14;

    public double calculatePerimeterCircle() {
        double p = 2*pi*r;
        System.out.println("Perimeter of Circle is ");
        return p;
    }

    public double calculateSurfaceSquare(){
        double s= (pi*r)*(pi*r);
        System.out.println("Surface of Circle is");
        return s;
    }



    public Circle(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public static double getPi() {
        return pi;
    }

    public static void setPi(double pi) {
        Circle.pi = pi;
    }
}
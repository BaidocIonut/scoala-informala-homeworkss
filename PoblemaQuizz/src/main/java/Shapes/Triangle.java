package Shapes;

public class Triangle {


    public int a;
    public int base;
    public int c;
    public double height;


    public int calculatePerimeterTriangle() {
        int p = a + base + c;
        System.out.println("Perimeter of triangle is ");
        return p;
    }

    public double calculateSurfaceTriangle() {
        double s = (base * height) / 2;
        System.out.println("Surface of triangle is");
        return s;
    }

    public Triangle(int a, int base, int c, double height) {
        this.a = a;
        this.base = base;
        this.c = c;
        this.height = height;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}
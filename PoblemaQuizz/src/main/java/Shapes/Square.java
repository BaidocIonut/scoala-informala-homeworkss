package Shapes;

public class Square {


    public int l;


    public int calculatePerimeterSquare() {
        int p = 4 * l;
        System.out.println("Perimeter of square ");
        return p;
    }

    public int calulateSurfaceSquare() {
        int s = l * l;
        System.out.println("Surface of Square");
        return s;
    }

    public Square(int l) {
        this.l = l;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }
}


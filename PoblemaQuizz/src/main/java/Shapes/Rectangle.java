package Shapes;

public class Rectangle {


    public int length;
    public int windth;

    public int calculatePerimetreRectangle(){
        int p= 2*(length + windth);
        System.out.println("Perimeter is ");
        return p;

    }
    public int calculateSurfaceRectangle(){
         int s = length * windth;
        System.out.println("Surface is ");
        return s;
    }

    public Rectangle(int length, int windth) {
        this.length = length;
        this.windth = windth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWindth() {
        return windth;
    }

    public void setWindth(int windth) {
        this.windth = windth;
    }
}
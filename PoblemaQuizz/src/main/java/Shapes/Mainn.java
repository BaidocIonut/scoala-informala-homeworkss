package Shapes;

public class Mainn {
    public static void main(String[] args) {

        Rectangle r = new Rectangle(2, 3);
        r.calculatePerimetreRectangle();
        r.calculateSurfaceRectangle();

        // diplicate of shape

        Rectangle r1 = new Rectangle(2,3);
                r1.calculatePerimetreRectangle();
                r1.calculateSurfaceRectangle();


        Triangle triangle = new Triangle(2, 6, 3, 1.6);
        triangle.calculatePerimeterTriangle();
        triangle.calculateSurfaceTriangle();

        // pairs of shape

        Triangle triangle1 = new Triangle(3,7,4,1.7);
        triangle1.calculatePerimeterTriangle();
        triangle1.calculateSurfaceTriangle();


        Square square = new Square(4);
        square.calculatePerimeterSquare();
        square.calulateSurfaceSquare();

        Square squere1 = new Square(6);
        squere1.calculatePerimeterSquare();
        squere1.calulateSurfaceSquare();


// method check similar
        public void checkObject(){

            if(r!= null);
            r1=null;
            System.out.println("Similar shape");
            if(triangle != null);
            triangle1=null;
            System.out.println("Similar shape ");
            if(square!=null);
            System.out.println("Similar shape");
        }


    }
}
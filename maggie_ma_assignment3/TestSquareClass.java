public class TestSquareClass {
  public static void main(String[] args){
    // declare point1
    Point point1 = new Point(2.0, 2.0);

    // declare square1
    Square square1 = new Square(point1, 4);

    // print out square info
    square1.squareToString();

    // print out corner point information
    Point[] corners = square1.getSquare_Corners();
    String corner0 = "(" + corners[0].getX() + ", " + corners[0].getY() + ")";
    String corner1 = "(" + corners[1].getX() + ", " + corners[1].getY() + ")";
    String corner2 = "(" + corners[2].getX() + ", " + corners[2].getY() + ")";
    String corner3 = "(" + corners[3].getX() + ", " + corners[3].getY() + ")";
    System.out.println("The corners of the square are located at " + corner0 + ", " + corner1 + ", " + corner2 + ", and " + corner3);
    // this should print out "The corners of the square are located at (4,4), (0,4), (0,0), and (4,0)"

    // declare a square array
    Square[] threeSquares = new Square[3];
    Point p1 = new Point(5.0,5.0);
    Square s1 = new Square(p1, 1.5);
    threeSquares[0] = s1;
    Point p2 = new Point(1.0,1.0);
    Square s2 = new Square(p2, 3);
    threeSquares[1] = s2;
    Point p3 = new Point(1.0,1.0);
    Square s3 = new Square(p3, 2);
    threeSquares[2] = s3;

    // use for loop to print square information
    for (int i = 0; i < threeSquares.length; i++){
      threeSquares[i].squareToString();
    }

    // find the overlapping area of the squares
    for (int j = 0; j < threeSquares.length; j++){
      double area = square1.getOverLappingArea(threeSquares[j]);
      System.out.printf("The overlapping area of the original square and Square[%d] is %.2f. \n", j, area);
    }
  }
}

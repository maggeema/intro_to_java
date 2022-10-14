public class Square {
  private double side = 10;
  private Point central_point = new Point(0.0,0.0);

  Square(Point central_point, double side){
    this.central_point = central_point;
    this.side = side;
  }

  Square(){
  }

  public void setSide(double side){
    this.side = side;
  }

  public double getSide(double side){
    return side;
  }

  public void setCentral_point(Point central_point){
    this.central_point = central_point;
  }

  public Point getCentral_point(Point central_point){
    return central_point;
  }

  double getArea(){
    return this.side * this.side;
  }

  double getPerimeter() {
    return 4 * this.side;
  }

  public double squareGetDistance(Point another_point){
    Point pointA = new Point(0,0);
    pointA.setX(central_point.getX() + side/2);
    pointA.setY(central_point.getY() + side/2);
    double distance = pointA.pointGetDistance(another_point);
    return distance;
  }

  public Point[] getSquare_Corners(){
    Square thissquare = new Square(this.central_point, this.side);
    Point[] corners = new Point[4];
    Point pointA = new Point(0,0);
    double x = this.central_point.getX();
    double y = this.central_point.getY();
    pointA.setX(x + (this.side/2));
    pointA.setY(y + (this.side/2));

    corners[0] = new Point(pointA.getX(), pointA.getY());

    pointA.setX(pointA.getX() - side);
    corners[1] = new Point(pointA.getX(), pointA.getY());
    pointA.setY(pointA.getY() - side);
    corners[2] = new Point(pointA.getX(), pointA.getY());
    pointA.setX(pointA.getX() + side);
    corners[3] = new Point(pointA.getX(), pointA.getY());

    return corners;
  }

  public void squareToString(){
    System.out.print(this.central_point.pointToString());
    System.out.print("Side information: " + this.side + ".\n");
  }

  double getOverLappingArea(Square other_square){
    double area = -1;
    Square square1 = new Square(this.central_point, this.side);
    double square1_area = getArea();
    Point[] s1_points = square1.getSquare_Corners();

    Square square2 = other_square;
    double square2_area = getArea();
    Point[] s2_points = square2.getSquare_Corners();

    // check to see if overlapping
    boolean isOverlapping = false;
    boolean insideSquare = false;

    // Left x
    double leftX = Math.max(s1_points[2].getX(), s2_points[2].getX());
    // Right x
    double rightX = Math.min(s1_points[0].getX(), s2_points[0].getX());
    // Bottom y
    double botY = Math.max(s1_points[2].getY(), s2_points[2].getY());
    // TopY
    double topY = Math.min(s1_points[0].getY(), s2_points[0].getY());

    if (rightX > leftX && topY > botY){
       isOverlapping = true;
     } else {
       isOverlapping = false;
       area = 0.0;
     }

    // check to see if overlapping and inside one another
    if (isOverlapping == true){
      // check to see if smaller square is in bigger square
      if (square1_area > square2_area){
        // check if square 2 is inside square 1 with the corner coordinates
        if (s1_points[0].getX() > s2_points[0].getX() && s1_points[0].getY() > s2_points[0].getY() && s1_points[2].getX() > s2_points[2].getX() && s1_points[2].getY() > s2_points[2].getY()){
          insideSquare = true;
          area = square2_area;
        }
        // otherwise, check if square 1 is inside square 2 with the corner coordinates
      } else if (square2_area > square1_area){
        if (s1_points[0].getX() < s2_points[0].getX() && s1_points[0].getY() < s2_points[0].getY() && s1_points[2].getX() < s2_points[2].getX() && s1_points[2].getY() < s2_points[2].getY()){
          insideSquare = true;
          area = square1_area;
        }
      }
    }

    // if it is overlapping but not inside each other, find the area using distance of diagonal
    if (isOverlapping == true && insideSquare == false){
      double diagonal1 = s1_points[2].pointGetDistance(s2_points[0]);
      double diagonal2 = s2_points[2].pointGetDistance(s1_points[0]);
      double diagonal = 0;
      if (diagonal1 > diagonal2){
        diagonal = diagonal2;
      } else {
        diagonal = diagonal1;
      }
      double areaOfOverlap = 0.5 * Math.pow(diagonal, 2);
      area = areaOfOverlap;
    }
    return area;
  }
}

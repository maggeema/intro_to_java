// import java.util.*;
// import org.javatuples.KeyValue;

class Square {
  // a variable with type of double named side initialized to 10
  double side = 10;
  // one data field for array cooridinates
  public int[] central_point = {0,0};
  public int[] other_point = {-5,5};

  // one constructor with two arguments
  Square(int[] newCentral_point, double newSide){
  }

  // second constructor with one argument
  Square(int[] newCentral_point){
  }

  // four methods
  public void setCentral_point(int[] newCentral_point){
    central_point = newCentral_point;
  }

  public int[] getCentral_point(int[] newCentral_point){
    central_point = newCentral_point;
    return central_point;
  }

  public double getDistance(int[] other_point){
    double distance = 0.;

    int[] central_point = getCentral_point(central_point);
    int x = other_point[0] - central_point[0];
    int y = other_point[1] - central_point[1];

    distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    return distance;
  }

  public int[][] getSquare_Corners(){
    int[][] corners = new int[4][2];

    int[] central_point = getCentral_point(central_point);

    corners[0][0] = other_point[0];
    corners[0][1] = other_point[1];
    corners[1][0] = other_point[0] + (int)(side);
    corners[1][1] = other_point[1];
    corners[2][0] = other_point[0];
    corners[2][1] = other_point[1] - (int)(side);
    corners[3][0] = other_point[0] - (int)(side);
    corners[3][1] = other_point[1];

    return corners;
  }


  // one constructor without arguments
  Square() {
  }

  // one constructor with arguments
  Square(double newSide){
    side = newSide;
  }

  // return the area of the square as a double
  double getArea(){
    // since side is already doubled, double times double will equal double anyway
    return side * side;
  }

  // return the perimeter of a square as a double
  double getPerimeter() {
    return 4 * side;
  }

  // set a side for the square
  void setSide (double newSide){
    side = newSide;
  }

}

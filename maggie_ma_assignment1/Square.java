class Square {
  // a variable with type of double named side initialized to 10
  double side = 10;

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

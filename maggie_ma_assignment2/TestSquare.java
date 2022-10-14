public class TestSquare {
  public static void main(String[] args){
    Square square0 = new Square();
    System.out.println("The area of the square of side " + square0.side +
    " is " + square.getArea());
    System.out.println("The perimeter of the square of side " + square0.side +
    " is " + square1.getPerimeter());

    Square square1 = new Square(20);
    System.out.println("The area of the square of side " + square1.side +
    " is " + square1.getArea());
    System.out.println("The perimeter of the square of side " + square1.side +
    " is " + square1.getPerimeter());

    Square square2 = new Square(40);
    System.out.println("The area of the square of side " + square2.side +
    " is " + square2.getArea());
    System.out.println("The perimeter of the square of side " + square2.side +
    " is " + square2.getPerimeter());

    square2.setSide(80);
    System.out.println("The area of the square of side " + square2.side +
    " is " + square2.getArea());
    System.out.println("The perimeter of the square of side " + square2.side +
    " is " + square2.getPerimeter());

    Square square3 = new Square([0,0], 10);
    System.out.println("The central point is " + sqaure3.getCentral_point);
    square3.setCentral_point([1,1]);
    System.out.println("The central point is " + square3.getcentral_point);
    getDistance(other_point);
    System.out.println(getSquare_Corners());
  }
}

public class TestSquare {
  public static void main(String[] args){
    Square square1 = new Square();
    System.out.println("The area of the square of side " + square1.side +
    " is " + square1.getArea());
    System.out.println("The perimeter of the square of side " + square1.side +
    " is " + square1.getPerimeter());

    Square square2 = new Square(20);
    System.out.println("The area of the square of side " + square2.side +
    " is " + square2.getArea());
    System.out.println("The perimeter of the square of side " + square2.side +
    " is " + square2.getPerimeter());

    Square square3 = new Square(40);
    System.out.println("The area of the square of side " + square3.side +
    " is " + square3.getArea());
    System.out.println("The perimeter of the square of side " + square3.side +
    " is " + square3.getPerimeter());

    square3.setSide(80);
    System.out.println("The area of the square of side " + square3.side +
    " is " + square3.getArea());
    System.out.println("The perimeter of the square of side " + square3.side +
    " is " + square3.getPerimeter());
  }
}

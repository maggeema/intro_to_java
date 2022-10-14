public class Point {
  private double x = 0.0;
  private double y = 0.0;

  Point(){
  }

  Point(double x, double y){
    this.x = x;
    this.y = y;
  }

  public double getX(){
    return this.x;
  }

  public double getY(){
    return this.y;
  }

  public void setX(double x){
    this.x = x;
  }

  public void setY(double y){
    this.y = y;
  }

  public double pointGetDistance(Point other_point){
    Point original_point = new Point(this.x, this.y);
    Point another_point = other_point;
    double diffx = other_point.getX() - original_point.getX();
    double diffy = other_point.getY() - original_point.getY();
    double distance = Math.sqrt(Math.pow(diffx, 2) + Math.pow(diffy, 2));
    return distance;
  }

  public String pointToString(){
    return "Point information: x = " + this.x + ", y = " + this.y + ". ";
  }
}

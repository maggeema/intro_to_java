public class Person_information{
  private double age = 0.0;
  private double height = 0.0;
  private double weight = 0.0;

  Person_information(double height, double weight, double age){
    this.height = height;
    this.weight = weight;
    this.age = age;
  }

  Person_information(){
  }

  public double getAge(){
    return this.age;
  }

  public double getHeight(){
    return this.height;
  }

  public double getWeight(){
    return this.weight;
  }

  public void setAge(double age){
    this.age = age;
  }

  public void setHeight(double height){
    this.height = height;
  }

  public void setWeight(double weight){
    this.weight = weight;
  }

  public double getBMI(double weight, double height){
    double  KILOGRAMS_PER_POUND = 0.45359237; // Constant
    double METERS_PER_INCH = 0.0254; // Constant

    double new_weight = weight*KILOGRAMS_PER_POUND;
    double new_height = height*METERS_PER_INCH;

    double bmi = new_weight/(new_height)/(new_height);

    return bmi;
  }

  public String getStatus(){
    double bmi = getBMI(this.weight, this.height);

    if (bmi <18.5){
      return "Underweight";
    } else if (bmi<=24.9){
      return "Healthy";
    } else if (bmi<=29.9){
      return "Overweight";
    } else {
      return "Obese";
    }
  }

  public String bmiToString(){
    // "Person information => Name: " + getName() +
    return "Age: " + this.age + ", Height (inches): " + this.height + ", Weight (lbs): " + this.height;
  }

}

// this is my draft
public class Project1 {
  public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    String courselist = "1";
    String course1, grade1, course2, grade2, course3, grade3, course4, grade4;
    int credit1, credit2, credit3, credit4;
    double gradePoints1, gradePoints2, gradePoints3, gradePoints4;

    // prompt user to enter course number
    System.out.println("Enter course number: ");
    course1 = scanner.next();
    if (course1.equals("Done")){
      courselist = "Done";
    }

  // prompt the user to enter the data about 0 to 4 courses
switch (courselist){
  case "1": {
      // prompt user to enter credit hours
      System.out.println("Enter credit hours for " + course1 + ": ");
      credit1 = scanner.nextInt();

      // prompt user to enter letter grade for courses
      System.out.println("Enter letter grade for " + course1 + ": ");

      grade1 = scanner.next();
      // input validation
        if (grade1 != "A" || grade1 != "B" || grade1 != "C" || grade1 != "D" || grade1 != "F"){
              System.out.println("Grade " + grade1 + "is not recognized");
        } else {
          switch (grade1) {
            case "A" :
              gradePoints1 = 4.0;
            case "B":
              gradePoints1 = 3.0;
            case "C":
              gradePoints1 = 2.0;
            case "D":
              gradePoints1 = 1.0;
            case "E":
              gradePoints1 = 0.0;
            case "F":
              gradePoints1 = 0.0;
          }
        }

      // restart the cycle
      System.out.println("Enter course number: ");
      if (course1.equals("Done")){
        courselist = "Done";
      } else {
      courselist = "2";
    }
  }


  case "2":{
      // prompt user to enter credit hours
      System.out.println("Enter credit hours for " + course2 + ": ");
      credit2 = scanner.nextInt();

      // prompt user to enter letter grade for courses
      System.out.println("Enter letter grade for " + course2 + ": ");
      grade2 = scanner.next();

      // input validation
      if (grade2 != "A" || grade2 != "B" || grade2 != "C" || grade2 != "D" || grade2 != "F"){
            System.out.println("Grade " + grade2 + "is not recognized");
      } else {
        switch (grade2) {
          case "A" :
            gradePoints2 = 4.0;
          case "B":
            gradePoints2 = 3.0;
          case "C":
            gradePoints2 = 2.0;
          case "D":
            gradePoints2 = 1.0;
          case "E":
            gradePoints2 = 0.0;
          case "F":
            gradePoints2 = 0.0;
        }
      }

      // restart the cycle
      System.out.println("Enter course number: ");
      if (course1.equals("Done")){
        courselist = "Done";
      } else {
      courselist = "3";
    }
  }


  case "3":{
      // prompt user to enter credit hours
      System.out.println("Enter credit hours for " + course3 + ": ");
      credit3 = scanner.nextInt();

      // prompt user to enter letter grade for courses
      System.out.println("Enter letter grade for " + course3 + ": ");
      grade3 = scanner.next();

      // input validation
      if (grade3 != "A" || grade3 != "B" || grade3 != "C" || grade3 != "D" || grade3 != "F"){
            System.out.println("Grade " + grade3 + "is not recognized");
      } else {
        switch (grade3) {
          case "A" :
            gradePoints3 = 4.0;
          case "B":
            gradePoints3 = 3.0;
          case "C":
            gradePoints3 = 2.0;
          case "D":
            gradePoints3 = 1.0;
          case "E":
            gradePoints3 = 0.0;
          case "F":
            gradePoints3 = 0.0;
        }
      }

      // restart the cycle
      System.out.println("Enter course number: ");
      if (course1.equals("Done")){
        courselist = "Done";
      } else {
        courselist = "4";
      }
    }


  case "4":{
    // if the user typed out a fourth course:
    if (course4 != "N/A"){
      // prompt user to enter credit hours
      System.out.println("Enter credit hours for " + course4 + ": ");
      credit4 = scanner.nextInt();

      // prompt user to enter letter grade for courses
      System.out.println("Enter letter grade for " + course4 + ": ");
      grade4 = scanner.next();

      // input validation
      if (grade4 != "A" || grade4 != "B" || grade4 != "C" || grade4 != "D" || grade4 != "F"){
            System.out.println("Grade " + grade4 + "is not recognized");
      } else {
        switch (grade4) {
          case "A" :
            gradePoints4 = 4.0;
          case "B":
            gradePoints4 = 3.0;
          case "C":
            gradePoints4 = 2.0;
          case "D":
            gradePoints4 = 1.0;
          case "E":
            gradePoints4 = 0.0;
          case "F":
            gradePoints4 = 0.0;
        }
      }

      // end the cycle
      courselist = "Done";
      }
    }

  case "Done":{
      double totalCredits = credit1 + credit2 + credit3 + credit4;
      double totalGradePoints = ((credit1 * gradePoints1) +
                                  (credit2 * gradePoints2) +
                                  (credit3 * gradePoints2) +
                                  (credit4 * gradePoints4));
      double gpa = ((totalGradePoints / totalCredits) * 100) * .01;

      if (course1.equals("Done")){
        System.out.println("\t  Course" +  "\t\t\t\t Credits" + "\t\t\t Grade" + "\t\t\t Grade Points" + "\n" +
                           "\t\t Total" + "\t\t\t\t 0" + "\t\t\t\t\t\t\t\t\t\t 0.0 \n" +
                           "\t\t  GPA" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t N/A");
      } else if (course2.equals("Done")) {
        System.out.println("\t  Course" +  "\t\t\t\t Credits" + "\t\t\t Grade" + "\t\t\t Grade Points" + "\n" +
                           "\t "+ course1 + "\t\t\t\t" + credit1 + "\t\t\t\t\t\t" + grade1 + "\t\t\t\t\t" + gradePoints1 + "\n" +
                           "\t\t  GPA" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + gpa);
      } else if (course3.equals("Done")){
        System.out.println("\t  Course" +  "\t\t\t\t Credits" + "\t\t\t Grade" + "\t\t\t Grade Points" + "\n" +
                           "\t "+ course1 + "\t\t\t\t" + credit1 + "\t\t\t\t\t\t" + grade1 + "\t\t\t\t\t" + gradePoints1 + "\n" +
                           "\t "+ course2 + "\t\t\t\t" + credit2 + "\t\t\t\t\t\t" + grade2 + "\t\t\t\t\t" + gradePoints2 + "\n" +
                           "\t\t  GPA" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + gpa);
      } else if (course4.equals("Done")){
        System.out.println("\t  Course" +  "\t\t\t\t Credits" + "\t\t\t Grade" + "\t\t\t Grade Points" + "\n" +
                           "\t "+ course1 + "\t\t\t\t" + credit1 + "\t\t\t\t\t\t" + grade1 + "\t\t\t\t\t" + gradePoints1 + "\n" +
                           "\t "+ course2 + "\t\t\t\t" + credit2 + "\t\t\t\t\t\t" + grade2 + "\t\t\t\t\t" + gradePoints2 + "\n" +
                           "\t "+ course3 + "\t\t\t\t" + credit3 + "\t\t\t\t\t\t" + grade3 + "\t\t\t\t\t" + gradePoints3 + "\n" +
                           "\t\t  GPA" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + gpa);
      } else {
        System.out.println("\t  Course" +  "\t\t\t\t Credits" + "\t\t\t Grade" + "\t\t\t Grade Points" + "\n" +
                           "\t "+ course1 + "\t\t\t\t" + credit1 + "\t\t\t\t\t\t" + grade1 + "\t\t\t\t\t" + gradePoints1 + "\n" +
                           "\t "+ course2 + "\t\t\t\t" + credit2 + "\t\t\t\t\t\t" + grade2 + "\t\t\t\t\t" + gradePoints2 + "\n" +
                           "\t "+ course3 + "\t\t\t\t" + credit3 + "\t\t\t\t\t\t" + grade3 + "\t\t\t\t\t" + gradePoints3 + "\n" +
                           "\t "+ course4 + "\t\t\t\t" + credit4 + "\t\t\t\t\t\t" + grade4 + "\t\t\t\t\t" + gradePoints4 + "\n" +
                           "\t\t Total" + "\t\t\t\t" + totalCredits + "\t\t\t\t\t\t\t\t\t\t" + totalGradePoints + "\n" +
                           "\t\t  GPA" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + gpa);
      }

      }
    }
  }
}

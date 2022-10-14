// this is my draft
public class GPACalculator {
  public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);

    // initialize each variable:
    String courselist = "1";
    String course1 = "";
    String grade1 = "";
    String course2 = "";
    String grade2 = "";
    String course3 = "";
    String grade3 = "";
    String course4 = "";
    String grade4 = "";
    int credit1 = 0;
    int credit2 = 0;
    int credit3 = 0;
    int credit4 = 0;
    int totalCredits = 0;
    double gradePoints1 = 0.0;
    double gradePoints2 = 0.0;
    double gradePoints3 = 0.0;
    double gradePoints4 = 0.0;
    double totalGradePoints = 0.0;
    double gpa = 0.00;



    // prompt user to enter course number
    System.out.println("Enter course number: ");
    course1 = scanner.next();
    if (course1.equals("Done")){
      courselist = "Done";
    }

  // prompt the user to enter the data about 0 to 4 courses
if (courselist.equals("1")) {
      // prompt user to enter credit hours
      System.out.println("Enter credit hours for " + course1 + ": ");
      credit1 = scanner.nextInt();

      // prompt user to enter letter grade for courses
      System.out.println("Enter letter grade for " + course1 + ": ");

      grade1 = scanner.next();
      // input validation
        switch (grade1) {
          case "A" :
            gradePoints1 = 4.0;
            break;

          case "B":
            gradePoints1 = 3.0;
            break;

          case "C":
            gradePoints1 = 2.0;
            break;

          case "D":
            gradePoints1 = 1.0;
            break;

          case "E":
            gradePoints1 = 0.0;
            break;

          case "F":
            gradePoints1 = 0.0;
            break;

          default:
          System.out.println("Grade " + grade1 + " is not recognized");
          break;

        }
      }

    // restart the cycle
    System.out.println("Enter course number: ");
    course2 = scanner.next();
    if (course2.equals("Done")){
      courselist = "Done";
    } else {
      courselist = "2";
    }


if (courselist.equals("2")) {
      // prompt user to enter credit hours
      System.out.println("Enter credit hours for " + course2 + ": ");
      credit2 = scanner.nextInt();

      // prompt user to enter letter grade for courses
      System.out.println("Enter letter grade for " + course2 + ": ");
      grade2 = scanner.next();

      // input validation
      switch (grade2) {
        case "A" :
          gradePoints2 = 4.0;
          break;

        case "B":
          gradePoints2 = 3.0;
          break;

        case "C":
          gradePoints2 = 2.0;
          break;

        case "D":
          gradePoints2 = 1.0;
          break;

        case "E":
          gradePoints2 = 0.0;
          break;

        case "F":
          gradePoints2 = 0.0;
          break;

        default:
          System.out.println("Grade " + grade1 + " is not recognized");
          break;

      }
    }

  // restart the cycle
  System.out.println("Enter course number: ");
  course3 = scanner.next();
  if (course3.equals("Done")){
    courselist = "Done";
  } else {
    courselist = "3";
  }


if (courselist.equals("3")) {
      // prompt user to enter credit hours
      System.out.println("Enter credit hours for " + course3 + ": ");
      credit3 = scanner.nextInt();

      // prompt user to enter letter grade for courses
      System.out.println("Enter letter grade for " + course3 + ": ");
      grade3 = scanner.next();

      // input validation

      switch (grade3) {
        case "A" :
          gradePoints3 = 4.0;
          break;

        case "B":
          gradePoints3 = 3.0;
          break;

        case "C":
          gradePoints3 = 2.0;
          break;

        case "D":
          gradePoints3 = 1.0;
          break;

        case "E":
          gradePoints3 = 0.0;
          break;

        case "F":
          gradePoints3 = 0.0;
          break;

        default:
          System.out.println("Grade " + grade1 + " is not recognized");
          break;

      }
    }

  // restart the cycle
  System.out.println("Enter course number: ");
  course4 = scanner.next();
  if (course4.equals("Done")){
    courselist = "Done";
  } else {
    courselist = "4";
  }

if (courselist.equals("4")){
  // prompt user to enter credit hours
  System.out.println("Enter credit hours for " + course4 + ": ");
  credit4 = scanner.nextInt();

  // prompt user to enter letter grade for courses
      System.out.println("Enter letter grade for " + course4 + ": ");
      grade4 = scanner.next();

      // input validation
      switch (grade4) {
        case "A" :
          gradePoints4 = 4.0;
          break;

        case "B":
          gradePoints4 = 3.0;
          break;

        case "C":
          gradePoints4 = 2.0;
          break;

        case "D":
          gradePoints4 = 1.0;
          break;

        case "E":
          gradePoints4 = 0.0;
          break;

        case "F":
          gradePoints4 = 0.0;
          break;

        default:
          System.out.println("Grade " + grade1 + " is not recognized");
          break;

      }
    }

    // end the cycle
    courselist = "Done";

if (course1.equals("Done")){
    System.out.println("\t  Course" +  "\t\t\t\t Credits" + "\t\t\t Grade" + "\t\t\t Grade Points" + "\n" +
                           "\t\t Total" + "\t\t\t\t 0" + "\t\t\t\t\t\t\t\t\t\t 0.0 \n" +
                           "\t\t  GPA" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t N/A");
  } else if (course2.equals("Done")) {
    totalCredits = credit1;
    totalGradePoints = (gradePoints1*credit1);
    gpa = ((totalGradePoints/totalCredits)*1000)*0.001;
    System.out.println("\t  Course" +  "\t\t Credits" + "\t Grade" + "\t Grade Points" + "\n" +
                       "\t "+ course1 + "\t\t" + credit1 + "\t\t " + grade1 + "\t\t" + gradePoints1 + "\n" +
                       "\t Total" + "\t\t" + totalCredits + "\t\t\t\t" + totalGradePoints + "\n" +
                       "\t\t  GPA" + "\t\t\t\t\t\t\t\t" + gpa);
  } else if (course3.equals("Done")){
    totalCredits = credit1 + credit2;
    totalGradePoints = (gradePoints1*credit1) + (gradePoints2*credit2);
    gpa = ((totalGradePoints/totalCredits)*1000)*0.001;
    System.out.println("\t  Course" +  "\t\t Credits" + "\t Grade" + "\t Grade Points" + "\n" +
                       "\t "+ course1 + "\t\t" + credit1 + "\t\t " + grade1 + "\t\t" + gradePoints1 + "\n" +
                       "\t "+ course2 + "\t\t" + credit2 + "\t\t " + grade2 + "\t\t" + gradePoints2 + "\n" +
                       "\t Total" + "\t\t" + totalCredits + "\t\t\t\t" + totalGradePoints + "\n" +
                       "\t\t  GPA" + "\t\t\t\t\t\t\t\t" + gpa);
  } else if (course4.equals("Done")){
    totalCredits = credit1 + credit2 + credit3;
    totalGradePoints = (gradePoints1*credit1) + (gradePoints2*credit2) + (gradePoints3*credit3);
    gpa = ((totalGradePoints/totalCredits)*1000)*0.001;
    System.out.println("\t  Course" +  "\t\t Credits" + "\t Grade" + "\t Grade Points" + "\n" +
                       "\t "+ course1 + "\t\t" + credit1 + "\t\t " + grade1 + "\t\t" + gradePoints1 + "\n" +
                       "\t "+ course2 + "\t\t" + credit2 + "\t\t " + grade2 + "\t\t" + gradePoints2 + "\n" +
                       "\t "+ course3 + "\t\t" + credit3 + "\t\t " + grade3 + "\t\t" + gradePoints3 + "\n" +
                       "\t Total" + "\t\t\t\t" + totalCredits + "\t\t\t" + totalGradePoints + "\n" +
                       "\t\t  GPA" + "\t\t\t\t\t\t\t\t" + gpa);
  } else {
    totalCredits = credit1 + credit2 + credit3 + credit4;
    totalGradePoints = (gradePoints1*credit1) + (gradePoints2*credit2) + (gradePoints3*credit3) + (gradePoints4*credit4);
    gpa = ((totalGradePoints/totalCredits)*1000)*0.001;
    System.out.println("\t  Course" +  "\t\t Credits" + "\t Grade" + "\t Grade Points" + "\n" +
                       "\t "+ course1 + "\t\t" + credit1 + "\t\t " + grade1 + "\t\t" + gradePoints1 + "\n" +
                       "\t "+ course2 + "\t\t" + credit2 + "\t\t " + grade2 + "\t\t" + gradePoints2 + "\n" +
                       "\t "+ course3 + "\t\t" + credit3 + "\t\t " + grade3 + "\t\t" + gradePoints3 + "\n" +
                       "\t "+ course4 + "\t\t" + credit4 + "\t\t " + grade4 + "\t\t" + gradePoints4 + "\n" +
                       "\t Total" + "\t\t\t\t" + totalCredits + "\t\t\t" + totalGradePoints + "\n" +
                       "\t\t GPA" + "\t\t\t\t\t\t\t\t" + gpa);

    }
  }
}

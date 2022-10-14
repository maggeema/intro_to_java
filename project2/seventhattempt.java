public class seventhattempt {
  public static void main(String[] args){
    java.util.Scanner scanner = new java.util.Scanner(System.in);

    boolean stop = false;
    boolean DoneCourse = false;
    boolean DoneSemester = false;
    int totalPoints = 0;
    int totalCredits = 0;

    while (stop == false){
      int semesterPoints = 0;
      int semesterCredits = 0;
      System.out.print("Enter semester: ");
      String semester = scanner.next();

      if (semester.equals("DoneSemester")){
        DoneSemester = true;
        printSemester(totalPoints, totalCredits);
        stop = true;
        break;
      } else {
        while (DoneSemester == false){

          System.out.print("Enter course number: ");
          String course = scanner.next();

          if (course.equals("DoneCourse")){
            printCourse(semester, semesterPoints, semesterCredits);
            totalCredits += semesterCredits;
            totalPoints += semesterPoints;
            break;
          } else {
            System.out.printf("Enter letter grade for %s: ", course);
            String letterGrade = scanner.next();

            int points = 0;
              if (letterGrade.equals("A")){
                points = 4;
              } else if (letterGrade.equals("B")){
                points = 3;
              } else if (letterGrade.equals("C")){
                points = 2;
              } else if (letterGrade.equals("D")){
                points = 1;
              } else if (letterGrade.equals("F")){
                points = 0;
              } else {
                System.out.printf("Grade %s is not recognized\n", letterGrade);
                continue;
              }

            System.out.printf("Enter credit hours for %s: ", course);
            int hours = scanner.nextInt();
            int coursePoints = hours * points;
            semesterPoints += coursePoints;
            semesterCredits += hours;

            if (hours < 0){
              System.out.printf("Credits %d is negative, and allowed\n", hours);
            }
          continue;
          }
        }
        continue;
      }
    }
  }

  public static void printCourse(String semester, int semesterPoints, int semesterCredits){
    System.out.printf("Semester: %s\n", semester);
    System.out.printf("Semester Credits: %20d\n", semesterCredits);
    System.out.printf("Semester Points: %17d.000\n", semesterPoints);
    if (semesterPoints == 0 && semesterCredits == 0){
      String semestergpa = "N/A";
      System.out.printf("Semester GPA: %24s\n", semestergpa);
    } else {
      double semestergpa = (double) semesterPoints / (double) semesterCredits;
      System.out.printf("Semester GPA: %24.3f\n", semestergpa);
    }
  }

  public static void printSemester(int totalPoints, int totalCredits){
    System.out.printf("Total Credits: %23d\n", totalCredits);
    System.out.printf("Total Points: %20d.000\n", totalPoints);
    if (totalPoints == 0 && totalCredits == 0){
      String overallgpa = "N/A";
      System.out.printf("Overall GPA: %25s\n", overallgpa);
    } else {
      double overallgpa = (double) totalPoints / (double)totalCredits;
      System.out.printf("Overall GPA: %25.3f\n", overallgpa);
    }
  }

}

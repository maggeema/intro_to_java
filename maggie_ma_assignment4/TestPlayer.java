import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;
import java.io.*;

public class TestPlayer{
  public static void main(String[] args){
    try {
      File myObj = new File("mlb_players.txt");
      Scanner myReader = new Scanner(myObj);

      String data = myReader.nextLine();
      ArrayList<Player> listOfPlayers = new ArrayList<Player>();

      while (myReader.hasNextLine()){
        data = myReader.nextLine();
        String[] arrOfInfo = data.split(", ");
        String name = arrOfInfo[0];
        String team = arrOfInfo[1];
        String position = arrOfInfo[2];
        Double height = Double.parseDouble(arrOfInfo[3]);
        Double weight = Double.parseDouble(arrOfInfo[4]);
        Double age = Double.parseDouble(arrOfInfo[5]);

        Club_information club = new Club_information(team, position);
        Person_information person = new Person_information(height, weight, age);
        Player player = new Player(name, club, person);
        listOfPlayers.add(player);
        }

      answer(listOfPlayers);
      myReader.close();
    } catch (FileNotFoundException e){
      System.out.println("An error occured.");
      e.printStackTrace();
    }
  }
  // public static void main(String[] args) throws IOException {
  //   int lines = 0;
  //   Player[] listOfPlayers = new Player[lines+1];
  //   String[] info = new String[6];
  //   try (BufferedReader reader = new BufferedReader(new FileReader("mlb_players.txt"))) {
  //     while (reader.hasNextLine()){
  //       Player[lines] = reader.nextLine().split(", ");
  //       lines++;
  //     }
  //
  //     for (int i = 0; i < lines; i++){
  //       Double age = (double)(Integer.parseInt(info[3]));
  //       Double height = (double)(Integer.parseInt(info[4]));
  //       Double weight = Double.parseDouble(info[5]);
  //       String team = info[1];
  //       String position = info[2];
  //       Person_information individualInfo = new Person_information(height, weight, age);
  //       Club_information individualClub = new Club_information(team, position);
  //       Player player = new Player(info[0], individualClub, individualInfo);
  //       listOfPlayers[i] = player;
  //     }
  //     answer(listOfPlayers);
  //   } catch (IOException e) {
  //       e.printStackTrace();
  //   }
  // }

  public static void answer(ArrayList<Player> listOfPlayers){
    int counter = 0;

    System.out.println("How can I help you?");
    System.out.println("1. How many players are in the team?");
    System.out.println("2. How many players are below the age of 25?");
    System.out.println("3. Hwo many players are between the ages of 25 and 30?");
    System.out.println("4. How many players are between the ages of 30 and 40?");
    System.out.println("5. How many players are underweight?");
    System.out.println("6. How many players are healthy?");
    System.out.println("7. How many players are overweight?");
    System.out.println("8. How many players are obese?");

    Scanner input = new Scanner(System.in);
    System.out.println("Enter your numeric choice: ");
    int choice = input.nextInt();

      if (choice == 1){
        System.out.println("Number of players on the team: " + listOfPlayers.size());
      } else if (choice == 2){
        for (int i = 0; i < listOfPlayers.size(); i++){
          if (listOfPlayers.get(i).getPerson_information().getAge() < 25){
            counter++;
          }
        }
        System.out.println("Number of players below the age of 25: " + counter);
      } else if (choice == 3){
        for (int i = 0; i < listOfPlayers.size(); i++){
          if (listOfPlayers.get(i).getPerson_information().getAge() >= 25 && listOfPlayers.get(i).getPerson_information().getAge() < 30){
            counter++;
          }
        }
        System.out.println("Number of players between the ages of 25 and 30: " + counter);
      } else if (choice == 4){
        for (int i = 0; i < listOfPlayers.size(); i++){
          if (listOfPlayers.get(i).getPerson_information().getAge() >= 30 && listOfPlayers.get(i).getPerson_information().getAge() < 40){
            counter++;
          }
        }
        System.out.println("Number of players between the ages of 30 and 40: " + counter);
      } else if (choice == 5){
        for (int i = 0; i < listOfPlayers.size(); i++){
          if (listOfPlayers.get(i).getPerson_information().getStatus() == "Underweight"){
            counter++;
          }
        }
        System.out.println("Number of players that are underweight: " + counter);
      } else if (choice == 6){
        for (int i = 0; i < listOfPlayers.size(); i++){
          if (listOfPlayers.get(i).getPerson_information().getStatus() == "Healthy"){
            counter++;
          }
        }
        System.out.println("Number of players that are healthy: " + counter);
      } else if (choice == 7){
        for (int i = 0; i < listOfPlayers.size(); i++){
          if (listOfPlayers.get(i).getPerson_information().getStatus() == "Overweight"){
            counter++;
          }
        }
        System.out.println("Number of players that are overweight: " + counter);
      } else if (choice == 8){
        for (int i = 0; i < listOfPlayers.size(); i++){
          if (listOfPlayers.get(i).getPerson_information().getStatus() == "Obese"){
            counter++;
          }
        }
        System.out.println("Number of players that are obese: " + counter);
      } else {
        System.out.println("Invalid choice or input.");
      }
    }
  }

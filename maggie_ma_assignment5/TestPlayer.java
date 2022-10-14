import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;
import java.io.*;

public class TestPlayer{
    public static void main(String[] args){
        try {
            File myObj = new File("mlb_player.txt");
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
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void answer(ArrayList<Player> listOfPlayers){
        System.out.println("\nHow can I help you?");
        System.out.println("1. How many players are in each team?");
        System.out.println("2. What is distribution of positions in EACH team?");
        System.out.println("3. How many players are in each position?");
        System.out.println("4. What is the distribution of positions amongst ALL teams?");

        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter your numeric choice: ");
        int choice = input.nextInt();

        if (choice == 1){
            HashMap<String, Integer> playersInTeam = new HashMap<String, Integer>();
            for (int i = 0; i < listOfPlayers.size(); i++){
                String team = listOfPlayers.get(i).getClub_information().getTeam();
                int counter = 1;
                if (playersInTeam.containsKey(team)){
                    playersInTeam.put(team, playersInTeam.get(team) + 1);
                } else {
                    playersInTeam.put(team, counter);
                }
            }
            System.out.println("\nNumber of players in each team (Team = Number Of Players): ");
            System.out.println(playersInTeam);
            // end of choice 1
        } else if (choice == 2){
            HashMap<String, Integer> teamPosition_counter = new HashMap<String, Integer>();

            String team = "";
            String position = "";
            String teamPosition = "";
            int counter = 0;

            for (int i = 0; i <listOfPlayers.size(); i++){
                team = listOfPlayers.get(i).getClub_information().getTeam();
                position = listOfPlayers.get(i).getClub_information().getPosition();

                teamPosition = team + ", " + position;

                if (teamPosition_counter.containsKey(teamPosition)){
                    counter = teamPosition_counter.get(teamPosition) + 1;
                    teamPosition_counter.put(teamPosition, counter);
                } else {
                    counter = 1;
                    teamPosition_counter.put(teamPosition, counter);
                }
            }

            ArrayList<String> listOfPosCount = new ArrayList<String>();
            for (String teamName : teamPosition_counter.keySet()){
                listOfPosCount.add(teamName + ", " + teamPosition_counter.get(teamName));
            }

            HashMap<String, ArrayList<String>> result = new HashMap<String, ArrayList<String>>();
            ArrayList<String> listOfValues = new ArrayList<String>();
            for (int j = 0; j < listOfPosCount.size(); j++){
                String info = listOfPosCount.get(j);
                String[] arr = info.split(", ");

                String teamName = arr[0];
                String positionName = arr[1];
                String count = arr[2];


                String value = positionName + " = " + count;
                if (result.containsKey(teamName)){
                    listOfValues = result.get(teamName);
                    listOfValues.add(value);
                    result.put(teamName, listOfValues);
                } else {
                    ArrayList<String> newarr = new ArrayList<String>();
                    newarr.add(value);
                    listOfValues = newarr;
                    result.put(teamName, listOfValues);
                }
            }

            ArrayList<String> listOfTeams = new ArrayList<String>();
            for (int k = 0; k < listOfPlayers.size(); k++){
                team = listOfPlayers.get(k).getClub_information().getTeam();
                if (!listOfTeams.contains(team)){
                    listOfTeams.add(team);
                } else {
                    continue;
                }
            }

            for (int l = 0; l < listOfTeams.size(); l++){
                if (result.containsKey(listOfTeams.get(l))){
                    System.out.println("Team: " + listOfTeams.get(l) + "\nPosition Distribution (Position = Number Of Players): " + result.get(listOfTeams.get(l)) + "\n");
                } else {
                    continue;
                }
            }

            // end of choice 2
        } else if (choice == 3){
            HashMap<String, Integer> playersInPosition = new HashMap<String, Integer>();
            for (int i = 0; i < listOfPlayers.size(); i++){
                String position = listOfPlayers.get(i).getClub_information().getPosition();
                int counter = 1;
                if (playersInPosition.containsKey(position)){
                    playersInPosition.put(position, playersInPosition.get(position) + 1);
                } else {
                    playersInPosition.put(position, counter);
                }
            }
            System.out.println("Number of players for each position (Position = Number Of Players): ");
            System.out.println(playersInPosition);
            // end of choice 3
        } else if (choice == 4){
            HashMap<String, Integer> positionTeam_counter = new HashMap<String, Integer>();

            String team = "";
            String position = "";
            String positionTeam = "";
            int counter = 0;

            for (int i = 0; i <listOfPlayers.size(); i++){
                team = listOfPlayers.get(i).getClub_information().getTeam();
                position = listOfPlayers.get(i).getClub_information().getPosition();

                positionTeam = position + ", " + team;

                if (positionTeam_counter.containsKey(positionTeam)){
                    counter = positionTeam_counter.get(positionTeam) + 1;
                    positionTeam_counter.put(positionTeam, counter);
                } else {
                    counter = 1;
                    positionTeam_counter.put(positionTeam, counter);
                }
            }

            ArrayList<String> listOfPosCount = new ArrayList<String>();
            for (String positionName : positionTeam_counter.keySet()){
                listOfPosCount.add(positionName + ", " + positionTeam_counter.get(positionName));
            }

            HashMap<String, ArrayList<String>> result = new HashMap<String, ArrayList<String>>();
            ArrayList<String> listOfValues = new ArrayList<String>();
            for (int j = 0; j < listOfPosCount.size(); j++){
                String info = listOfPosCount.get(j);
                String[] arr = info.split(", ");

                String teamName = arr[0];
                String positionName = arr[1];
                String count = arr[2];


                String value = positionName + " = " + count;
                if (result.containsKey(teamName)){
                    listOfValues = result.get(teamName);
                    listOfValues.add(value);
                    result.put(teamName, listOfValues);
                } else {
                    ArrayList<String> newarr = new ArrayList<String>();
                    newarr.add(value);
                    listOfValues = newarr;
                    result.put(teamName, listOfValues);
                }
            }

            ArrayList<String> listOfPositions = new ArrayList<String>();
            for (int k = 0; k < listOfPlayers.size(); k++){
                position = listOfPlayers.get(k).getClub_information().getPosition();
                if (!listOfPositions.contains(position)){
                    listOfPositions.add(position);
                } else {
                    continue;
                }
            }

            for (int l = 0; l < listOfPositions.size(); l++){
                if (result.containsKey(listOfPositions.get(l))){
                    System.out.println("Position: " + listOfPositions.get(l) + "\nTeam Distribution (Team = Number Of Players): " + result.get(listOfPositions.get(l)) + "\n");
                } else {
                    continue;
                }
            }

            // end of choice 4
        } else {
            System.out.println("Your choice input is invalid. Please reenter an integer.");
        }
        // end of answer()
    }
    // end of TestPlayer
}


public class Player {
    private String name;
    private Person_information person;
    private Club_information club;

    Player(String name, Club_information club, Person_information person){
        this.name = name;
        this.club = club;
        this.person = person;
    }

    Player(){
    }

    public String getName(){
        return this.name;
    }

    public Person_information getPerson_information(){
        return this.person;
    }

    public Club_information getClub_information(){
        return this.club;
    }

    public String playerToString(){
        String s = "Person information => Name: " + getName();
        return s + ", " + this.person.bmiToString() + "\n" + this.club.clubToString();
    }
}
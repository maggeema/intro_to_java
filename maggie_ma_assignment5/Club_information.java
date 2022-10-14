public class Club_information{
    private String team = "";
    private String position = "";

    Club_information(String team, String position){
        this.team = team;
        this.position = position;
    }

    Club_information(){
    }

    public String getTeam(){
        return this.team;
    }

    public String getPosition(){
        return this.position;
    }

    public void setTeam(String team){
        this.team = team;
    }

    public void setPosition(String position){
        this.position = position;
    }

    public String clubToString(){
        return "Club information => Team:" + this.team + ", Position: " + this.position;
    }
}

package Summer.Game;

import org.springframework.data.annotation.Id;

public class Gameplay {

    @Id
    private int id;

    private String homeTeam;
    private String awayTeam;
    private int homeScore;
    private int awayScore;



    Gameplay(){

    }

    Gameplay(String homeTeam, String awayTeam){
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;

        this.homeScore = homeScore;
        this.awayScore = awayScore;
    }

    public void setGameplayId(int id){
        this.id = id;
    }

    public int getGameplayId(){
        return id;
    }

    public void setHomeTeam(String homeTeam){
        this.homeTeam = homeTeam;
    }

    public String getHomeTeam(){
        return homeTeam;
    }

    public void setAwayTeam(String awayTeam){
        this.awayTeam = awayTeam;
    }

    public String getAwayTeam(){
        return awayTeam;
    }

    public void setHomeScore(int homeScore){
        this.homeScore = homeScore;
    }

    public int getHomeScore(){
        return homeScore;
    }

    public void setAwayScore(int awayScore){
        this.awayScore = awayScore;
    }

    public int getAwayScore(){
        return awayScore;
    }
}

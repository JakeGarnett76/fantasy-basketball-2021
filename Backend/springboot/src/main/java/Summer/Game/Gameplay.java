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
}

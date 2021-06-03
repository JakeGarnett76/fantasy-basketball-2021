package Teams;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Players {


    @Id
    private int id;

    private String name;
    private String team;
    private String manager;

    Players() {

    }

    Players(String name, String team, String manager){
        this.name = name;
        this.team = team;
        this.manager = manager;
    }

    public void setPlayerId(int id){
        this.id = id;
    }

    public int getPlayerId(){
        return id;
    }

    public void setTeam(String team){
        this.team = team;
    }

    public String getPlayerTeam(){
        return team;
    }

    public void setManager(String manager){
        this.manager = manager;
    }

    public String getManager(){
        return manager;
    }

}

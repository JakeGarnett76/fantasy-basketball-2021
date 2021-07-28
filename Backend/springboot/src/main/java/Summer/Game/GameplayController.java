package Summer.Game;


import Summer.Teams.Players;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GameplayController {

    @Autowired
    GameplayRepository gameplayRepository;

    private String success = "{\"message\":\"success\"}";
    private String failure = "{\"message\":\"failure\"}";

    //get game scores
    @GetMapping(path = "/score")
    List<Gameplay> getScores(){
            return gameplayRepository.findAll();
    }

    //get game score by id
    @GetMapping(path = "/score/{id}")
    Gameplay getScore(@PathVariable int id){
        return gameplayRepository.findById(id);
    }

    //get home score by id
    @GetMapping(path = "/score/home/{id}")
    Gameplay getHomeScore(@PathVariable int id){
        return gameplayRepository.findById(id);
    }

    //get away score by id
    @GetMapping(path = "/score/away/{id}")
    Gameplay getAwayScore(@PathVariable int id){
        return gameplayRepository.findById(id);
    }

    //get playerscore by id
    @GetMapping(path = "/score/player/{id}")
    Gameplay getPlayerScore(@PathVariable int id){
        return gameplayRepository.findById(id);
    }

    //Update Game status by id
    @PutMapping(path = "/score/{id}")
    Gameplay updatePlayers(@PathVariable int id, @RequestBody Gameplay request){
        Gameplay game = gameplayRepository.findById(id);
        if(game == null){
            return null;
        }
        game.setGameplayId(request.getGameplayId());
        game.setAwayScore(request.getAwayScore());
        game.setAwayTeam(request.getAwayTeam());
        game.setHomeScore(request.getHomeScore());
        game.setHomeTeam(request.getHomeTeam());
        return gameplayRepository.findById(id);
    }


}

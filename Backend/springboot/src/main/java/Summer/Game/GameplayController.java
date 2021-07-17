package Summer.Game;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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


}

package Summer.Game;


import Summer.Teams.Players;
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


}

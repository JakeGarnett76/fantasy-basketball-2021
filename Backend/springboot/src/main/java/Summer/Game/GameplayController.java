package Summer.Game;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GameplayController {

    @Autowired
    GameplayRepository gameplayRepository;

    private String success = "{\"message\":\"success\"}";
    private String failure = "{\"message\":\"failure\"}";

    //get game score
    @GetMapping(path = "/score")
    List<String> getPlayers(){

    }


}

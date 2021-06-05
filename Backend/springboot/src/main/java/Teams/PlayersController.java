package Teams;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PlayersController {

    @Autowired
    PlayersRepository playersRepository;

    private String success = "{\"message\":\"success\"}";
    private String failure = "{\"message\":\"failure\"}";

    //get Player by Id
    @GetMapping(path = "/players/{id}")
    Players getPlayersById(@PathVariable int id){
        return playersRepository.findById(id);
    }

    //post player
    @PostMapping(path = "/players")
    String postPlayers(@RequestBody Players player){
        if(player == null){
            return failure;
        }
        playersRepository.save(player);
        return success;
    }

}

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

    //get team by Manager name
    @GetMapping(path = "/players/{manager}")
    Players getPlayers(@PathVariable String manager){
        return playersRepository.findByManager(manager);
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

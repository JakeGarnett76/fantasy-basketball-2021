package Summer.Teams;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlayersController{

    @Autowired
    PlayersRepository playersRepository;

    private String success = "{\"message\":\"success\"}";
    private String failure = "{\"message\":\"failure\"}";

    //get all Players
    @GetMapping(path = "/players")
    List<Players> getPlayers(){
        return playersRepository.findAll();
    }

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

    //Update a player by id
    @PutMapping(path = "/players/{id}")
    Players updatePlayers(@PathVariable int id, @RequestBody Players request){
        Players player = playersRepository.findById(id);
        if(player == null){
            return null;
        }
        player.setTeam(request.getPlayerTeam());
        player.setName(request.getName());
        player.setManager(request.getManager());
        player.setPlayerId(request.getPlayerId());
        return playersRepository.findById(id);
    }

}

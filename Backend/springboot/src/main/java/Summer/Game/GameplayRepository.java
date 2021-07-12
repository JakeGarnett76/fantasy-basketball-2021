package Summer.Game;

import Summer.Teams.Players;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameplayRepository extends JpaRepository<Gameplay, Long> {

    Players findById(int id);
//    Players findByEntry(String Entry);
    Players findByManager(String manager);
}

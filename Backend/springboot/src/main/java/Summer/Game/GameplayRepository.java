package Summer.Game;

import Summer.Teams.Players;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameplayRepository extends JpaRepository<Gameplay, Long> {

    Gameplay findById(int id);
//    Gameplay findByEntry(String Entry);
    Gameplay findByManager(String manager);
}

package Summer.Teams;

import org.springframework.data.jpa.repository.JpaRepository;
import Summer.Teams.Players;
import org.springframework.stereotype.Repository;

public interface PlayersRepository extends JpaRepository<Players, Long> {
    Players findById(int id);
//    Players findByEntry(String Entry);
    Players findByManager(String manager);
}

package Teams;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayersRepository extends JpaRepository<Players, Long> {
    Players findById(int id);
    Players findByEntry(String Entry);
}

package Summer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<Test, Long> {
    Test findById(int id);
    Test findByEntry(String Entry);
}


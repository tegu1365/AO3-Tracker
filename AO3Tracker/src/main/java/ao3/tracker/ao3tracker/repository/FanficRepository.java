package ao3.tracker.ao3tracker.repository;

import ao3.tracker.ao3tracker.model.Fanfic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FanficRepository extends JpaRepository<Fanfic, Integer>
{
    Optional<Fanfic> findByUrl(String url);
}
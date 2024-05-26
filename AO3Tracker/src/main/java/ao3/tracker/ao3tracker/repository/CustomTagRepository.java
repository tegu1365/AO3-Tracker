package ao3.tracker.ao3tracker.repository;

import ao3.tracker.ao3tracker.model.CustomTag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomTagRepository extends JpaRepository<CustomTag, Integer>
{

}

package ao3.tracker.ao3tracker.repository;

import ao3.tracker.ao3tracker.model.Collection;
import ao3.tracker.ao3tracker.model.Fanfic;
import ao3.tracker.ao3tracker.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CollectionRepository extends JpaRepository<Collection, Integer>
{
    List<Collection> findCollectionByFanficsContains(Fanfic fanfic);
    List<Collection> findByOwnerId(Users owner);
}
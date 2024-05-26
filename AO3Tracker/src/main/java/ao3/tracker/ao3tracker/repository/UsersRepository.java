package ao3.tracker.ao3tracker.repository;

import ao3.tracker.ao3tracker.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer>
{

}
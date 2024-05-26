package ao3.tracker.ao3tracker.service;

import ao3.tracker.ao3tracker.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ao3.tracker.ao3tracker.repository.UsersRepository;
@Service
public class UserService {
    private final UsersRepository userRepository;

    @Autowired
    public UserService(UsersRepository userRepository){
        this.userRepository=userRepository;
    }

    public Users createUser(Users user) {
        return userRepository.save(user);
    }

    public Users findById(Integer id) {
        return userRepository.findById(id).orElse(null);
    }

    public Users updateUser(Users user) {
        return  userRepository.save(user);
    }

    public void removeUser(Integer id) {
        userRepository.deleteById(id);
    }
}

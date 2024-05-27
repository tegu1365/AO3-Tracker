package ao3.tracker.ao3tracker;

import ao3.tracker.ao3tracker.service.LibraryService;
import ao3.tracker.ao3tracker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ao3TrackerApplication {


    public static void main(String[] args) {
        SpringApplication.run(Ao3TrackerApplication.class, args);
    }

}

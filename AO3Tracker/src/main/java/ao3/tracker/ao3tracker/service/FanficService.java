package ao3.tracker.ao3tracker.service;

import ao3.tracker.ao3tracker.model.Fanfic;
import ao3.tracker.ao3tracker.model.Users;
import ao3.tracker.ao3tracker.repository.FanficRepository;
import ao3.tracker.ao3tracker.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FanficService {
   private final FanficRepository fanficRepository;

   @Autowired
   public FanficService(FanficRepository fanficRepository){
       this.fanficRepository=fanficRepository;
   }
    public Fanfic createFanfic(Fanfic fanfic) {
        return fanficRepository.save(fanfic);
    }

    public Fanfic findById(Integer id) {
        return fanficRepository.findById(id).orElse(null);
    }

    public Fanfic updateFanfic(Fanfic fanfic) {
        return  fanficRepository.save(fanfic);
    }

    public void removeFanfic(Integer id) {
        fanficRepository.deleteById(id);
    }
}

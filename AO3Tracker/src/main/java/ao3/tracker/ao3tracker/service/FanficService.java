package ao3.tracker.ao3tracker.service;

import ao3.tracker.ao3tracker.model.Fanfic;
import ao3.tracker.ao3tracker.model.Users;
import ao3.tracker.ao3tracker.repository.FanficRepository;
import ao3.tracker.ao3tracker.repository.UsersRepository;
import ao3.tracker.ao3tracker.scraper.Ao3Scrapper;
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

    public  Fanfic createFanficByUrl(String url){
        Ao3Scrapper scrapper=new Ao3Scrapper(url);
        if(!scrapper.isNull) {return fanficRepository.save(scrapper.ParseToFanfic());}
        //else{
            //cannot create message
        //}
        return null;
    }

    public Fanfic findById(Integer id) {
        Fanfic fanfic= fanficRepository.findById(id).orElse(null);
        if(fanfic!=null){
            Ao3Scrapper scrapper=new Ao3Scrapper(fanfic.getUrl());
            if(!scrapper.isNull) {
                updateFanfic(scrapper.ParseToFanfic());
            }
        }
        return fanfic;
    }
    public Fanfic findByUrl(String url) {
        return fanficRepository.findByUrl(url).orElse(null);
    }

    public Fanfic updateFanfic(Fanfic fanfic) {
        return  fanficRepository.save(fanfic);
    }

    public void removeFanfic(Integer id) {
        fanficRepository.deleteById(id);
    }
}

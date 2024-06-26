package ao3.tracker.ao3tracker.service;

import ao3.tracker.ao3tracker.model.Fanfic;
import ao3.tracker.ao3tracker.model.Users;
import ao3.tracker.ao3tracker.repository.FanficRepository;
import ao3.tracker.ao3tracker.repository.UsersRepository;
import ao3.tracker.ao3tracker.scraper.Ao3Scrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

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
       String link="";
        if(url.lastIndexOf('c')!=-1) {
            link = url.substring(0, url.lastIndexOf('c') - 1);
        }else{
            link=url;
        }
       Optional<Fanfic> fanfic=fanficRepository.findByUrl(link);
       if(fanfic.isEmpty()) {
           Ao3Scrapper scrapper = new Ao3Scrapper(url);
           if (!scrapper.isNull) {
               return fanficRepository.save(scrapper.ParseToFanfic());
           }
       }
       if(fanfic.isPresent()){
           Ao3Scrapper scrapper = new Ao3Scrapper(url);
           Fanfic current= scrapper.ParseToFanfic();
           fanfic.get().setFandom(current.getFandom());
           fanfic.get().setChapterCurrently(current.getChapterCurrently());
           fanfic.get().setSummary(current.getSummary());
           fanfic.get().setAuthor(current.getAuthor());
           fanfic.get().setDataUploaded(current.getDataUploaded());
           fanfic.get().setWordCount(current.getWordCount());
           fanfic.get().setChapterExpected(current.getChapterExpected());
           fanfic.get().setStatus(current.getStatus());
           return fanficRepository.save(fanfic.get());
       }
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

package ao3.tracker.ao3tracker.service;

import ao3.tracker.ao3tracker.model.CustomTag;
import ao3.tracker.ao3tracker.model.Users;
import ao3.tracker.ao3tracker.repository.CustomTagRepository;
import ao3.tracker.ao3tracker.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomTagService {
    private final CustomTagRepository customTagRepository;
    @Autowired
    public CustomTagService(CustomTagRepository customTagRepository){
        this.customTagRepository=customTagRepository;
    }

    public CustomTag createCustomTag(CustomTag customTag) {
        return customTagRepository.save(customTag);
    }

    public CustomTag findById(Integer id) {
        return customTagRepository.findById(id).orElse(null);
    }

    public CustomTag updateCustomTag(CustomTag customTag) {
        return  customTagRepository.save(customTag);
    }

    public void removeCustomTag(Integer id) {
        customTagRepository.deleteById(id);
    }
}

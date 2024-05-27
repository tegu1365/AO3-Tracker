package ao3.tracker.ao3tracker.service;

import ao3.tracker.ao3tracker.model.Collection;
import ao3.tracker.ao3tracker.model.Users;
import ao3.tracker.ao3tracker.repository.CollectionRepository;
import ao3.tracker.ao3tracker.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CollectionService {
    private final CollectionRepository collectionRepository;

    @Autowired
    public CollectionService(CollectionRepository collectionRepository){
        this.collectionRepository=collectionRepository;
    }
    public Collection createCollection(Collection collection) {
        return collectionRepository.save(collection);
    }

    public Collection findById(Integer id) {
        return collectionRepository.findById(id).orElse(null);
    }

    public Collection updateCollection(Collection collection) {
        return  collectionRepository.save(collection);
    }

    public void removeCollection(Integer id) {
        collectionRepository.deleteById(id);
    }

}

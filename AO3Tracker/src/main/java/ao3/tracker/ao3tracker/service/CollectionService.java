package ao3.tracker.ao3tracker.service;

import ao3.tracker.ao3tracker.model.Collection;
import ao3.tracker.ao3tracker.model.Fanfic;
import ao3.tracker.ao3tracker.model.Users;
import ao3.tracker.ao3tracker.repository.CollectionRepository;
import ao3.tracker.ao3tracker.repository.FanficRepository;
import ao3.tracker.ao3tracker.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CollectionService {
    private final CollectionRepository collectionRepository;
    private final FanficRepository fanficRepository;
    private final UsersRepository usersRepository;
    @Autowired
    public CollectionService(CollectionRepository collectionRepository, FanficRepository fanficRepository, UsersRepository usersRepository){
        this.collectionRepository=collectionRepository;
        this.fanficRepository = fanficRepository;
        this.usersRepository = usersRepository;
    }

    public Collection createByUserId(Integer userId, String name, String description){
        Collection collection = new Collection();
        Optional<Users> users= usersRepository.findById(userId);
        if(users.isPresent()){
            collection.setOwnerId(users.get());
            collection.setDescription(description);
            collection.setName(name);
            return createCollection(collection);
        }
        return null;
    }
    public Collection createCollection(Collection collection) {
        return collectionRepository.save(collection);
    }

    public Collection findById(Integer id) {
        return collectionRepository.findById(id).orElse(null);
    }
    public List<Collection> findByFanfic(Integer fanficId){
        Optional<Fanfic> fanfic = fanficRepository.findById(fanficId);
        if(fanfic.isPresent()) {
            return collectionRepository.findCollectionByFanficsContains(fanfic.get());
        }
        return null;
    }

    public Collection updateCollection(Collection collection) {
        return  collectionRepository.save(collection);
    }

    public void removeCollection(Integer id) {
        collectionRepository.deleteById(id);
    }

    public Collection addFanfic(Integer fanficId, Integer collectionId) {
        Optional<Collection> collection= collectionRepository.findById(collectionId);
        Optional<Fanfic> fanfic= fanficRepository.findById(fanficId);
        if(collection.isPresent()&&fanfic.isPresent()){
            collection.get().getFanfics().add(fanfic.get());
            return collectionRepository.save(collection.get());
        }
        return null;
    }
}

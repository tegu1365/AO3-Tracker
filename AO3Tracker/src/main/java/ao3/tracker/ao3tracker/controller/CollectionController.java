package ao3.tracker.ao3tracker.controller;

import ao3.tracker.ao3tracker.dto.*;
import ao3.tracker.ao3tracker.mapper.AllCollectionMapper;
import ao3.tracker.ao3tracker.mapper.CollectionByFanficIdMapper;
import ao3.tracker.ao3tracker.mapper.CollectionMapper;
import ao3.tracker.ao3tracker.service.CollectionService;
import ao3.tracker.ao3tracker.model.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/collection")
public class CollectionController {
    @Autowired
    private CollectionService collectionService;
    @Autowired
    private CollectionMapper collectionMapper;
    @Autowired
    private CollectionByFanficIdMapper collectionByFanficIdMapper;
    @Autowired
    private AllCollectionMapper allCollectionMapper;

    @GetMapping("/fanfic_id={fanficId}")
    public ResponseEntity<List<CollectionByFanficIdDto>> fetchCollections(@PathVariable Integer fanficId){
        List<Collection> collections = collectionService.findByFanfic(fanficId);
        if(collections!=null){
            List<CollectionByFanficIdDto> result=collections
                    .stream()
                    .map(collection -> collectionByFanficIdMapper.mapToDto(collection))
                    .collect(Collectors.toList());
            return new ResponseEntity<>(result,HttpStatus.OK);
        }
        return null;
    }
    @GetMapping("/{id}")
    public ResponseEntity<CollectionDto> fetchCollection(@PathVariable Integer id) {
        return new ResponseEntity<>(collectionMapper.mapToDto(collectionService.findById(id)), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<CollectionDto> createCollection(@RequestBody CreateCollectionDto collectionDto){
        return  new ResponseEntity<>(collectionMapper.mapToDto(collectionService.createByUserId(
                collectionDto.getOwnerId(),collectionDto.getName(),collectionDto.getDescription())),HttpStatus.CREATED);
    }

    @PostMapping("/add")
    public  ResponseEntity<CollectionDto> addFanficToCollection(@RequestBody AddFanficToCollectionDto addDto){
        return  new ResponseEntity<>(collectionMapper.mapToDto(collectionService.addFanfic(
                addDto.getFanficId(),addDto.getCollectionId())),HttpStatus.OK);
    }

    @GetMapping("/user={userId}")
    public ResponseEntity<List<AllCollectionDto>> fetchCollectionsByOwner(@PathVariable Integer userId){
        List<Collection> collections = collectionService.getCollectionByOwner(userId);
        if(collections!=null){
            AllCollectionDto AllCollectionMapper = null;
            List<AllCollectionDto> result=collections
                    .stream()
                    .map(collection -> allCollectionMapper.mapToDto(collection))
                    .collect(Collectors.toList());
            return new ResponseEntity<>(result,HttpStatus.OK);
        }
        return null;
    }


}

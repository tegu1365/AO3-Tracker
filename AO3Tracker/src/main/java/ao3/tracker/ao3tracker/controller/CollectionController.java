package ao3.tracker.ao3tracker.controller;

import ao3.tracker.ao3tracker.dto.CollectionDto;
import ao3.tracker.ao3tracker.dto.FanficDto;
import ao3.tracker.ao3tracker.mapper.CollectionMapper;
import ao3.tracker.ao3tracker.mapper.FanficMapper;
import ao3.tracker.ao3tracker.service.CollectionService;
import ao3.tracker.ao3tracker.service.FanficService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/collection")
public class CollectionController {
    @Autowired
    private CollectionService collectionService;
    @Autowired
    private CollectionMapper collectionMapper;

   //@GetMapping("/fanfic_id={fanficId}")
   //public ResponseEntity<CollectionDto> fetchCollections(@RequestParam Integer fanficId){

    //}
    @GetMapping("/{id}")
    public ResponseEntity<CollectionDto> fetchCollections(@PathVariable Integer id) {
        return new ResponseEntity<>(collectionMapper.mapToDto(collectionService.findById(id)), HttpStatus.OK);
    }
}

package ao3.tracker.ao3tracker.controller;

import ao3.tracker.ao3tracker.dto.FanficDto;
import ao3.tracker.ao3tracker.mapper.FanficMapper;
import ao3.tracker.ao3tracker.model.Fanfic;
import ao3.tracker.ao3tracker.service.FanficService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/fanfic")
public class FanficController {
    @Autowired
    private FanficService fanficService;
    @Autowired
    private FanficMapper fanficMapper;

    @GetMapping
    public ResponseEntity<FanficDto> fetchFanfic(@RequestParam String url){
        Fanfic fanfic=fanficService.findByUrl(url);
        if(fanfic==null){
            return new ResponseEntity<>(fanficMapper.mapToDto(fanficService.createFanficByUrl(url)), HttpStatus.OK);
        }
        return new ResponseEntity<>(fanficMapper.mapToDto(fanfic), HttpStatus.OK);
    }

    @PostMapping("/id={id}")
    public ResponseEntity<FanficDto> fetchFanfic(@PathVariable Integer id){
        Fanfic fanfic=fanficService.findById(id);
        return new ResponseEntity<>(fanficMapper.mapToDto(fanfic), HttpStatus.OK);
    }

}

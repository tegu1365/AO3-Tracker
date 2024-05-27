package ao3.tracker.ao3tracker.controller;

import ao3.tracker.ao3tracker.dto.FanficDto;
import ao3.tracker.ao3tracker.service.FanficService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fanfic")
public class FanficController {
    @Autowired
    private FanficService fanficService;
   //add mapper

    

}

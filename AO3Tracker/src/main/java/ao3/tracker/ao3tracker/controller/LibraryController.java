package ao3.tracker.ao3tracker.controller;

import ao3.tracker.ao3tracker.dto.LibraryDto;
import ao3.tracker.ao3tracker.dto.LibraryUpdateDto;
import ao3.tracker.ao3tracker.dto.UsersDto;
import ao3.tracker.ao3tracker.dto.UsersLibraryDto;
import ao3.tracker.ao3tracker.mapper.LibraryMapper;
import ao3.tracker.ao3tracker.mapper.LibraryUpdateMapper;
import ao3.tracker.ao3tracker.mapper.UsersLibraryMapper;
import ao3.tracker.ao3tracker.model.Library;
import ao3.tracker.ao3tracker.model.Users;
import ao3.tracker.ao3tracker.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/library")
public class LibraryController {
    @Autowired
    private LibraryService libraryService;
    @Autowired
    private LibraryMapper libraryMapper;
    @Autowired
    private UsersLibraryMapper usersLibraryMapper;
    @Autowired
    private LibraryUpdateMapper libraryUpdateMapper;

    @GetMapping
    public ResponseEntity<List<UsersLibraryDto>> fetchUsersLibrary(@RequestParam Integer userId){
        List<Library> libraries=libraryService.getUserLibrary(userId);
        List<UsersLibraryDto> result=libraries
                .stream()
                .map(library -> usersLibraryMapper.mapToDto(library))
                .collect(Collectors.toList());
        return new ResponseEntity<>(result, HttpStatus.OK);
    }


    @PostMapping("/add")
    public ResponseEntity<LibraryDto> addFanficToLibrary(@RequestBody LibraryDto libraryDto) {
        Library library=libraryMapper.mapFromDto(libraryDto);
        return new ResponseEntity<>(libraryMapper.mapToDto(libraryService.createLibrary(library)),HttpStatus.CREATED);
    }

    @PostMapping("/update")
    public  ResponseEntity<LibraryUpdateDto> updateLibraryData(@RequestBody LibraryUpdateDto libraryUpdateDto){
        Library library=libraryUpdateMapper.mapFromDto(libraryUpdateDto);
        return new ResponseEntity<>(libraryUpdateMapper.mapToDto(libraryService.updateLibrary(library)),HttpStatus.OK);
    }
}

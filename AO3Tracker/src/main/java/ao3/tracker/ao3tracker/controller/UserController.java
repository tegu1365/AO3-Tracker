package ao3.tracker.ao3tracker.controller;

import ao3.tracker.ao3tracker.dto.CollectionDto;
import ao3.tracker.ao3tracker.dto.LoginDto;
import ao3.tracker.ao3tracker.dto.UsersDto;
import ao3.tracker.ao3tracker.mapper.UsersMapper;
import ao3.tracker.ao3tracker.model.Users;
import ao3.tracker.ao3tracker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private UsersMapper usersMapper;

    @GetMapping("/{id}")
    public ResponseEntity<UsersDto> fetchUsers(@PathVariable Integer id){
        return new ResponseEntity<>(usersMapper.mapToDto(userService.findById(id)), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<UsersDto> createUser(@RequestBody UsersDto usersDto) {
        Users users=usersMapper.mapFromDto(usersDto);
        return new ResponseEntity<>(usersMapper.mapToDto(userService.createUser(users)),HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<UsersDto> loginUser(@RequestBody LoginDto usersDto){
        return new ResponseEntity<>(usersMapper.mapToDto(
                userService.checkUser(usersDto.getUsername(),usersDto.getPassword())), HttpStatus.OK);
    }
}

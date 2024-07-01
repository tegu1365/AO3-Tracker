package ao3.tracker.ao3tracker.dto;

import ao3.tracker.ao3tracker.model.Collection;
import ao3.tracker.ao3tracker.model.Library;
import lombok.Data;

import java.util.List;

@Data
public class UsersDto
{
    private Integer id;
    private String username;
    private String email;
    private String password;
    //private List<Library> libraries;
   // private List<Collection> collections;
}

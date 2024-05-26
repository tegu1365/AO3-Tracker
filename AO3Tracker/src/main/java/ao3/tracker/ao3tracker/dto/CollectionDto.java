package ao3.tracker.ao3tracker.dto;

import ao3.tracker.ao3tracker.model.Fanfic;
import ao3.tracker.ao3tracker.model.Users;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
public class CollectionDto
{
    private Integer id;
    private Users ownerId;
    private String name;
    private String description;
    private List<Fanfic> fanfics;

}

package ao3.tracker.ao3tracker.dto;


import ao3.tracker.ao3tracker.model.Users;
import lombok.Data;

@Data
public class CreateCollectionDto {
    private Integer ownerId;
    private String name;
    private String description;
}

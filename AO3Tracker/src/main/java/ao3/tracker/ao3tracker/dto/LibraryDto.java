package ao3.tracker.ao3tracker.dto;

import ao3.tracker.ao3tracker.model.CustomTag;
import ao3.tracker.ao3tracker.model.Fanfic;
import ao3.tracker.ao3tracker.model.Tag;
import ao3.tracker.ao3tracker.model.Users;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Data
public class LibraryDto
{
    private Integer id;
    private UsersDto userId; // one to many
    private FanficDto fanficId; // one to many
    private Integer readChapters;
    private Date startedDate;
    private Date lastRead;
    private Tag tag;
    private List<CustomTag> customTags;
}

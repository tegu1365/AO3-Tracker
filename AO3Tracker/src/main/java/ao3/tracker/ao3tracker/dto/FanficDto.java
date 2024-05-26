package ao3.tracker.ao3tracker.dto;

import ao3.tracker.ao3tracker.model.Status;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class FanficDto
{
    private Integer id;
    private String title;
    private String author;
    private String url;
    private String fandom;
    private String summary;
    private Date dateStarted;
    private Date dataUploaded;
    private Integer chapterCurrently;
    private String chapterExpected;
    private Status status; // make enum
    private Integer wordCount;
    private List<LibraryDto> libraries;
}

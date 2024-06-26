package ao3.tracker.ao3tracker.model;

import java.util.Date;
import java.util.List;
import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

@Data
@Entity
public class Library
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Integer id;
    @ToString.Exclude
    @ManyToOne
    @JoinColumn(name="userId")
    private Users userId; // one to many
    @ToString.Exclude
    @ManyToOne
    @JoinColumn(name="fanficId")
    private Fanfic fanficId; // one to many
    private Integer readChapters;
    private Date startedDate;
    private Date lastRead;
    @Enumerated(EnumType.STRING)
    private Tag tag;
    @ToString.Exclude
    @ManyToMany
    @JoinTable(
//            name = "customTag_library",
            joinColumns = @JoinColumn(name = "customtag_id"),
            inverseJoinColumns = @JoinColumn(name = "library_id"))
    private List<CustomTag> customTags;

    public Library(){}

    public Integer getId()
    {
        return id;
    }
    public void setId(Integer id)
    {
        this.id = id;
    }

    public Users getUserId()
    {
        return userId;
    }
    public void setUserId(Users userId)
    {
        this.userId = userId;
    }

    public Fanfic getFanficId()
    {
        return fanficId;
    }
    public void setFanficId(Fanfic fanficId)
    {
        this.fanficId = fanficId;
    }

    public Integer getReadChapters()
    {
        return readChapters;
    }
    public void setReadChapters(Integer readChapters)
    {
        this.readChapters = readChapters;
    }

    public Date getStartedDate()
    {
        return startedDate;
    }
    public void setStartedDate(Date startedDate)
    {
        this.startedDate = startedDate;
    }

    public Date getLastRead()
    {
        return lastRead;
    }
    public void setLastRead(Date lastRead)
    {
        this.lastRead = lastRead;
    }

    public Tag getTag()
    {
        return tag;
    }
    public void setTag(Tag tag)
    {
        this.tag = tag;
    }

    public List<CustomTag> getCustomTags() {
        return customTags;
    }
    public void setCustomTags(List<CustomTag> customTags) {
        this.customTags = customTags;
    }

}

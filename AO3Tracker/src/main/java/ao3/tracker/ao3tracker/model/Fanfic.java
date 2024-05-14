package ao3.tracker.ao3tracker.model;

import java.util.Date;
import java.util.List;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Fanfic
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

    @Enumerated(EnumType.STRING)
    private Status status; // make enum

    private Integer wordCount;

    @Column(name="collections")
    @ManyToMany
    private List<Collection> collections;

    @Column(name="libraries")
    @OneToMany(mappedBy="fanficId")
    private List<Library> libraries;


    public Fanfic(){}
    public Integer getId()
    {
        return id;
    }
    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getTitle()
    {
        return title;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getAuthor()
    {
        return author;
    }
    public void setAuthor(String author)
    {
        this.author = author;
    }

    public String getUrl()
    {
        return url;
    }
    public void setUrl(String url)
    {
        this.url = url;
    }

    public String getFandom()
    {
        return fandom;
    }
    public void setFandom(String fandom)
    {
        this.fandom = fandom;
    }

    public String getSummary()
    {
        return summary;
    }
    public void setSummary(String summary)
    {
        this.summary = summary;
    }

    public Date getDateStarted()
    {
        return dateStarted;
    }
    public void setDateStarted(Date date_started)
    {
        this.dateStarted = date_started;
    }

    public Date getDataUploaded()
    {
        return dataUploaded;
    }
    public void setDataUploaded(Date data_uploaded)
    {
        this.dataUploaded = data_uploaded;
    }

    public Integer getChapterCurrently()
    {
        return chapterCurrently;
    }
    public void setChapterCurrently(Integer chapterCurrently)
    {
        this.chapterCurrently = chapterCurrently;
    }

    public String getChapterExpected()
    {
        return chapterExpected;
    }
    public void setChapterExpected(String chapterExpected)
    {
        this.chapterExpected = chapterExpected;
    }

    public Status getStatus()
    {
        return status;
    }
    public void setStatus(Status status)
    {
        this.status = status;
    }

    public Integer getWordCount()
    {
        return wordCount;
    }
    public void setWordCount(Integer wordCount)
    {
        this.wordCount = wordCount;
    }

    public List<Collection> getCollections() {
        return collections;
    }
    public void setCollections(List<Collection> collections) {
        this.collections = collections;
    }

    public List<Library> getLibraries() {
        return libraries;
    }
    public void setLibraries(List<Library> libraries) {
        this.libraries = libraries;
    }
}

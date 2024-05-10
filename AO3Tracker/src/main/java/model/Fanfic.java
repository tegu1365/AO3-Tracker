package model;

import java.util.Date;


import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@Entity
public class Fanfic
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name="title")
    private String title;

    @Column(name="author")
    private String author;

    @Column(name="url")
    private String url;

    @Column(name="fandom")
    private String fandom;

    @Column(name="summary")
    private String summary;

    @Column(name="date_started")
    private Date date_started;

    @Column(name="data_uploaded")
    private Date data_uploaded;

    @Column(name="chapter_currently")
    private Integer chapter_currently;

    @Column(name="chapter_expected")
    private String chapter_expected;

    @Enumerated(EnumType.STRING)
    @Column(name="status")
    private Status status; // make enum

    @Column(name="word_count")
    private Integer word_count; // could be a function





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

    public String getAutor()
    {
        return author;
    }
    public void setAutor(String autor)
    {
        this.author = autor;
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

    public Date getDate_started()
    {
        return date_started;
    }
    public void setDate_started(Date date_started)
    {
        this.date_started = date_started;
    }

    public Date getData_uploaded()
    {
        return data_uploaded;
    }
    public void setData_uploaded(Date data_uploaded)
    {
        this.data_uploaded = data_uploaded;
    }

    public Integer getChapter_currently()
    {
        return chapter_currently;
    }
    public void setChapter_currently(Integer chapter_currently)
    {
        this.chapter_currently = chapter_currently;
    }

    public String getChapter_expected()
    {
        return chapter_expected;
    }
    public void setChapter_expected(String chapter_expected)
    {
        this.chapter_expected = chapter_expected;
    }

    public Status getStatus()
    {
        return status;
    }
    public void setStatus(Status status)
    {
        this.status = status;
    }

    public Integer getWord_count()
    {
        return word_count;
    }
    public void setWord_count(Integer word_count)
    {
        this.word_count = word_count;
    }
}

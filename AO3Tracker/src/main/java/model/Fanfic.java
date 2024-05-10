package model;

import java.util.Date;


import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Fanfic
{
    private Integer id;
    private String title;
    private String autor;
    private String url;
    private String fandom;
    private String summary;
    private Date date_started;
    private Date data_uploaded;
    private Integer chapter_currently;
    private String chapter_expected;
    private Integer status;
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
        return autor;
    }
    public void setAutor(String autor)
    {
        this.autor = autor;
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

    public Integer getStatus()
    {
        return status;
    }
    public void setStatus(Integer status)
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

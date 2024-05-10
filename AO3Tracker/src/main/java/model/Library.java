package model;

import java.util.Date;


import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Library
{
    private  Integer id;
    private  Integer user_id;
    private  Integer fanfic_id;
    private  Integer read_chapters;
    private Date started_date;
    private Date last_read;
    private Integer tag;

    public Integer getId()
    {
        return id;
    }
    public void setId(Integer id)
    {
        this.id = id;
    }

    public Integer getUser_id()
    {
        return user_id;
    }
    public void setUser_id(Integer user_id)
    {
        this.user_id = user_id;
    }

    public Integer getFanfic_id()
    {
        return fanfic_id;
    }
    public void setFanfic_id(Integer fanfic_id)
    {
        this.fanfic_id = fanfic_id;
    }

    public Integer getRead_chapters()
    {
        return read_chapters;
    }
    public void setRead_chapters(Integer read_chapters)
    {
        this.read_chapters = read_chapters;
    }

    public Date getStarted_date()
    {
        return started_date;
    }
    public void setStarted_date(Date started_date)
    {
        this.started_date = started_date;
    }

    public Date getLast_read()
    {
        return last_read;
    }
    public void setLast_read(Date last_read)
    {
        this.last_read = last_read;
    }

    public Integer getTag()
    {
        return tag;
    }
    public void setTag(Integer tag)
    {
        this.tag = tag;
    }



}

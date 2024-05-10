package model;

import java.util.Date;


import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@Entity
public class Library
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Integer id;

    @Column(name="user_id")
    private  Integer user_id; // one to many

    @Column(name="fanfic_id")
    private  Integer fanfic_id; // one to many

    @Column(name="read_chapters")
    private  Integer read_chapters;

    @Column(name="started_date")
    private Date started_date;

    @Column(name="last_read")
    private Date last_read;

    @Enumerated(EnumType.STRING)
    @Column(name="tag")
    private Tag tag; // make enum



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

    public Tag getTag()
    {
        return tag;
    }
    public void setTag(Tag tag)
    {
        this.tag = tag;
    }



}

package model;


import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
@Entity
public class Collection
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name="owner_id")
    private Integer owner_id;

    @Column(name="name")
    private String name;

    @Column(name="description")
    private String description;

    @Column(name="fanfics")
    @ManyToMany
    @JoinTable(
            name = "collection_fanfic",
            joinColumns = @JoinColumn(name = "fanfic_id"),
            inverseJoinColumns = @JoinColumn(name = "collection_id"))
    private List<Fanfic> fanfics;


    public Integer getId()
    {
        return id;
    }
    public void setId(Integer id)
    {
        this.id = id;
    }

    public Integer getOwner_id()
    {
        return owner_id;
    }
    public void setOwner_id(Integer owner_id)
    {
        this.owner_id = owner_id;
    }

    public String getDescription()
    {
        return description;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

}

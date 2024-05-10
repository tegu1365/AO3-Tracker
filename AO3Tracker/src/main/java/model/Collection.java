package model;


import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Collection
{
    private Integer id;
    private Integer owner_id;
    private String name;
    private String description;


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

package ao3.tracker.ao3tracker.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@Entity
public class Collection
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @ToString.Exclude
    @ManyToOne
    @JoinColumn(name="ownerId")
    private Users ownerId;
    private String name;
    private String description;
    @ToString.Exclude
    @ManyToMany
    @JoinTable(
            joinColumns = @JoinColumn(name = "fanfic_id"),
            inverseJoinColumns = @JoinColumn(name = "collection_id"))
    private List<Fanfic> fanfics;

    public Collection(){}


    public Integer getId()
    {
        return id;
    }
    public void setId(Integer id)
    {
        this.id = id;
    }

    public Users getOwnerId()
    {
        return ownerId;
    }
    public void setOwnerId(Users owner_id)
    {
        this.ownerId = owner_id;
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

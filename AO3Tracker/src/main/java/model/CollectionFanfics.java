package model;


import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class CollectionFanfics
{
    private Integer id;
    private Integer collection_id;
    private Integer fanfic_id;


    public Integer getId()
    {
        return id;
    }
    public void setId(Integer id)
    {
        this.id = id;
    }

    public Integer getCollection_id()
    {
        return collection_id;
    }
    public void setCollection_id(Integer collection_id)
    {
        this.collection_id = collection_id;
    }

    public Integer getFanfic_id()
    {
        return fanfic_id;
    }
    public void setFanfic_id(Integer fanfic_id)
    {
        this.fanfic_id = fanfic_id;
    }

}

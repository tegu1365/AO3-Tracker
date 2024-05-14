package ao3.tracker.ao3tracker.model;

import java.util.List;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class CustomTag
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
//    @ManyToMany
//    private List<Library> libraries;


    public CustomTag(){}
    public Integer getId()
    {
        return id;
    }
    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

//    public List<Library> getLibraries() {
//        return libraries;
//    }
//    public void setLibraries(List<Library> libraries) {
//        this.libraries = libraries;
//    }
}

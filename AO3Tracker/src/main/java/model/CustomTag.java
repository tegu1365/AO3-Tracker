package model;

import java.util.List;


import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@Entity
public class CustomTag
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name="name")
    private String name;

    @Column(name = "libraries")
    @ManyToMany
    @JoinTable(
            name = "customTag_library",
            joinColumns = @JoinColumn(name = "library_id"),
            inverseJoinColumns = @JoinColumn(name = "customtag_id"))
    private List<Library> libraries;



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

    public List<Library> getLibraries() {
        return libraries;
    }
    public void setLibraries(List<Library> libraries) {
        this.libraries = libraries;
    }
}

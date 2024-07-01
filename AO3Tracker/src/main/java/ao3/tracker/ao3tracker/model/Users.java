package ao3.tracker.ao3tracker.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@Table
@Entity
public class Users
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String username;
    private String email;
    private String password;
    @ToString.Exclude
    @OneToMany(mappedBy="userId")
    private List<Library> libraries;
    @ToString.Exclude
    @OneToMany(mappedBy="ownerId")
    private List<Collection> collections;

    public Users(){ }


    public Integer getId()
    {
        return id;
    }
    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getUsername()
    {
        return username;
    }
    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getPassword()
    {
        return password;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }

    public List<Library> getLibraries() {
        return libraries;
    }
    public void setLibraries(List<Library> libraries) {
        this.libraries = libraries;
    }
}

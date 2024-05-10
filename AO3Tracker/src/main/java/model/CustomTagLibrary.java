package model;


import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class CustomTagLibrary
{
    private Integer id;
    private Integer lib_id;
    private Integer custom_library_id;

    public Integer getId()
    {
        return id;
    }
    public void setId(Integer id)
    {
        this.id = id;
    }

    public Integer getLib_id()
    {
        return lib_id;
    }
    public void setLib_id(Integer lib_id)
    {
        this.lib_id = lib_id;
    }

    public Integer getCustom_library_id()
    {
        return custom_library_id;
    }
    public void setCustom_library_id(Integer custom_library_id)
    {
        this.custom_library_id = custom_library_id;
    }
}

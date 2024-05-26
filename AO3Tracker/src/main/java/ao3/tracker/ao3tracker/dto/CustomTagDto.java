package ao3.tracker.ao3tracker.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class CustomTagDto
{
    private Integer id;
    private String name;
}

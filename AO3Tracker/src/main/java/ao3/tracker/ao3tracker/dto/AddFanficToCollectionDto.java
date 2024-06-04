package ao3.tracker.ao3tracker.dto;

import lombok.Data;

@Data
public class AddFanficToCollectionDto {
    Integer collectionId;
    Integer fanficId;
}

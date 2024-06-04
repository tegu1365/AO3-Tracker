package ao3.tracker.ao3tracker.mapper;

import ao3.tracker.ao3tracker.dto.CollectionByFanficIdDto;
import ao3.tracker.ao3tracker.dto.CollectionDto;
import ao3.tracker.ao3tracker.model.Collection;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")

public interface CollectionByFanficIdMapper {
    @Mapping(source = "id", target = "id")
    Collection mapFromDto(CollectionByFanficIdDto fanficDto);
    @Mapping(source = "id", target = "id")
    CollectionByFanficIdDto mapToDto(Collection fanfic);
}

package ao3.tracker.ao3tracker.mapper;

import ao3.tracker.ao3tracker.dto.CollectionDto;
import ao3.tracker.ao3tracker.model.Collection;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface CollectionMapper {
    @Mapping(source = "id", target = "id")
    Collection mapFromDto(CollectionDto fanficDto);
    @Mapping(source = "id", target = "id")
    CollectionDto mapToDto(Collection fanfic);
}

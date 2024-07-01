package ao3.tracker.ao3tracker.mapper;

import ao3.tracker.ao3tracker.dto.AllCollectionDto;
import ao3.tracker.ao3tracker.model.Collection;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AllCollectionMapper {
    @Mapping(source = "id", target = "id")
    Collection mapFromDto(AllCollectionDto fanficDto);
    @Mapping(source = "id", target = "id")
    AllCollectionDto mapToDto(Collection fanfic);
}

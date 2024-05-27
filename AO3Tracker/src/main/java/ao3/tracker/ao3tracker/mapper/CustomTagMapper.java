package ao3.tracker.ao3tracker.mapper;

import ao3.tracker.ao3tracker.dto.CustomTagDto;
import ao3.tracker.ao3tracker.model.CustomTag;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface CustomTagMapper {
    @Mapping(source = "id", target = "id")
    CustomTag mapFromDto(CustomTagDto fanficDto);
    @Mapping(source = "id", target = "id")
    CustomTagDto mapToDto(CustomTag fanfic);
}

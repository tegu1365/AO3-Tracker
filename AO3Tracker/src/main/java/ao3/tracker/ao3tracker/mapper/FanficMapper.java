package ao3.tracker.ao3tracker.mapper;

import ao3.tracker.ao3tracker.dto.FanficDto;
import ao3.tracker.ao3tracker.model.Fanfic;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface FanficMapper {
    @Mapping(source = "id", target = "id")
    Fanfic mapFromDto(FanficDto fanficDto);
    @Mapping(source = "id", target = "id")
    FanficDto mapToDto(Fanfic fanfic);
}

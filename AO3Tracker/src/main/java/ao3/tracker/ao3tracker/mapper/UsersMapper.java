package ao3.tracker.ao3tracker.mapper;

import ao3.tracker.ao3tracker.dto.UsersDto;
import ao3.tracker.ao3tracker.model.Users;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface UsersMapper {
    @Mapping(source = "id", target = "id")
    Users mapFromDto(UsersDto fanficDto);
    @Mapping(source = "id", target = "id")
    UsersDto mapToDto(Users fanfic);
}

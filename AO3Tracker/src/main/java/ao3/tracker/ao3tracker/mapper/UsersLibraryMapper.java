package ao3.tracker.ao3tracker.mapper;

import ao3.tracker.ao3tracker.dto.LibraryDto;
import ao3.tracker.ao3tracker.dto.UsersLibraryDto;
import ao3.tracker.ao3tracker.model.Library;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UsersLibraryMapper {
    @Mapping(source = "id", target = "id")
    Library mapFromDto(UsersLibraryDto libraryDto);
    @Mapping(source = "id", target = "id")
    UsersLibraryDto mapToDto(Library library);
}

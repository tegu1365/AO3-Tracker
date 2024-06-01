package ao3.tracker.ao3tracker.mapper;

import ao3.tracker.ao3tracker.dto.LibraryDto;
import ao3.tracker.ao3tracker.model.Library;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;


@Mapper(componentModel = "spring")
public interface LibraryMapper {
    @Mapping(source = "id", target = "id")
    Library mapFromDto(LibraryDto libraryDto);
    @Mapping(source = "id", target = "id")
    LibraryDto mapToDto(Library library);
}

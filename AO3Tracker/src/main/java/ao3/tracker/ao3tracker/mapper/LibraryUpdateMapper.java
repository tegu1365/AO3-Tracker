package ao3.tracker.ao3tracker.mapper;

import ao3.tracker.ao3tracker.dto.LibraryDto;
import ao3.tracker.ao3tracker.dto.LibraryUpdateDto;
import ao3.tracker.ao3tracker.model.Library;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface LibraryUpdateMapper {
    @Mapping(source = "id", target = "id")
    Library mapFromDto(LibraryUpdateDto libraryDto);
    @Mapping(source = "id", target = "id")
    LibraryUpdateDto mapToDto(Library library);
}

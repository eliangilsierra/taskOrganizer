package eliangilsierra.taskorganizer_backend.mapper;

import eliangilsierra.taskorganizer_backend.dto.PrioritiesDto;
import eliangilsierra.taskorganizer_backend.dto.UsersDto;
import eliangilsierra.taskorganizer_backend.entity.Priorities;
import eliangilsierra.taskorganizer_backend.entity.Users;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

import java.util.List;

@Mapper
public interface IPrioritiesMapper {

    @Named("toEntity")
    Priorities toEntity(PrioritiesDto dto);

    @Named("toDto")
    PrioritiesDto toDto(Priorities Entity);

    @IterableMapping(qualifiedByName = "toEntity")
    List<Priorities> toEntityList(List<PrioritiesDto> dtoList);

    @IterableMapping(qualifiedByName = "toDto")
    List<PrioritiesDto> toDtoList(List<Priorities> EntityList);
}

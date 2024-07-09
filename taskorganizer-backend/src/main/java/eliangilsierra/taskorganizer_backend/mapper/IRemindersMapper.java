package eliangilsierra.taskorganizer_backend.mapper;

import eliangilsierra.taskorganizer_backend.dto.RemindersDto;
import eliangilsierra.taskorganizer_backend.dto.UsersDto;
import eliangilsierra.taskorganizer_backend.entity.Reminders;
import eliangilsierra.taskorganizer_backend.entity.Users;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

import java.util.List;

@Mapper
public interface IRemindersMapper {

    @Named("toEntity")
    Reminders toEntity(RemindersDto dto);

    @Named("toDto")
    RemindersDto toDto(Reminders Entity);

    @IterableMapping(qualifiedByName = "toEntity")
    List<Reminders> toEntityList(List<RemindersDto> dtoList);

    @IterableMapping(qualifiedByName = "toDto")
    List<RemindersDto> toDtoList(List<Reminders> EntityList);
}

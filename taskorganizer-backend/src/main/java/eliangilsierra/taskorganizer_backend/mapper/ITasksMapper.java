package eliangilsierra.taskorganizer_backend.mapper;

import eliangilsierra.taskorganizer_backend.dto.TasksDto;
import eliangilsierra.taskorganizer_backend.dto.UsersDto;
import eliangilsierra.taskorganizer_backend.entity.Tasks;
import eliangilsierra.taskorganizer_backend.entity.Users;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

import java.util.List;

@Mapper
public interface ITasksMapper {

    @Named("toEntity")
    Tasks toEntity(TasksDto dto);

    @Named("toDto")
    TasksDto toDto(Tasks Entity);

    @IterableMapping(qualifiedByName = "toEntity")
    List<Tasks> toEntityList(List<TasksDto> dtoList);

    @IterableMapping(qualifiedByName = "toDto")
    List<TasksDto> toDtoList(List<Tasks> EntityList);
}

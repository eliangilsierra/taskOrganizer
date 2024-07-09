package eliangilsierra.taskorganizer_backend.mapper;

import eliangilsierra.taskorganizer_backend.dto.GroupListDto;
import eliangilsierra.taskorganizer_backend.dto.UsersDto;
import eliangilsierra.taskorganizer_backend.entity.GroupList;
import eliangilsierra.taskorganizer_backend.entity.Users;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

import java.util.List;

@Mapper
public interface IGroupListMapper {

    @Named("toEntity")
    GroupList toEntity(GroupListDto dto);

    @Named("toDto")
    GroupListDto toDto(GroupList Entity);

    @IterableMapping(qualifiedByName = "toEntity")
    List<GroupList> toEntityList(List<GroupListDto> dtoList);

    @IterableMapping(qualifiedByName = "toDto")
    List<GroupListDto> toDtoList(List<GroupList> EntityList);
}

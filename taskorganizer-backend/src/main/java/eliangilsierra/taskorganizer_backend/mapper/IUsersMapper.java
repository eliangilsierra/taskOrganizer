package eliangilsierra.taskorganizer_backend.mapper;

import eliangilsierra.taskorganizer_backend.dto.UsersDto;
import eliangilsierra.taskorganizer_backend.entity.Users;
import jdk.jfr.Name;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

import java.util.List;

@Mapper
public interface IUsersMapper {

    @Named("toEntity")
    Users toEntity(UsersDto dto);

    @Named("toDto")
    UsersDto toDto(Users Entity);

    @IterableMapping(qualifiedByName = "toEntity")
    List<Users> toEntityList(List<UsersDto> dtoList);

    @IterableMapping(qualifiedByName = "toDto")
    List<UsersDto> toDtoList(List<Users> EntityList);
}

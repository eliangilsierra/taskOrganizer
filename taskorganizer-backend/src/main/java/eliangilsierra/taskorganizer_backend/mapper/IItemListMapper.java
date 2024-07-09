package eliangilsierra.taskorganizer_backend.mapper;

import eliangilsierra.taskorganizer_backend.dto.ItemListDto;
import eliangilsierra.taskorganizer_backend.entity.ItemList;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

import java.util.List;


@Mapper
public interface IItemListMapper {

    @Named("toEntity")
    ItemList toEntity(ItemListDto dto);

    @Named("toDto")
    ItemListDto toDto(ItemList Entity);

    @IterableMapping(qualifiedByName = "toEntity")
    List<ItemList> toEntityList(List<ItemListDto> dtoList);

    @IterableMapping(qualifiedByName = "toDto")
    List<ItemListDto> toDtoList(List<ItemList> EntityList);
}

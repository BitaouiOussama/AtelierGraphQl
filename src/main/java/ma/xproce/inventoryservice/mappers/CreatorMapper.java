package ma.xproce.inventoryservice.mappers;

import ma.xproce.inventoryservice.dao.entities.Creator;
import ma.xproce.inventoryservice.dtos.CreatorDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CreatorMapper {

    private ModelMapper modelMapper = new ModelMapper();

    public CreatorDto fromCreatorToCreatorDto(Creator creator){
        return  modelMapper.map(creator, CreatorDto.class );
    }   public Creator fromCreatorDtoToCreator(CreatorDto creatorDto){
        return  modelMapper.map(creatorDto, Creator.class );
    }
}

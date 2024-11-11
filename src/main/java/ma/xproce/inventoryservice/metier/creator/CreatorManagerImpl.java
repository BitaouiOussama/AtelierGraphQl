package ma.xproce.inventoryservice.metier.creator;

import ma.xproce.inventoryservice.dao.repositories.CreatorRepo;
import ma.xproce.inventoryservice.dtos.CreatorDto;
import ma.xproce.inventoryservice.mappers.CreatorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class CreatorManagerImpl implements CreatorManager{

    @Autowired
    private CreatorRepo creatorRepo;

    @Autowired
    private CreatorMapper creatorMapper;

    @Override
    public CreatorDto saveCreator(CreatorDto creatorDto) {
        return creatorMapper.fromCreatorToCreatorDto(creatorRepo.save(creatorMapper.fromCreatorDtoToCreator(creatorDto)));
    }
}

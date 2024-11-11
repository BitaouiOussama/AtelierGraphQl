package ma.xproce.inventoryservice.web;

import ma.xproce.inventoryservice.dao.repositories.CreatorRepo;
import ma.xproce.inventoryservice.metier.creator.CreatorManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CreatorGraphQlController {

    @Autowired
    CreatorManager creatorManager;
    private CreatorRepo creatorRepository;
}

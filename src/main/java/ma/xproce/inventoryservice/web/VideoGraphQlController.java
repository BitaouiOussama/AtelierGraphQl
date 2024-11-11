package ma.xproce.inventoryservice.web;

import ma.xproce.inventoryservice.dao.entities.Creator;
import ma.xproce.inventoryservice.dao.entities.Video;
import ma.xproce.inventoryservice.dao.repositories.CreatorRepo;
import ma.xproce.inventoryservice.dao.repositories.VideoRepo;
import ma.xproce.inventoryservice.dtos.CreatorDto;
import ma.xproce.inventoryservice.dtos.VideoDto;
import ma.xproce.inventoryservice.metier.creator.CreatorManager;
import ma.xproce.inventoryservice.metier.video.VideoManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class VideoGraphQlController {
    @Autowired
    CreatorManager creatorManager;
    @Autowired
    VideoManager videoManager;
    private CreatorRepo creatorRepository;
    private VideoRepo videoRepository;
    VideoGraphQlController(CreatorRepo creatorRepository, VideoRepo videoRepository){
        this.creatorRepository = creatorRepository;
        this.videoRepository = videoRepository;
    }
    @QueryMapping
    public List<Video> videoList(){
        return videoRepository.findAll();
    }
    @QueryMapping
    public Creator creatorById(@Argument Long id) {
        return creatorRepository.findById(id)
                .orElseThrow(()->new RuntimeException(String.format("Creator %s not found",id)));
    }

    @MutationMapping
    public CreatorDto saveCreator(@Argument CreatorDto creator){

        return creatorManager.saveCreator(creator);
    }

    @MutationMapping
    public VideoDto saveVideo(@Argument VideoDto video){

        return videoManager.saveVideo(video) ;
    }

}
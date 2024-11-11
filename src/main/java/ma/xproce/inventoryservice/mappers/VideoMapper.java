package ma.xproce.inventoryservice.mappers;

import ma.xproce.inventoryservice.dao.entities.Video;
import ma.xproce.inventoryservice.dtos.VideoDto;
import org.springframework.stereotype.Component;
import org.modelmapper.ModelMapper;


@Component
public class VideoMapper {

    private ModelMapper modelMapper = new ModelMapper();

    public VideoDto fromVideoToVideoDto(Video video){
        return  modelMapper.map(video, VideoDto.class );
    }   public Video fromVideoDtoToVideo(VideoDto videoDto){
        return  modelMapper.map(videoDto, Video.class );
    }

}

package ma.xproce.inventoryservice.dtos;

import lombok.*;
import ma.xproce.inventoryservice.dao.entities.Video;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class CreatorDto {

    protected String name;
    protected String email;
    protected List<Video> videos;
}

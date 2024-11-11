package ma.xproce.inventoryservice.dtos;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.*;
import ma.xproce.inventoryservice.dao.entities.Creator;

import java.util.Date;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class VideoDto {


    protected String name;
    protected String url;
    protected String description ;
    protected Date datePublication;
    protected Creator creator;

}

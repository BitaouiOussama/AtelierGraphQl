package ma.xproce.inventoryservice.dao.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Video {

    @Id
    protected Long id;
    protected String name;
    protected String url;
    protected String description ;
    protected Date datePublication;


    @ManyToOne
   protected Creator creator;
}

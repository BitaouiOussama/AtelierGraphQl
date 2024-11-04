package ma.xproce.inventoryservice.dao.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Creator {

    @Id
    protected Long id;
    protected String name;
    protected String email;

    @OneToMany(mappedBy = "creator")
    List<Video> videos;
}


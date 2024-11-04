package ma.xproce.inventoryservice;

import ma.xproce.inventoryservice.dao.entities.Creator;
import ma.xproce.inventoryservice.dao.entities.Video;
import ma.xproce.inventoryservice.dao.repositories.CreatorRepo;
import ma.xproce.inventoryservice.dao.repositories.VideoRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class InventoryServiceApplication {



    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }


    @Bean
    CommandLineRunner start(CreatorRepo creatorRepo, VideoRepo videoRepo) {
        return args -> {
            // Création de quelques créateurs
            List<Creator> creators = List.of(
                    Creator.builder().id(1L).name("Creator One").email("creator1@example.com").build(),
                    Creator.builder().id(2L).name("Creator Two").email("creator2@example.com").build()
            );
            creatorRepo.saveAll(creators);

            // Création de quelques vidéos
            List<Video> videos = List.of(
                    Video.builder()
                            .id(1L)
                            .name("Video One")
                            .url("http://example.com/video1")
                            .description("Description of Video One")
                            .datePublication(new Date())
                            .creator(creators.get(0))
                            .build(),
                    Video.builder()
                            .id(2L)
                            .name("Video Two")
                            .url("http://example.com/video2")
                            .description("Description of Video Two")
                            .datePublication(new Date())
                            .creator(creators.get(1))
                            .build()
            );
            videoRepo.saveAll(videos);
        };
    }

}

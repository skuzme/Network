package com.polytech.Config;

import com.polytech.persistence.DatabaseRepository;
import com.polytech.persistence.StoryRepository;
import com.polytech.services.FeedService;
import com.polytech.services.PublicationService;
import com.polytech.web.FeedController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;

import javax.sql.DataSource;
import java.sql.SQLException;

@Configuration
public class AppConfig{


    @Bean
    public FeedService feedService() throws SQLException {
        return new FeedService(storyRepository(dataSource()));
    }

    @Bean
    public PublicationService publicationService() throws SQLException {
        return new PublicationService(storyRepository(dataSource()));
    }

    @Bean
    public FeedController feedController() throws SQLException {
        return new FeedController(publicationService(),feedService());
    }

    @Bean
    public StoryRepository storyRepository(DataSource dataSource) throws SQLException {
        return new DatabaseRepository(dataSource.getConnection());
    }

    @Bean
    public DataSource dataSource(){
        return new EmbeddedDatabaseBuilder()
                .addScript("db.sql")
                .build();

    }
}


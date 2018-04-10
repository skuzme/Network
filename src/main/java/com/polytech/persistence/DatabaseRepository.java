package com.polytech.persistence;

import com.polytech.services.Story;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static com.polytech.persistence.inMemoryRepository.stories;

public class DatabaseRepository implements StoryRepository{

    private Connection connexion;

    public DatabaseRepository(Connection connexion) {
        this.connexion = connexion;
    }


    @Override
    public List<Story> getStories() {
        String query = "SELECT * FROM STORY";
        try {
            Statement statement = connexion.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            List<Story> stories = new ArrayList<>();

            while (resultSet.next()){
                String content = resultSet.getString("CONTENT");

                stories.add(new Story(content));
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return stories;
    }

    @Override
    public void addStory(Story story) {
        String query = "INSERT INTO STORY VALUES('"+story.getContent()+"')";
        try {
            Statement statement = connexion.createStatement();
            statement.execute(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }





}

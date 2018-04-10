package com.polytech.persistence;

import com.polytech.services.Story;

import java.util.ArrayList;
import java.util.List;

public class StoryRepository {

    static List<Story> stories = new ArrayList<>();

    public  List<Story> getStories() {
        return stories;
    }


    public void addStory(Story story){
        stories.add(story);
    }


}

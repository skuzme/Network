package com.polytech.services;

import com.polytech.persistence.StoryRepository;

import java.util.List;

public class FeedService {

    StoryRepository storyRepository = new StoryRepository();

    public List<Story> getStories() {

        return storyRepository.getStories();
    }

}

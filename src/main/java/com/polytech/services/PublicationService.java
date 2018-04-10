package com.polytech.services;

import com.polytech.persistence.StoryRepository;

import java.util.Arrays;
import java.util.List;

public class PublicationService {

    StoryRepository storyRepository = new StoryRepository();


    public void addStory(Story story) {
        storyRepository.addStory(story);
    }
}

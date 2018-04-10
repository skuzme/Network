package com.polytech.services;

import com.polytech.persistence.StoryRepository;


public class PublicationService {

    private StoryRepository storyRepository;

    public PublicationService(StoryRepository storyRepository) {
        this.storyRepository = storyRepository;
    }


    public void addStory(Story story) {
        storyRepository.addStory(story);
    }
}

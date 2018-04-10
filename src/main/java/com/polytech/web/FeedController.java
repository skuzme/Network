package com.polytech.web;

import com.polytech.services.FeedService;
import com.polytech.services.PublicationService;
import com.polytech.services.Story;

import java.util.List;

public class FeedController {

    private PublicationService publicationService;
    private FeedService feedService;

    public FeedController(PublicationService publicationService, FeedService feedService) {
        this.publicationService = publicationService;
        this.feedService = feedService;
    }


    public List<Story> feed() {
        return feedService.getStories();
    }

    public void post(Story story) {
        publicationService.addStory(story);
    }
}

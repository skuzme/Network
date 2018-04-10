package com.polytech.web;

import com.polytech.services.FeedService;
import com.polytech.services.PublicationService;
import com.polytech.services.Story;

import java.util.List;

public class FeedController {

    PublicationService publicationService =  new PublicationService();
    FeedService feedService = new FeedService();


    public List<Story> feed() {
        return feedService.getStories();
    }

    public void post(Story story) {
        publicationService.addStory(story);
    }
}

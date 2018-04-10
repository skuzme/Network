import com.polytech.Config.AppConfig;
import com.polytech.services.Story;
import com.polytech.web.FeedController;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

public class PublicationTest {


    private FeedController feedController;


    @Before
    public void setUp(){
        AnnotationConfigApplicationContext config = new AnnotationConfigApplicationContext(AppConfig.class);
        feedController = config.getBean(FeedController.class);
    }


    @Test
    public void shouldPostStory(){
        //GIVEN
        Story story = new Story("ma story");


        //WHEN
        feedController.post(story);

        //THEN
        List<Story> stories = feedController.feed();
        Assert.assertEquals(stories, Arrays.asList(new Story("ma story")));

    }




}

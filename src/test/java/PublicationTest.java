import com.polytech.services.Story;
import com.polytech.web.FeedController;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class PublicationTest {


    @Test
    public void shouldPostStory(){
        //GIVEN
        Story story = new Story("ma story");
        FeedController feedController = new FeedController();

        //WHEN
        feedController.post(story);

        //THEN
        List<Story> stories = feedController.feed();
        Assert.assertEquals(stories, Arrays.asList(story));

    }




}

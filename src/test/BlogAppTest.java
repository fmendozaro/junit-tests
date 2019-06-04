import org.junit.Test;;

import static org.junit.Assert.assertNotNull;

public class BlogAppTest{

    @Test
    public void testCreatePostInstance(){
        Post post = new Post("PS4", "For sale", 1);
        assertNotNull(post);
    }

}
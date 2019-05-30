import org.junit.Test;

import static org.junit.Assert.*;

public class BlogAppTest {

    @Test
    public void testCreatePost(){
        Post post = new Post("title", "content", 1);
        assertNotNull(post);
        assertEquals("title", post.getTitle());
    }

}

import org.junit.Test;

import static org.junit.Assert.*;

public class PostTest {

    @Test
    public void testAddPost(){
        Post post = new Post("ps4", "for sale", 1L);
        assertNotNull(post);
        assertEquals("ps4", post.title);
        Post savedPost = post.save(post);
        assertNotNull(savedPost);
    }
}

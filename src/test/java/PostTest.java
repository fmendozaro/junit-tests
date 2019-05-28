import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class PostTest {

    @Test
    public void testAddPost(){
        Post post = new Post("title", "content", 1L);
        assertNotNull(post);
    }
}

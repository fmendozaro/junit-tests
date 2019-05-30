import org.junit.Test;

import static org.junit.Assert.assertNull;

public class BlogAppTest {

    @Test
    public void testCreatePost(){
        Post post = new Post("title", "content", 1);
        assertNull(post);

    }

}

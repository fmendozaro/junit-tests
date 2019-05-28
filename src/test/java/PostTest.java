import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PostTest {

    @Test
    public void testAddPost(){
        Post post = new Post("ps4", "for sale", 1L);
        assertNotNull(post);
        assertEquals("ps4", post.title);
        Post savedPost = post.save(post);
        assertNotNull(savedPost);
        assertEquals("ps4", savedPost.title);
    }

    @Test
    public void testFindAll(){
        Post post = new Post("ps4", "for sale", 1L);
        Post savedPost = post.save(post);
        ArrayList<Post> posts = post.findAll();
        assertNotNull(posts);
        assertEquals("for sale", posts.get(0).content);
    }
}

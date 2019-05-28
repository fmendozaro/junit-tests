import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PostTest {

    Post postWithOne;
    Post savedPost;

    @Before
    public void setUp(){
        postWithOne = new Post("ps4", "for sale", 1L);
        savedPost = postWithOne.save(postWithOne);
    }

    @Test
    public void testAddPost(){
        assertNotNull(postWithOne);
        assertEquals("ps4", postWithOne.title);
        assertNotNull(savedPost);
        assertEquals("ps4", savedPost.title);
    }

    @Test
    public void testFindAll(){
        ArrayList<Post> posts = postWithOne.findAll();
        assertNotNull(posts);
        assertEquals("for sale", posts.get(0).content);
    }

    @Test
    public void testFindOne(){
        Post foundPost = postWithOne.findOne(1);
        assertNotNull(foundPost);
        assertEquals(1L, foundPost.userId);
    }
}

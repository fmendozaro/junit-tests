import junit.framework.TestCase;
import org.junit.Test;

class BlogAppTest{

    @Test
    public void testCreatePostInstance(){
        Post post = new Post("PS4", "For sale", 1);
        TestCase.assertNotNull(post);
    }

}
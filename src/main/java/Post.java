import java.util.ArrayList;

public class Post {

    private ArrayList<Post> posts;
    String title;
    String content;
    long userId;

    public Post(String title, String content, long userId) {
        posts = new ArrayList<Post>();
    }
}

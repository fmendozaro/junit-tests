import java.util.ArrayList;

public class Post {

    private ArrayList<Post> posts;
    String title;
    String content;
    long userId;

    public Post(String title, String content, long userId) {
        this.title = title;
        this.content = content;
        this.userId = userId;
        posts = new ArrayList<Post>();
    }

    public Post save(Post post) {
        posts.add(post);
        return posts.get(posts.size()-1);
    }

    public ArrayList<Post> findAll() {
        return null;
    }
}

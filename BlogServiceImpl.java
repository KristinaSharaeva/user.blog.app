import java.util.ArrayList;
import java.util.List;

class BlogServiceImpl implements BlogService {
    private List<String> posts = new ArrayList<>();

    public void createPost(String post) {
        System.out.println("Post created: " + post);
        posts.add(post);
    }

    public String getPostById(int postId) {
        if (postId < posts.size()) {
            return posts.get(postId);
        }
        return null;
    }
}

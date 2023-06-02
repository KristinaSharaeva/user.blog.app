
public class Main {
       public static void main(String[] args) {
        UserRepository userRepository = new InMemoryUserRepository();
        BlogService blogService = new BlogServiceImpl();
        BlogController blogController = new BlogController(userRepository, blogService);

        User user = new User(1, "Alice", "alice@example.com");
        blogController.createUser(user);
        User retrievedUser = blogController.getUserById(1);
        System.out.println("Retrieved user: " + retrievedUser.getUsername());

        blogController.createPost("Hello, world!");
        String retrievedPost = blogController.getPostById(0);
        System.out.println("Retrieved post: " + retrievedPost);

        blogController.deleteUser(user);
    }
}

class BlogController {
    private UserRepository userRepository;
    private BlogService blogService;

    public BlogController(UserRepository userRepository, BlogService blogService) {
        this.userRepository = userRepository;
        this.blogService = blogService;
    }

    public void createUser(User user) {
        userRepository.createUser(user);
    }

    public User getUserById(int userId) {
        return userRepository.getUserById(userId);
    }

    public void deleteUser(User user) {
        userRepository.deleteUser(user);
    }

    public void createPost(String post) {
        blogService.createPost(post);
    }

    public String getPostById(int postId) {
        return blogService.getPostById(postId);
    }
}

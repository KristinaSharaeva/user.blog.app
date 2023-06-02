import java.util.ArrayList;
import java.util.List;

class InMemoryUserRepository implements UserRepository {
    private List<User> users = new ArrayList<>();

    public void createUser(User user) {
        System.out.println("User created: " + user.getUsername());
        users.add(user);
    }

    public User getUserById(int userId) {
        return users.stream()
                .filter(user -> user.getId() == userId)
                .findFirst()
                .orElse(null);
    }

    public void deleteUser(User user) {
        System.out.println("User deleted: " + user.getUsername());
        users.remove(user);
    }
}

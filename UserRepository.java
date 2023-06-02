interface UserRepository {
    void createUser(User user);
    User getUserById(int userId);
    void deleteUser(User user);
}

package ch11;

public interface UserDao {
	User find(String userId) throws UserNotFoundException;
}

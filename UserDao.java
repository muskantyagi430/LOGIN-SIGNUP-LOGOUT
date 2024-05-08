package elexnova.com.dao;

 public interface UserDao {
	

	boolean isValidUser(String name, String no, String email);
	boolean addUser(User1 user);



}

package elexnova.com.dao;

 interface UserDao {
	

	boolean isValidUser(String name, String no, String email);
	boolean addUser(User1 user);



}

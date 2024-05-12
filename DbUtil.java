package elexnova.com.util;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
	private static final String url="jdbc:mysql://localhost:3306/client_query";
	private static final String username="root";
	private static final String pass="your password";
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url,username,pass);
	}

}

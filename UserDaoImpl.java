package elexnova.com.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import elexnova.com.model.User;
import elexnova.com.util.DbUtil;

public class UserDaoImpl implements UserDao{

	@Override
	public boolean isValidUser(String name1, String no1, String email1) {
		// TODO Auto-generated method stub
		String query="select*from login_info where name=? and no=? and email=?";
		try(Connection conn=DbUtil.getConnection();
			PreparedStatement pr=conn.prepareStatement(query);){
			pr.setString(1, name1);
			pr.setString(2, no1);
			pr.setString(3, email1);
			ResultSet resultset=pr.executeQuery();
			System.out.println("execute");
			return resultset.next();
		}catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean addUser(User1 user) {
		// TODO Auto-generated method stub
		String query="insert into login_info(name,no,email) values(?,?,?)";
		
		try(Connection conn=DbUtil.getConnection();
			PreparedStatement pr=conn.prepareStatement(query)){
			pr.setString(1, user.getUsername());
			pr.setString(2, user.getPhone());
			pr.setString(3, user.getEmail());
			int rows=pr.executeUpdate();
			System.out.println("user added");
			return rows>0;
		}catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
		
		
	
	}

}

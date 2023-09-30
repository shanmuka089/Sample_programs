package shanmuka;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginValidation2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection cn=null;
	PreparedStatement pst=null;
	ResultSet rs=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	        cn=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&&password=Shanmukha@5525d&&USESSL=false");
	        pst=cn.prepareStatement("select * from jaanu.person");
	        rs=pst.executeQuery();
	        System.out.println(rs);
	        }catch(ClassNotFoundException | SQLException e) {
	        	e.printStackTrace();
	        }  
	}

}

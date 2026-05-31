package jdbcConnection;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class updatestatement {
	public static void main(String[] args) throws Exception{
		String name="Bantii";
		String city="Nashik";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","Sameer@7245");
		PreparedStatement ps=con.prepareStatement("update register set name=? where city=?");
		ps.setString(1, name);
		ps.setString(2,city);
		int i=ps.executeUpdate();
		if(i>0) {
			System.out.println("Successfully Update Query..");
		}else {
			System.out.println("Not Update Statements Failed Statements..");
		}
	}

}

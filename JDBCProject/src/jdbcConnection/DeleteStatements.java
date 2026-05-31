package jdbcConnection;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
public class DeleteStatements {
	public static void main(String[] args) throws Exception{
		String email="sameer@nmiet";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","Sameer@7245");
		PreparedStatement ps=con.prepareStatement("delete from register where email =?");
		ps.setString(1, email);
		int i=ps.executeUpdate();
		if(i>0) {
			System.out.println("Deleted Value Successfully..!");
		}else {
			System.out.println("Not Deleted Failed Statements..");
		}
	}

}

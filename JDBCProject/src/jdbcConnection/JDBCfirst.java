package jdbcConnection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;

import java.util.*;
public class JDBCfirst {
    public static void main(String[] args)throws Exception {
    	String name="Girish";
    	String email="girish@yahoo.com";
    	String password="GIrish@2001";
    	String gender="male";
    	String city="Nashik";
     
            Class.forName("com.mysql.cj.jdbc.Driver");
            //System.out.println("Driver Loaded Successfully..!");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","Sameer@7245");
            //System.out.println("Connection successfully..!");
        PreparedStatement ps= con.prepareStatement("insert into register values('"+name+"','"+email+"','"+password+"','"+gender+"','"+city+"')");
        int i=ps.executeUpdate();
        if(i>0) {
        	System.out.println("Successful Data to store in database..!");
        }else {
        	System.out.println("Not data Store in database..");
        }
    }
}
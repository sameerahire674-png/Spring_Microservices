package com.sam;
import java.util.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.sp.beans.Student;
import in.sp.mappers.StudentRowMapper;
import in.sp.resources.SpringConfigFile;
public class App {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	
       ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
       JdbcTemplate jdbcTemplate=context.getBean(JdbcTemplate.class);
       
       // Insertion Query
//       int std_roll=103;
//   	   String std_name="Vijay";
//   	   float std_marks=97.2f;
//       String insert_sql_query="Insert Into Student Values(?,?,?)";
//       int count=jdbcTemplate.update(insert_sql_query, std_roll, std_name, std_marks );
//       if(count>0) {
//    	   System.out.println("Data insertion Sucessfull..!");
//       }
//       else {
//    	   System.out.println("Data Insertion Failed..");
//      }
//       
       
       //Update Query
       
//       float std_marks=99.9f;
//       String strd_name="Sameer";
//       String update_sql_query="Update Student SET std_marks=? where strd_name=?";
//       int count=jdbcTemplate.update(update_sql_query,std_marks,strd_name);
//       if(count>0) {
//    	   System.out.println("Data Updated Sucessfully...!");
//    	   
//       }else {
//    	   System.out.println("Data Updated Failed..!");
//       }
       
         //Delete Operation
//       System.out.println("Enter the Name you want to delete");
//       String strd_name=sc.nextLine();
//       String delete_sql_query="Delete from Student where strd_name=?";
//       int count=jdbcTemplate.update(delete_sql_query,strd_name);
//       if(count>0) {
//    	   System.out.println("Data Deleted Successfully..!");
//       }else {
//    	   System.out.println("Data Not Deleted..!");
//       }
       
//                          // Select Query  Method 1
//        String select_sql_query="select * from Student";
//        List<Student>std_list=jdbcTemplate.query(select_sql_query, new StudentRowMapper());
//        for(Student std:std_list) {
//        	System.out.println("Roll No :"+std.getRollno());
//        	System.out.println("Name:"+std.getName());
//        	System.out.println("Marks :"+std.getMarks());
//        	System.out.println("========================================");
//        	
//        	
//        }
       // Select Query Display the specific Data 
       
//       float marks=99.9f;
//       String name="Sameer";
//      String select_sql_query="select * from Student where std_marks=? AND strd_name=?";
//       List<Student>std_list=jdbcTemplate.query(select_sql_query, new StudentRowMapper(), marks,name);
//     for(Student std:std_list) {
//	   System.out.println("Roll No :"+std.getRollno());
//	   System.out.println("Name:"+std.getName());
//	    System.out.println("Marks :"+std.getMarks());
//	      System.out.println("========================================");	
//}
       
       
    // Select Query Display the specific Data using the queryForObject() method.
//
//       int rollno=103;
//       String name="Vijay";
//      String select_sql_query="select * from Student where std_roll=? AND strd_name=?";
//      Student std=jdbcTemplate.queryForObject(select_sql_query, new StudentRowMapper(),rollno,name);
//	   System.out.println("Roll No :"+std.getRollno());
//	   System.out.println("Name:"+std.getName());
//	    System.out.println("Marks :"+std.getMarks());
//	      System.out.println("========================================");	
//       
        
    }
}

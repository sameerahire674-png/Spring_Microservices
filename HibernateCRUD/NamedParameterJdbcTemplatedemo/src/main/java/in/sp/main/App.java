package in.sp.main;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import in.sp.resources.SpringConfigFile;

public class App {
    public static void main(String[] args) {
     ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
     NamedParameterJdbcTemplate npjdbctemp=context.getBean(NamedParameterJdbcTemplate.class);
     Map<String, Object>map=new HashMap<String, Object>();
     map.put("key_rollno", 105);
     map.put("key_name", "Harshal");
     map.put("key_marks",88.8f);
     
     String insert_sql_query = "INSERT INTO student VALUES(:key_rollno, :key_name, :key_marks)";
     int count=npjdbctemp.update(insert_sql_query, map);
     if(count>0) {
    	 System.out.println("Data Inserted Sucessfully..!");
     }else {
    	 System.out.println("Data Not Stored..!");
     }
    }
}

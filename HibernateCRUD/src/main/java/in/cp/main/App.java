package in.cp.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.cp.entities.User;

public class App 
{
    public static void main( String[] args )
    {
    	User user2=new User();
    	//user1.setId(1);
    	user2.setName("Kailas");
    	user2.setEmail("kailas@gmail.com");
    	user2.setPassword("kailas@2004");
    	user2.setAddress("Jalna");
      Configuration cfg= new Configuration(); //create the configuration object.
      cfg.configure("/in/cp/config/hibernate.cfg.xml"); //calling our hibernate file
      SessionFactory sessionFactory = cfg.buildSessionFactory(); //it creates and manages session object
      Session session =sessionFactory.openSession(); //manage database operations
      Transaction transaction=session.beginTransaction(); //it controls the boundaries the database transaction.
      
//      * Insert operation * 
//     try {
//    	 session.save(user2);
//         transaction.commit();
//     }catch(Exception e) {
//    	 transaction.rollback();
//    	 e.printStackTrace();
//    	 
//     }
      
      //   *Select Operation * 
//      try {
//    	  User user=session.get(User.class, 3l);
//    	  if (user != null) {
//    		    System.out.println(user);
//    		} else {
//    		    System.out.println("User not found!");
//    		}
//    	  
//      }catch(Exception e) {
//    	  e.printStackTrace();
//      }
      
      // Update Operation
//      User user=new User();
//  	user.setId(2l);
//  	user.setName("Kalpesh");
//  	user.setEmail("kalpesh@gmail.com");
//  	user.setPassword("kalpesh@2004");
//  	user.setAddress("pune");
//  	try {
//   	 session.saveOrUpdate(user);
//        transaction.commit();
//        if(user!=null) {
//        System.out.println("Update Sucessuflly..!");
//        }else{
//        	System.out.println("NOt Updated");
//        }
//        
//    }catch(Exception e) {
//   	 transaction.rollback();
//   	 e.printStackTrace();
//   	 
//    }
      
      
      // Delete Operation
      User user=new User();
    	user.setId(4l);
    	try {
     	 session.delete(user);
          transaction.commit();
          if(user!=null) {
          System.out.println("deletd Sucessuflly..!");
          }else{
          	System.out.println("NOt deleted");
          }
          
      }catch(Exception e) {
     	 transaction.rollback();
     	 e.printStackTrace();
     	 
      }
    }
}

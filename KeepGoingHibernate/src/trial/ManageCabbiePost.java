package trial;
import java.sql.Time;
import java.util.List; 
import java.util.Date;
import java.util.Iterator; 
 



import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.friends.keepgoing.hibernate.javabean.CabbiePost;

public class ManageCabbiePost {
   private static SessionFactory factory; 
   public static void main(String[] args) {
      try{
         factory = new Configuration().configure().buildSessionFactory();
      }catch (Throwable ex) { 
         System.err.println("Failed to create sessionFactory object." + ex);
         throw new ExceptionInInitializerError(ex); 
      }
      ManageCabbiePost manage = new ManageCabbiePost();
      int post = manage.addCabbiePost("sivaguru", "pondicherry", "chennai", new Date("9/25/2013"), new Time(20,18,9), new Date("9/25/2013"), new Time(21,58,11), new Date("9/25/2013"), 4, "Ford Figo", "5054", "py01524tr", 100, "active", "single", "sample");
      /* Add few emplo
       * 
       * yee records in database */
    //  Integer empID1 = ME.addEmployee("Zara", "Ali", 1000);
     // Integer empID2 = ME.addEmployee("Daisy", "Das", 5000);
     // Integer empID3 = ME.addEmployee("John", "Paul", 10000);

      /* List down all the employees */
     // ME.listEmployees();

      /* Update employee's records */
     // ME.updateEmployee(empID1, 5000);

      /* Delete an employee from the database */
     // ME.deleteEmployee(empID2);

      /* List down new list of the employees */
     // ME.listEmployees();
   }
   /* Method to CREATE an cabbie post in the database */
   public int addCabbiePost(String user_name, String departure, String destination,
			Date departure_date, Time departure_time, Date arrival_date,
			Time arrival_time, Date posted_date_time, int seat_capacity,
			String vehicle_name, String vehicle_no, String driver_license,
			int cost, String post_status, String occurance_type,
			String description){
      Session session = factory.openSession();
      Transaction tx = null;
      int post_no=0;
      try{
         tx = session.beginTransaction();
         CabbiePost cabbie_post = new CabbiePost(user_name, departure, destination, departure_date, departure_time, arrival_date, arrival_time, posted_date_time, seat_capacity, vehicle_name, vehicle_no, driver_license, cost, post_status, occurance_type, description);
         post_no = (Integer) session.save(cabbie_post); 
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         session.close(); 
      }
      return post_no;
   }
   /* Method to  READ all the cabbie post */
   public void listCabbiePost( ){
      Session session = factory.openSession();
      Transaction tx = null;
      try{
         tx = session.beginTransaction();
         List cabbiePosts = session.createQuery("FROM Cabbie_Post").list(); 
         for (Iterator iterator = 
        		 cabbiePosts.iterator(); iterator.hasNext();){
            CabbiePost cabbiePost = (CabbiePost) iterator.next(); 
            System.out.print("First Name: " + cabbiePost.getUser_name()); 
            //System.out.print("  Last Name: " + employee.getLastName()); 
            //System.out.println("  Salary: " + employee.getSalary()); 
         }
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         session.close(); 
      }
   }
   /* Method to UPDATE username for an cabbie post */
   public void updateCabbiePost(int post_no, String user_name ){
      Session session = factory.openSession();
      Transaction tx = null;
      try{
         tx = session.beginTransaction();
         CabbiePost cabbiePost = 
                    (CabbiePost)session.get(CabbiePost.class, post_no); 
         cabbiePost.setUser_name( user_name );
		 session.update(cabbiePost); 
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         session.close(); 
      }
   }
   /* Method to DELETE an cabbie post from the records */
   public void deleteCabbiePost(int post_no){
      Session session = factory.openSession();
      Transaction tx = null;
      try{
         tx = session.beginTransaction();
         CabbiePost cabbiePost = 
                   (CabbiePost)session.get(CabbiePost.class, post_no); 
         session.delete(cabbiePost); 
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         session.close(); 
      }
   }
}
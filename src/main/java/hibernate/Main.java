package hibernate;


import org.hibernate.*;
import org.hibernate.cfg.Configuration;
public class Main {
	  public String execute()
	    {
	    	Student st = new Student();
	   
	    	Configuration config= new Configuration().configure().addAnnotatedClass(Student.class);
		      
		      SessionFactory ss=config.buildSessionFactory();
		      Session s= ss.openSession();
		     Transaction tx = s.getTransaction();
		   
st.getId();
st.getName();
st.getPass();
	    		
	    		tx.begin();
	    		s.save(st);
	    		tx.commit();
	    		
	    		return "success";
	    		
	    		}}
	    		
	    		
	    		
	    		 
	    		
	    	
	     
	     
	     
	     


package hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

@Entity
public class Student {
String name;
String pass;
@Id
String id;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public void execute()
{	

Configuration config= new Configuration().configure().addAnnotatedClass(employee.class);
  
  SessionFactory ss=config.buildSessionFactory();
  Session s= ss.openSession();
 Transaction tx = s.getTransaction();


	
	tx.begin();
	s.save();
	tx.commit();
	
	return "success";
	
}

}

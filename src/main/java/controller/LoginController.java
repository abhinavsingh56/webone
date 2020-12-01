package controller;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.ResultSet;
import java.sql.Statement;

public class LoginController {


public static boolean validate(String name,String password){
	
	boolean status =false;
	String pass = "abhi";
	
     String url = "jdbc:mysql://localhost:3306/struts";
	String user="root";

		try {

			Statement stmt=null;
			Connection con=null;
			ResultSet rs=null;
			
	Class.forName("com.mysql.jdbc.Driver");
	con=DriverManager.getConnection(url,user,pass);
	
	String sql= "select * from login where name='"+name+"'and password='"+password+"'";
	  stmt=con.prepareStatement(sql);
    rs=stmt.executeQuery(sql);
 
  
   status=rs.next();
		}
		catch(Exception e)
		{
		System.out.print(e);	
		
		}
		return status;
		}
}
  

  
  
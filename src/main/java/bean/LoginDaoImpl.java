package bean;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import Dao.LoginDao;
import controller.LoginController;

public class LoginDaoImpl implements LoginDao {
String name;
String password;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

public String execute(){  
    if(LoginController.validate(name, password)){
    	HttpServletRequest request=ServletActionContext.getRequest();  
    	HttpSession session=request.getSession();  
    	session.setAttribute("name", name);
    			
        return "success";  
    }  
    else{  
        return "failure";  
    }  
}  
}

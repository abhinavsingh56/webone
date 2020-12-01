package bean;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

public class Logout {
public String execute()
{
 	HttpServletRequest request=ServletActionContext.getRequest();  
	HttpSession session=request.getSession();  
	session.removeAttribute("name");
	session.invalidate();
return "success";
}
}




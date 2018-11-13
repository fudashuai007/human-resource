package coms;

import h_s.dao.impl.UserDAOImpl;

public class LoginAction {  
	private String Employee_name;  
    private String password; 
	public String execute(){  
		if(new UserDAOImpl().login(this.Employee_name,this.password)){
			return "success";
		}else{
			return "fail";
		}

	}
}


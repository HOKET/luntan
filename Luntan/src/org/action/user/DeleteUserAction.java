package org.action.user;

import com.opensymphony.xwork2.ActionSupport;
import org.user.daoimp.AllMethod;
import org.model.Tiezi;
import org.model.User;

/**
 * É¾³ýÑ§Éú
 * @author Administrator
 *
 */
public class DeleteUserAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String execute() throws Exception {
		try{
			AllMethod dt = new AllMethod();
			User u = (User)dt.getOneUser(username); 
			if(dt.deleteUser(u)) {
				return SUCCESS;
			}
			else {
				return ERROR;
			}

		}catch(Exception e){
			e.printStackTrace();
			return ERROR;
		}
	}
}

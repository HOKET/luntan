package org.action.user;

import com.opensymphony.xwork2.ActionSupport;
import org.user.daoimp.AllMethod;
import org.model.User;

/**
 * 更新学生
 * @author Administrator
 *
 */
public class AddAdminAction extends ActionSupport{
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

	@Override
	public String execute() throws Exception {
		AllMethod dt = new AllMethod();
		System.out.println(username);
		User u=(User)dt.getOneUser(username);
		System.out.println(u.getUsername());
		if(dt.addAdmin(u))
		{
			return SUCCESS;
		}else
		{
			return ERROR;
		}
	}
}

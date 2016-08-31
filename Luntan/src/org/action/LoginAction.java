package org.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.model.User;
import org.user.daoimp.DlDaoImp;

/**
 * µÇÂ½
 * @author Administrator
 *
 */
public class LoginAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private User user;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user=user;
	} 
	
	public String execute() throws Exception {
		DlDaoImp dlDao=new DlDaoImp();
		User t=dlDao.validate(user.getUsername(), user.getPassword());
		if(t!=null) {
			Map<String, Object> session=(Map<String, Object>)ActionContext.
					getContext().getSession();
			session.put("user", t); 
			System.out.println("1");  
			return SUCCESS;
		}
		else {
			System.out.println("2"); 
			return ERROR;
		} 	
	}
	
}

package org.action.user;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.user.daoimp.AllMethod;
import org.user.daoimp.DlDaoImp;
import org.model.User;

/**
 * 添加学生
 * @author Administrator
 *
 */
public class AddUserAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private User user;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	public String execute() throws Exception{
		AllMethod dt = new AllMethod();
		if(dt.addUser(user))	
			return SUCCESS;
		else
			return ERROR;
	}
	public void validate(){

		DlDaoImp dlDao=new DlDaoImp();
		User t=dlDao.find(user.getUsername());
		if(t!= null){
			addFieldError("cuowu","该用户已存在");
		}
	}

}


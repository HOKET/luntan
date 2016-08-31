package org.action.user;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.user.daoimp.AllMethod;
import org.model.User;

public class UserAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unchecked")
	public String execute() throws Exception {
		AllMethod dt = new AllMethod();
		List<User> userList = (List<User>) dt.getAllUser();

		Map<String, Object> request =(Map<String, Object>)ActionContext.
				getContext().get("request");
		request.put("list",userList);
		return SUCCESS;
	}
}


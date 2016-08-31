package org.action.tiezi;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.user.daoimp.AllMethod;
import org.model.*;

/**
 * 获取学生
 * @author Administrator
 *
 */
public class TieAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unchecked")
	public String execute() throws Exception {
		AllMethod dt = new AllMethod();
		List<Tiezi> list = (List<Tiezi>) dt.getAll();

		Map<String, Object> request =(Map<String, Object>)ActionContext.
				getContext().get("request");
		Map<String, Object> session =(Map<String, Object>)ActionContext.
				getContext().get("session");
		request.put("list",list);
		if(session.get("user")!=null){
			Integer power=((User)session.get("user")).getPower();
			if(power==1)
				return "superadmin";
			else if(power==2)
				return "admin";
			else if(power==3)
				return "putong";
		}
		else 
			return "youke";
		return null;
	}
}


package org.action.tiezi;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.user.daoimp.AllMethod;
import org.model.*;

public class GetMyTieAction extends ActionSupport{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;


    @SuppressWarnings("unchecked")
	public String execute() throws Exception {
		AllMethod dt = new AllMethod();
		
		Map<String, Object> session =(Map<String, Object>)ActionContext.
				getContext().get("session");
		String username=((User)session.get("user")).getUsername();
		
		List<Tiezi> list = (List<Tiezi>) dt.getMyTiezi(username);
		Map<String, Object> request =(Map<String, Object>)ActionContext.
				getContext().get("request");		
			request.put("list",list);		
		return SUCCESS;
	}
}

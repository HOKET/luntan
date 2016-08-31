package org.action.tiezi;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.user.daoimp.AllMethod;
import org.model.*;

public class AddTieAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	
	private Tiezi tiezi;

	public Tiezi getTiezi() {
		return tiezi;
	}

	public void setTiezi(Tiezi tiezi) {
		this.tiezi = tiezi;
	}

	public String execute() throws Exception{
		AllMethod dt=new AllMethod();
		Map<String, Object> session=(Map<String, Object>)ActionContext.
				getContext().getSession();
		String username=((User)session.get("user")).getUsername();
		tiezi.setUsername(username);
		if (dt.addTiezi(tiezi)) 
		{
			return SUCCESS;
		}
		else {
			return ERROR;
		}
	}

}


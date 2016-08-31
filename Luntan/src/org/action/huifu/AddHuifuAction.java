package org.action.huifu;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.user.daoimp.AllMethod;
import org.model.*;

public class AddHuifuAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	
	private Huifu huifu;

	public Huifu getHuifu() {
		return huifu;
	}

	public void setHuifu(Huifu huifu) {
		this.huifu = huifu;
	}

	public String execute() throws Exception{
		AllMethod dt=new AllMethod();
		Map<String, Object> session=(Map<String, Object>)ActionContext.
				getContext().getSession();
		String username=((User)session.get("user")).getUsername();
		huifu.setUsername(username);
		Integer Tieid=((Huifu)session.get("huifu")).getTieid();
		huifu.setTieid(Tieid);
		if (dt.addHuifu(huifu)) 
		{
			return SUCCESS;
		}
		else {
			return ERROR;
		}
	}

}


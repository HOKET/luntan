package org.action.huifu;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.user.daoimp.AllMethod;
import org.user.daoimp.DlDaoImp;
import org.model.*;

public class HuifuAction extends ActionSupport{
private static final long serialVersionUID = 1L;
	
	private Huifu huifu;
	
	public Huifu getHuifu() {
		return huifu;
	}


	public void setHuifu(Huifu huifu) {
		this.huifu = huifu;
	}


	public String execute() throws Exception {
		DlDaoImp dlDao=new DlDaoImp();
		Huifu t=dlDao.findHuifu(huifu.getTieid());
		AllMethod dt = new AllMethod();
		if(t!=null) {
			Integer u=t.getTieid();
			List<Huifu> list = (List<Huifu>) dt.getHuifu(u);
			Map<String, Object> request =(Map<String, Object>)ActionContext.
					getContext().get("request");		
				request.put("list",list);		
			return SUCCESS;
		}
		else { 
			return ERROR;
		} 	
	}
	
}


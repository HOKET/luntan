package org.action.tiezi;

import java.util.Map;
import java.util.List;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.model.*;
import org.user.daoimp.DlDaoImp;
import org.user.daoimp.AllMethod;

/**
 * µÇÂ½
 * @author Administrator
 *
 */
public class FindTieAction extends ActionSupport{
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
		User t=dlDao.find(user.getUsername());
		AllMethod dt = new AllMethod();
		if(t!=null) {
			String u=t.getUsername().toString();
			List<Tiezi> list = (List<Tiezi>) dt.getMyTiezi(u);
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

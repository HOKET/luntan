package org.action.tiezi;

import com.opensymphony.xwork2.ActionSupport;
import org.user.daoimp.AllMethod;
import org.model.Tiezi;

/**
 * É¾³ýÑ§Éú
 * @author Administrator
 *
 */
public class DeleteTieAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private Integer id;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String execute() throws Exception {
		try{
			AllMethod dt = new AllMethod();
			Tiezi t = (Tiezi) dt.getOneTieziById(id); 
			if(dt.delete(t)) {
				return SUCCESS;
			}
			else {
				return ERROR;
			}

		}catch(Exception e){
			e.printStackTrace();
			return ERROR;
		}
	}

}

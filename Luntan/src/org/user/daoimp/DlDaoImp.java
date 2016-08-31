package org.user.daoimp;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.model.*;
import org.util.HibernateSessionFactory;

public class DlDaoImp{
	public User validate(String username,String password){
		try{
			Session session=HibernateSessionFactory.getSession();
			Query query=session.createQuery("from User where username=? and password=?");
			query.setParameter(0,username);
			query.setParameter(1,password);
			query.setMaxResults(1);
			User user=(User)query.uniqueResult();
			if(user!=null){
				return user;
			}
			else{
				return null;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}
	public User find(String username){
		try{
			Session session=HibernateSessionFactory.getSession();
			Query query=session.createQuery("from User where username='"+username+"'");
			User user=(User)query.list().get(0);
			if(user!=null){
				return user;
			}
			else{
				return null;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}
	
	public Huifu findHuifu(Integer Tieid){
		try{
			Session session=HibernateSessionFactory.getSession();
			Query query=session.createQuery("from Huifu where Tieid='"+Tieid+"'");
			Huifu huifu=(Huifu)query.list().get(1);
			if(huifu!=null){
				return huifu;
			}
			else{
				return null;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}
}

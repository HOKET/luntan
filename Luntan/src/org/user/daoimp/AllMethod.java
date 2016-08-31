package org.user.daoimp;

import java.util.List;
import java.sql.*;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.model.*;
import org.util.HibernateSessionFactory;
import com.opensymphony.xwork2.interceptor.annotations.Before;


public class AllMethod{
	private  SessionFactory s= new AnnotationConfiguration().configure().buildSessionFactory();  
	
	//获取所有帖子的信息 
	public List<?> getAll() {
		try{
			Session session = HibernateSessionFactory.getSession();
			Transaction ts=session.beginTransaction();
			List<?> list = session.createQuery("from Tiezi").list();
			ts.commit();
			return list;
	    }catch(Exception e){
	    	e.printStackTrace();
	    	  return null;
	    }
	}



	//获取所有用户的信息
	public List<?> getAllUser() {
		try{
			Session session = HibernateSessionFactory.getSession();
			Transaction ts=session.beginTransaction();
			List<?> list = session.createQuery("from User").list();
			ts.commit();
			return list;
	    }catch(Exception e){
	    	e.printStackTrace();
	    	  return null;
	    }
	}

	//获取某个用户所有帖子的信息
	public List<?> getMyTiezi(String username) {
		try{
			Session session =s.openSession(); 
			Transaction ts=session.beginTransaction();
			ts.begin();
			Query query=session.createQuery("from Tiezi where username=?");
			query.setParameter(0,username);
			List<Tiezi> userList = query.list();
			ts.commit();
			session.close();
			return userList;    		
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
	    }
	}
	//获取某个帖子的回复
	public List<?> getHuifu(Integer Tieid) {
		try{
			Session session =s.openSession(); 
			Transaction ts=session.beginTransaction();
			ts.begin();
			Query query=session.createQuery("from Tieid where Tieid");
			query.setParameter(0,Tieid);
			List<Huifu> list = query.list();
			ts.commit();
			session.close();
			return list;    		
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
	    }
	}
	

	//获取一个帖子
	public Tiezi getOneTieziById(Integer id) {
		Tiezi t =null;
		try{
			Session session =s.openSession(); 
			Transaction ts=session.beginTransaction();
			ts.begin();
			Query query=session.createQuery("from Tiezi where id=?");
			query.setParameter(0,id);
			List<Tiezi> tieList = query.list();
			if(tieList.size()!=0){
				System.out.println("id::::::::::"+id);
				t =  tieList.get(0);
			}  
			ts.commit();
			session.close();
			return t;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
	    }
	}

	//添加管理员
	public boolean addAdmin(User user) {
		Integer power=2;
		try{
			user.setPower(power);
			Session session =s.openSession();  
			Transaction ts=session.beginTransaction();
				  	
			session.update(user); 
			ts.commit(); 
			session.close();
			return true;
		}
		catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	//获取一个用户
	public User getOneUser(String username) {
		User u =null;
		try{
			Session session =s.openSession(); 
			Query query=session.createQuery("from User where username=?");
			query.setParameter(0,username);
			List<User> userList = query.list();
			if(userList.size()!=0){
				u = userList.get(0);
			}  
			return u;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
	    }
	}

	//增加帖子
	public boolean addTiezi(Tiezi tiezi) {
		try{
			Session session =s.openSession(); 
			Transaction ts=session.beginTransaction();
			ts.begin();
			tiezi.setDate(new Timestamp(System.currentTimeMillis()));
			session.save(tiezi);
			ts.commit();
			session.close();
            return true;
			 
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	//增加用户
	public boolean addUser(User user) {
		Integer power=3;
		try{
			Session session =s.openSession(); 
			Transaction ts=session.beginTransaction();
			ts.begin();
			user.setPower(power);	  	
			session.save(user);
			ts.commit();
			session.close();
			return true;
		}
		catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	//增加回复
	public boolean addHuifu(Huifu huifu) {
		try{
			Session session =s.openSession(); 
			Transaction ts=session.beginTransaction();
			ts.begin();
			huifu.setDate(new Timestamp(System.currentTimeMillis()));
			session.save(huifu);
			ts.commit();
			session.close();
            return true;
			 
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	//删除帖子
	public boolean delete(Tiezi tiezi) {
		try{
			Session session =s.openSession(); 
			Transaction ts=session.beginTransaction();
			ts.begin();
			session.delete(tiezi);
			ts.commit();
			session.close();
			return true;
		}
		catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	//删除用户
	public boolean deleteUser(User user) {
		try{
			Session session =s.openSession(); 
			Transaction ts=session.beginTransaction();
			ts.begin();
			session.delete(user);
			ts.commit();
			session.close();
			return true;
		}
		catch(Exception e){
			e.printStackTrace();
			return false;
		}
	} 
}

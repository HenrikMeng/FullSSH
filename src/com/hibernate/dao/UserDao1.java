package com.hibernate.dao;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.hibernate.idao.IUserDao;
import com.hibernate.pojo.User;

/**
 * 直接继承HibernateDaoSupport类的方式
 * 
 * @author Administrator
 * 
 */
public class UserDao1 extends HibernateDaoSupport implements IUserDao {

	public boolean deleteUser(User u) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteUser(int uid) {
		// TODO Auto-generated method stub
		return false;
	}

	public User getUser(User u) {
		StringBuffer sbSql = new StringBuffer("from User u where u.uname ='");
		sbSql.append(u.getUname());
		sbSql.append("' and u.upwd='");
		sbSql.append(u.getUpwd());
		sbSql.append("'");
		List list = this.getHibernateTemplate().find(sbSql.toString());
		return list!=null?(User)list.get(0):null;
	}

	public User getUser(int uid) {
		return null;
	}

	public List getUsers() {
		StringBuffer sbSql = new StringBuffer("from User u");
		return this.getHibernateTemplate().find(sbSql.toString());
	}

	public List getUsers(User u) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean saveUser(User u) {
		this.getHibernateTemplate().save(u);
		return true;
	}

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		UserDao1 udao1 = (UserDao1) context.getBean("userdao1");
		List list = udao1.getUsers();
		System.out.println("----"+list.size());
		for (Object object : list) {
			System.out.println(object);
		}
	}

	public boolean validate(User u) {
		// TODO Auto-generated method stub
		return false;
	}
}

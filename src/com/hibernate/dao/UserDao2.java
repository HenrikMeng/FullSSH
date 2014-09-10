package com.hibernate.dao;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.hibernate.idao.IUserDao;
import com.hibernate.pojo.User;

/**
 * 构造方法的注入HibernateTemplate类型的方式
 * @author Administrator
 *
 */
public class UserDao2 implements IUserDao {

	private HibernateTemplate htmp;

	public UserDao2(HibernateTemplate htmp) {
		super();
		this.htmp = htmp;
	}

	public void test() {
		System.out.println("this is a test page!");
	}

	public boolean deleteUser(User u) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteUser(int uid) {
		// TODO Auto-generated method stub
		return false;
	}

	public User getUser(User u) {
		// TODO Auto-generated method stub
		return null;
	}

	public User getUser(int uid) {
		// TODO Auto-generated method stub
		return null;
	}

	public List getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	public List getUsers(User u) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean saveUser(User u) {
		// TODO Auto-generated method stub
		return false;
	}
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		UserDao2 udao2 = (UserDao2) context.getBean("userdao2");
		udao2.test();
	}

	public boolean validate(User u) {
		// TODO Auto-generated method stub
		return false;
	}
}

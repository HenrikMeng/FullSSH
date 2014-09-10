package com.hibernate.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.hibernate.idao.IUserDao;
import com.hibernate.pojo.User;

/**
 * Set注入HibernateTemplate类型的方式
 * @author Administrator
 *
 */
public class UserDao3 implements IUserDao {
	private HibernateTemplate htmp;

	public HibernateTemplate getHtmp() {
		return htmp;
	}

	public void setHtmp(HibernateTemplate htmp) {
		this.htmp = htmp;
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

	public boolean validate(User u) {
		// TODO Auto-generated method stub
		return false;
	}
}

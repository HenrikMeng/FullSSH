package com.hibernate.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTransactionManager;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.hibernate.idao.IUserDao;
import com.hibernate.pojo.User;

/**
 * ���ʽ��
 * 
 * @author Administrator
 * 
 */
public class UserDao4 extends HibernateDaoSupport implements IUserDao {
	/**
	 * ���������
	 */
	private HibernateTransactionManager transactionManager = null;

	public HibernateTransactionManager getTransactionManager() {
		return transactionManager;
	}

	public void setTransactionManager(
			HibernateTransactionManager transactionManager) {
		this.transactionManager = transactionManager;
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
		// ��������
		DefaultTransactionDefinition dt = new DefaultTransactionDefinition();
		// ����״̬��
		TransactionStatus status = transactionManager.getTransaction(dt);
		try {
			this.getHibernateTemplate().save(u);
			transactionManager.commit(status);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			transactionManager.rollback(status);
			return false;
		}
	}

	public boolean validate(User u) {
		// TODO Auto-generated method stub
		return false;
	}

}

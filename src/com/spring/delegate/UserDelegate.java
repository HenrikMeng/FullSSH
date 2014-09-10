package com.spring.delegate;

import java.util.List;
import com.hibernate.idao.*;
import com.hibernate.pojo.User;
import com.spring.idelegate.*;

public class UserDelegate implements IUserDelegate {

	private IUserDao iuserdao;

	public IUserDao getIuserdao() {
		return iuserdao;
	}

	public void setIuserdao(IUserDao iuserdao) {
		this.iuserdao = iuserdao;
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
		return iuserdao.getUser(u);
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

	/**
	 * ÑéÖ¤µÇÂ½
	 */
	public boolean validate(User u) {
		return iuserdao.validate(u);
	}
}

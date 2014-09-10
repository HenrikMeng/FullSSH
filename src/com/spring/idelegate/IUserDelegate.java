package com.spring.idelegate;

import java.util.List;
import com.hibernate.pojo.User;

public interface IUserDelegate {
	public boolean saveUser(User u);

	public boolean deleteUser(User u);

	public boolean deleteUser(int uid);

	public List getUsers();

	public List getUsers(User u);

	public User getUser(User u);

	public User getUser(int uid);

	public boolean validate(final User u);
}

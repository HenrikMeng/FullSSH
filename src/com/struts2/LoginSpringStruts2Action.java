package com.struts2;

import com.opensymphony.xwork2.ActionSupport;
import com.spring.delegate.UserDelegate;
import com.hibernate.pojo.*;

public class LoginSpringStruts2Action extends ActionSupport {
	private String tip;

	private User user;

	private UserDelegate ud;

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserDelegate getUd() {
		return ud;
	}

	public void setUd(UserDelegate ud) {
		this.ud = ud;
	}

	@Override
	public String execute() throws Exception {
		System.out.println(user.getUname() + "\t" + user.getUpwd());
		User u = ud.getUser(new User(user.getUpwd(), user.getUname()));
		if (u != null) {
			System.out.println("success");
			return ActionSupport.SUCCESS;
		} else {
			System.out.println("error");
			return ActionSupport.ERROR;
		}

	}
}

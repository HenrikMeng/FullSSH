package com.struts2;

import org.apache.struts2.ServletActionContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.spring.delegate.UserDelegate;
import com.hibernate.pojo.*;

public class LoginStruts2Action extends ActionSupport {
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

	@Override
	public String execute() throws Exception {
		System.out.println("这是Spring和struts2的松耦合测试Action \n"+user.getUname() + "\t" + user.getUpwd());
		try {
			WebApplicationContext wac = WebApplicationContextUtils
					.getRequiredWebApplicationContext(ServletActionContext
							.getServletContext());
			ud = (UserDelegate) wac.getBean("userDelegate");
			User u = ud.getUser(new User(user.getUpwd(), user.getUname()));
			if (u != null) {
				return ActionSupport.SUCCESS;
			} else {
				return ActionSupport.ERROR;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			return ActionSupport.ERROR;
		}

	}
}

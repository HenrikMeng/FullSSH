package com.struts.action;

import java.lang.reflect.Array;
import java.util.Arrays;
import javax.servlet.ServletContext;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionServlet;
import org.apache.struts.actions.DispatchAction;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class BaseAction extends Action {
	private WebApplicationContext wac;

	public void setServlet(ActionServlet actionServlet) {
		super.setServlet(actionServlet);
		ServletContext servletContext = actionServlet.getServletContext();
		wac = WebApplicationContextUtils
				.getRequiredWebApplicationContext(servletContext);
	}

	public WebApplicationContext getApplicationContext() {
		return wac;
	}
}

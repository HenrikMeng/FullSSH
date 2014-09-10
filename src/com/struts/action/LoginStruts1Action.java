/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import com.struts.form.LoginStruts1Form;
import com.spring.delegate.*;
import com.hibernate.pojo.*;

/**
 * Struts1�Լ������Լ���Action��ֻ������Spring��IOC��AOP��
 * ��ApplicationContext�ķ�װ��ͷ���Getbean����
 * ������ҵ���������Delegate
 * @author Administrator
 *
 */
public class LoginStruts1Action extends BaseAction {

	private UserDelegate ud;

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		try {
			LoginStruts1Form loginForm = (LoginStruts1Form) form;
			User u = new User(loginForm.getUpwd(), loginForm.getUname());
			ud = (UserDelegate) this.getApplicationContext().getBean(
					"userDelegate"); // �˴���bean name �����������name : userDelegateProxy
			boolean falt = ud.validate(u);
			if ( falt == true) {
				request.getSession().setAttribute("loginUser", u);
				return mapping.findForward("success");
			} else {
				loginForm.setUname("");
				loginForm.setUpwd("");
				return mapping.findForward("faile");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			return mapping.findForward("error");
		}
	}
}
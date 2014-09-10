package com.hibernate.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hibernate.idao.IUserDao;
import com.hibernate.pojo.User;

public class TestDao {

	public static void test1() {
		User u = new User();
		u.setUname("lcai");
		u.setUpwd("111111");
		u.setUinfor("ÄãºÃ");
		try {
			ApplicationContext context = new ClassPathXmlApplicationContext(
					"applicationContext.xml");
			IUserDao dao = (IUserDao) context.getBean("userDao");
			dao.saveUser(u);
			System.out.println("------------------ok---------------");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public static void test2(){
		User u = new User();
		u.setUname("lcai");
		u.setUpwd("111111");
		try {
			ApplicationContext context = new ClassPathXmlApplicationContext(
					"applicationContext.xml");
			IUserDao dao = (IUserDao) context.getBean("userDao");
//			User user = dao.getUser(u);
			boolean falt = dao.validate(u);
//			System.out.println(user==null);
			System.out.println(falt);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
//		TestDao.test1();
		TestDao.test2();
	}
}

package com.hibernate.dao;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.hibernate.idao.IUserDao;
import com.hibernate.pojo.User;

/**
 * 申明式事务
 * 
 * @author Administrator
 * 
 */
public class UserDao extends HibernateDaoSupport implements IUserDao {

	public boolean deleteUser(User u) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteUser(int uid) {
		// TODO Auto-generated method stub
		return false;
	}

	public User getUser(User u) {
		StringBuffer sbSql = new StringBuffer("from User u where u.uname ='");
		sbSql.append(u.getUname());
		sbSql.append("' and u.upwd='");
		sbSql.append(u.getUpwd());
		sbSql.append("'");
		List list = this.getHibernateTemplate().find(sbSql.toString());
		return list != null && list.size() > 0 ? (User) list.get(0) : null;
	}

	public User getUser(int uid) {
		// TODO Auto-generated method stub
		return null;
	}

	public List getUsers() {
		return this.getHibernateTemplate().executeFind(new HibernateCallback() {
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				return session
						.createQuery("from User as u order by u.uid desc")
						.list();
			}
		});
	}

	public List getUsers(User u) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean saveUser(User u) {
		this.getHibernateTemplate().save(u);
		return true;
	}

	public boolean validate(final User u) {
		List ls = (List) this.getHibernateTemplate().execute(
				new HibernateCallback() {
					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {
						Query qy = session
								.createQuery("from User u where u.uname=:uname and u.upwd=:upwd");
						qy.setString("uname", u.getUname());
						qy.setString("upwd", u.getUpwd());
						List li = qy.list();
						return li;
					}
				});
		return (ls.size() > 0);
	}
}

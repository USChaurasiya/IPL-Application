package com.uma.IplApp.DAOImpl;


import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.uma.IplApp.DAO.UserDAO;
import com.uma.IplApp.Model.User;

@Repository
@Transactional
public class UserDAOImpl implements UserDAO {
	@Autowired
	SessionFactory sessionFactory;

	public void addUser(User user) {
		Session ses = sessionFactory.getCurrentSession();

		try {
			ses.save(user);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public User authUser(String email, String password) {

		Session ses = sessionFactory.getCurrentSession();
		try {
			Criteria cr = ses.createCriteria(User.class);

			User user = (User) cr.add(Restrictions.conjunction().add(Restrictions.eq("email", email))
					.add(Restrictions.eq("password", password))).uniqueResult();
			return user;
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return null;
	}

}
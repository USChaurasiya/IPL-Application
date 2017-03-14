package com.uma.IplApp.DAOImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.uma.IplApp.DAO.DreamTeamDAO;
import com.uma.IplApp.Model.DreamTeam;
import com.uma.IplApp.Model.Player;
@Repository
@Transactional
public class DreamTeamDAOImpl implements DreamTeamDAO{

	@Autowired
	SessionFactory sessionFactory;

	public List<Player> getPlayerByName(String [] myPlayer) {
		Session session = sessionFactory.getCurrentSession();
		
		
		 Query q = session.createQuery("SELECT p FROM Player p WHERE p.name IN (:names)");
		    q.setParameterList("names", myPlayer);
		  @SuppressWarnings("unchecked")
		List<Player> dList= q.list();
		return dList;
	}

	public void addDreamTeam(DreamTeam dreamTeam) {
		Session sess = sessionFactory.getCurrentSession();
		try {
			sess.save(dreamTeam);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("inside dream Team DAo");
		
	}
	
	public boolean isUserIdPresent(int userId) {
		Session session=sessionFactory.getCurrentSession();
		
		DreamTeam user = (DreamTeam) session.load(DreamTeam.class, userId);
		
		if(user!=null)
		{
			return true;
		}else
		
			return false;
	}
		

	
}
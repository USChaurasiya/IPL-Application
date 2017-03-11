package com.uma.IplApp.DAOImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.uma.IplApp.DAO.PlayerDAO;
import com.uma.IplApp.Model.Player;

@Repository
@Transactional
public class PlayerDAOImpl implements PlayerDAO {
	@Autowired
	SessionFactory sessionFactory;

	public void addPlayer(Player player) {
		Session sess = sessionFactory.getCurrentSession();
		try {
			sess.save(player);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<Player> displayAllPlayer(int teamId) {

		Session sess = sessionFactory.getCurrentSession();
		Query qry = sess.createQuery("from Player where teamId=:id");
		qry.setParameter("id", teamId);
		List<Player> playersInfo = qry.list();
		return playersInfo;
	}

	public List<Player> displayPlayerInfo(String playerName) {
		Session sess = sessionFactory.getCurrentSession();
		Query qry = sess.createQuery("from Player where name=:playerName");
		qry.setParameter("playerName", playerName);
		List<Player> playerDetails = qry.list();
		return playerDetails;
	}


	public List<Player> displayAllPlayer() {
		Session sess = sessionFactory.getCurrentSession();
		Query qry = sess.createQuery("from Player");
		
		List<Player> playersInfo = qry.list();
		System.out.println(playersInfo.size()+","+playersInfo.toString());
		return playersInfo;
	}

}
package com.uma.IplApp.DAOImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.uma.IplApp.DAO.TeamDAO;
import com.uma.IplApp.Model.Team;

@Repository
@Transactional
public class TeamDAOImpl implements TeamDAO {
	@Autowired
	SessionFactory sessionFactory;

	public void addTeam(Team team) {
		Session session = sessionFactory.getCurrentSession();
		session.save(team);
	}

	public List<Team> displayAllTeam() {
		Session session = sessionFactory.getCurrentSession();
		Query qry = session.createQuery("from Team");
		List<Team> teamsinfo = qry.list();
		return teamsinfo;
	}

	public List<Team> displayTeamInfo(String teamName) {
		Session session = sessionFactory.getCurrentSession();
		Query qry = session.createQuery("from Team where name=:teamName");
		qry.setParameter("teamName", teamName);
		List<Team> teamDetails = qry.list();
		return teamDetails;
	}

}
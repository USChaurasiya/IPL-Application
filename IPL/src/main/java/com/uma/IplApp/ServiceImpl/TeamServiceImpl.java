package com.uma.IplApp.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.uma.IplApp.DAO.TeamDAO;
import com.uma.IplApp.Model.Team;
import com.uma.IplApp.Service.TeamService;

public class TeamServiceImpl implements TeamService {
	@Autowired
	private TeamDAO teamDAO;

	public void addTeam(Team team) {
		teamDAO.addTeam(team);

	}

	public List<Team> displayAllTeam() {
		List<Team> teamInfo = teamDAO.displayAllTeam();

		return teamInfo;

	}

	public List<Team> displayTeamInfo(String teamName) {
		List<Team> teamDetails = teamDAO.displayTeamInfo(teamName);
		return teamDetails;
	}
	

}

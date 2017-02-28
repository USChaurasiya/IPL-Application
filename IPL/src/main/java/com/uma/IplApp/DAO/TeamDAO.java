package com.uma.IplApp.DAO;

import java.util.List;

import com.uma.IplApp.Model.Team;

public interface TeamDAO {
	void addTeam(Team team);

	List<Team> displayAllTeam();

	List<Team> displayTeamInfo(String teamName);
}

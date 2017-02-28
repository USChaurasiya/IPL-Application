package com.uma.IplApp.Service;

import java.util.List;

import com.uma.IplApp.Model.Team;

public interface TeamService {
	public void addTeam(Team team);

	public List<Team> displayAllTeam();

	public List<Team> displayTeamInfo(String teamName);
}

package com.uma.IplApp.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.uma.IplApp.DAO.DreamTeamDAO;
import com.uma.IplApp.Model.DreamTeam;
import com.uma.IplApp.Model.Player;
import com.uma.IplApp.Service.DreamTeamService;

public class DreamTeamServiceImpl implements DreamTeamService {

	@Autowired
	private DreamTeamDAO dreamTeamDAO;
	
	@Override
	public List<Player> getPlayerByName(String[] myPlayer) {
		
		return dreamTeamDAO.getPlayerByName(myPlayer);
	}

	@Override
	public void addDreamTeam(DreamTeam dreamTeam) {
		dreamTeamDAO.addDreamTeam(dreamTeam);
	}

	@Override
	public boolean isUserIdPresent(int userId) {
		
		return dreamTeamDAO.isUserIdPresent(userId);
	}

}

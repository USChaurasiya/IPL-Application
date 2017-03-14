package com.uma.IplApp.Service;

import java.util.List;

import com.uma.IplApp.Model.DreamTeam;
import com.uma.IplApp.Model.Player;

public interface DreamTeamService {

	public List<Player> getPlayerByName(String [] myPlayer);
	 
	public void addDreamTeam(DreamTeam dreamTeam);
	
	public boolean isUserIdPresent(int dreamId);
}

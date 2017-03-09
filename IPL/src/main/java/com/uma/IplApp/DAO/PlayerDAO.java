package com.uma.IplApp.DAO;

import java.util.List;

import com.uma.IplApp.Model.Player;

public interface PlayerDAO {
	void addPlayer(Player player);

	List<Player> displayAllPlayer(int teamId);

	List<Player> displayPlayerInfo(String playerName);
	
	List<Player> displayAllPlayer();
	
	

}

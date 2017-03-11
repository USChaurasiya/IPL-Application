package com.uma.IplApp.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.uma.IplApp.DAO.PlayerDAO;
import com.uma.IplApp.Model.Player;
import com.uma.IplApp.Service.PlayerService;

public class PlayerServiceImpl implements PlayerService {
	@Autowired
	private PlayerDAO playerDAO;

	public void addPlayer(Player player) {
		playerDAO.addPlayer(player);

	}

	public List<Player> displayAllPlayer(int teamId) {
		List<Player> playerList = playerDAO.displayAllPlayer(teamId);
		return playerList;
	}

	public List<Player> displayPlayerInfo(String playerName) {
		List<Player> playerInfo = playerDAO.displayPlayerInfo(playerName);
		return playerInfo;
	}
	
	public List<Player> displayAllPlayer() {
		List<Player> playerList = playerDAO.displayAllPlayer();
		return playerList;
	}

	@Override
	public int viewUpdate(int view, String playerName) {
		
		return playerDAO.viewUpdate(view, playerName);
	}
}

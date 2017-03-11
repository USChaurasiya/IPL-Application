package com.uma.IplApp.Service;

import java.util.List;

import com.uma.IplApp.Model.Player;

public interface PlayerService {
	public void addPlayer(Player player);

	public List<Player> displayAllPlayer(int teamID);

	public List<Player> displayPlayerInfo(String playerName);
	public List<Player> displayAllPlayer();

	public int viewUpdate(int view,String playerName);

}

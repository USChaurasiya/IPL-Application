package com.uma.IplApp.Controller;

import java.io.FileReader;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.tribes.util.Arrays;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uma.IplApp.Model.Player;
import com.uma.IplApp.Service.PlayerService;
@Controller
public class PlayerController {
	@Autowired
	PlayerService playerService;
	
	
	
	
	@RequestMapping(value = "/playerList", method = RequestMethod.GET)
	public ModelAndView displayAllTeam(@RequestParam("teamId")  int teamId, @RequestParam("teamName") String teamName,
			Model model ) {
		
		
		
		List<Player> playerInfo = playerService.displayAllPlayer(teamId);
		model.addAttribute("teamName", teamName);
		return new ModelAndView("playerList", "playerInfo", playerInfo);
	}

	@RequestMapping(value = "/playerDetails", method = RequestMethod.GET)
	public ModelAndView displayTeamDetails(@RequestParam("playerName") String playerName, Model model) {
		
		
		
		List<Player> playerDeatils=  playerService.displayPlayerInfo(playerName);
		
		
		int view= playerDeatils.get(0).getPlayerView();
		view++;
		
		int rowCount=playerService.viewUpdate(view, playerName);
		 System.out.println("Rows affected: " + rowCount);
		
		
		model.addAttribute("playerName", playerName);
		model.addAttribute("view", view);
		return new ModelAndView("playerDetails", "playerDetails", playerDeatils);
		
		

	}

	@RequestMapping(value = "/newAddPlayer", method = RequestMethod.GET)
	public String newAddPlayer() {

		Player player = new Player();
		JSONParser parser = new JSONParser();
		try {
			Object ob = parser.parse(new FileReader("/home/bridgeit/Desktop/IPL/newPlayerInfo.json"));
			JSONObject object = (JSONObject) ob;

			JSONArray data = (JSONArray) object.get("Playersinfo");

			for (int i = 0; i < data.size(); i++) {
				JSONObject itemObj = (JSONObject) data.get(i);

				Object nameObj = itemObj.get("player_name");
				String playerName = (String) nameObj;
				player.setName(playerName);

				Object imgObject = itemObj.get("player_img_url");
				String playerPic = (String) imgObject;
				player.setDisplayPicture(playerPic);

				Object roleObj = itemObj.get("player_role");
				String roleName = (String) roleObj;
				player.setRole(roleName);

				Object battingStyleObj = itemObj.get("player_batting_style");
				String battingStyleName = (String) battingStyleObj;
				player.setBattingStyle(battingStyleName);

				Object bowlingObj = itemObj.get("player_bowling_style");
				String bowlingName = (String) bowlingObj;
				player.setBowlingStyle(bowlingName);

				Object nationalityObj = itemObj.get("player_nationality");
				String nationalityName = (String) nationalityObj;
				player.setNationality(nationalityName);

				Object dobObj = itemObj.get("player_dob");
				String dobName = (String) dobObj;
				player.setDob(dobName);

				Object teamIdObj = itemObj.get("team_id");
				Integer teamIdName = Integer.valueOf((String) teamIdObj);
				player.setTeamId(teamIdName);
				
				player.setPlayerView(0);
				playerService.addPlayer(player);

			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return "signin";
	}
	
	
}

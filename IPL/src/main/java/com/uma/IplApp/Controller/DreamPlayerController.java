package com.uma.IplApp.Controller;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uma.IplApp.Model.DreamPlayer;
import com.uma.IplApp.Model.Player;
import com.uma.IplApp.Model.User;
import com.uma.IplApp.Service.DreamPlayerService;
import com.uma.IplApp.Service.PlayerService;
import com.uma.IplApp.Service.UserService;

@Controller

public class DreamPlayerController {
	@Autowired
	PlayerService playerService;

	@Autowired
	DreamPlayerService dreamPlayerService;

	@Autowired
	UserService userService;
	@RequestMapping(value = "/dreamPlayerList", method = RequestMethod.GET)
	public ModelAndView displayAllTeam() {

		List<Player> dreamPlayerInfo = playerService.displayAllPlayer();

		return new ModelAndView("dreamPlayerList", "dreamPlayerInfo", dreamPlayerInfo);
	}

	@RequestMapping("/dreamPlayer")
	public String selectedDreamPlayer(@RequestParam(value = "myPlayer") String[] myPlayer) {
		
		
		JSONObject dreamTeam = new JSONObject();
		JSONArray dreamList = new JSONArray();
		for (int i = 0; i < myPlayer.length; i++) {
			JSONObject dreamPlayers = new JSONObject();

			dreamPlayers.put("Player_Name", dreamPlayerService.dreamPlayerDetails(myPlayer[i]).getName());
			dreamPlayers.put("Player_Role", dreamPlayerService.dreamPlayerDetails(myPlayer[i]).getRole());
			dreamPlayers.put("Batting Style", dreamPlayerService.dreamPlayerDetails(myPlayer[i]).getBattingStyle());
			dreamPlayers.put("Player_DOB", dreamPlayerService.dreamPlayerDetails(myPlayer[i]).getDob());
			dreamPlayers.put("Player_Nationality", dreamPlayerService.dreamPlayerDetails(myPlayer[i]).getNationality());
			dreamPlayers.put("Image_URL", dreamPlayerService.dreamPlayerDetails(myPlayer[i]).getDisplayPicture());
			dreamPlayers.put("Player_TeamID", dreamPlayerService.dreamPlayerDetails(myPlayer[i]).getTeamId());

			dreamList.add(dreamPlayers);
		}
		dreamTeam.put("DreamPlayerList", dreamList);

		try (FileWriter file = new FileWriter("/home/bridgeit/Desktop/IPL/DreamPlayer.json")) {
			file.write(dreamTeam.toJSONString());
			file.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "redirect:/saveDreamPlayer";
	}
	
	
	@RequestMapping(value = "/saveDreamPlayer", method = RequestMethod.GET )
	public String addNewDreamPlayer(HttpServletRequest request) {
	HttpSession session=request.getSession();
		DreamPlayer dreamPlayer=new DreamPlayer();
		/*Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		User user = (User)authentication.getPrincipal();
		System.out.println(user.toString());*/
		
		JSONParser parser = new JSONParser();
			try {
			Object ob = parser.parse(new FileReader("/home/bridgeit/Desktop/IPL/DreamPlayer.json"));
			JSONObject object = (JSONObject) ob;

			JSONArray data = (JSONArray) object.get("DreamPlayerList");
			
			for (int i = 0; i < data.size(); i++) {
				JSONObject itemObj = (JSONObject) data.get(i);

				Object nameObj = itemObj.get("Player_Name");
				String playerName = (String) nameObj;
				dreamPlayer.setName(playerName);
												
				Object imgObject = itemObj.get("Image_URL");
				String playerPic = (String) imgObject;
				dreamPlayer.setDisplayPicture(playerPic);
				
				Object roleObj = itemObj.get("Player_Role");
				String roleName = (String) roleObj;
				dreamPlayer.setRole(roleName);

				Object battingStyleObj = itemObj.get("Batting Style");
				String battingStyleName = (String) battingStyleObj;
				dreamPlayer.setBattingStyle(battingStyleName);
				
				Object nationalityObj = itemObj.get("Player_Nationality");
				String nationalityName = (String) nationalityObj;
				dreamPlayer.setNationality(nationalityName);
				
				Object dobObj = itemObj.get("Player_DOB");
				String dobName = (String) dobObj;
				dreamPlayer.setDob(dobName);

					dreamPlayer.setUser((User) session.getAttribute("user"));
				/*Object teamIdObj = itemObj.get("Player_TeamID");
				Integer teamIdName = Integer.valueOf((String) teamIdObj);
				dreamPlayer.setTeamId(teamIdName);*/
					
				
				
				dreamPlayerService.addDreamPlayer(dreamPlayer);
				
				
			

			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return "redirect:/dreamPlayerList";
	}
}

package com.uma.IplApp.Controller;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uma.IplApp.DAO.DreamTeamDAO;
import com.uma.IplApp.Model.DreamTeam;
import com.uma.IplApp.Model.Player;
import com.uma.IplApp.Model.User;
import com.uma.IplApp.Service.DreamTeamService;
import com.uma.IplApp.Service.PlayerService;
import com.uma.IplApp.Service.UserService;

@Controller

public class DreamPlayerController {
	@Autowired
	PlayerService playerService;

	@Autowired
	DreamTeamService dreamTeamService;

	@Autowired
	UserService userService;
	@RequestMapping(value = "/dreamPlayerList", method = RequestMethod.GET)
	public ModelAndView displayAllTeam() {

		List<Player> dreamPlayerInfo = playerService.displayAllPlayer();

		return new ModelAndView("dreamPlayerList", "dreamPlayerInfo", dreamPlayerInfo);
	}

	@RequestMapping("/dreamPlayer")
	public String selectedDreamPlayer(@RequestParam(value = "myPlayer") DreamTeam dreamTeam, String[] myPlayer, HttpServletRequest req ) {
		HttpSession session=req.getSession();

			System.out.println(Arrays.toString(myPlayer));
			List<Player> playerList=dreamTeamService.getPlayerByName(myPlayer);
			dreamTeam.setUserId(((User) session.getAttribute("user")));
			
			dreamTeam.setdreamTeamName(req.getParameter("dreamTeamName"));
			dreamTeam.setdreamPlayer(playerList);
			if(dreamTeamService.isUserIdPresent(((User) session.getAttribute("user")).getId())==false)
			{
				dreamTeamService.addDreamTeam(dreamTeam);
				
			}
			else
				System.out.println("A Dream Team is Already Exist of User...");

			
			
		
		return "redirect:/dreamPlayerList";
	}
	
	
	
	/*@RequestMapping(value = "/saveDreamPlayer", method = RequestMethod.GET )
	public String addNewDreamPlayer(HttpServletRequest request) {
	HttpSession session=request.getSession();
		DreamPlayer dreamPlayer=new DreamPlayer();
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		User user = (User)authentication.getPrincipal();
		System.out.println(user.toString());
		
		JSONParser parser = new JSONParser();
			try {
			Object ob = parser.parse(new FileReader("/home/bridgeit/Desktop/IPL/DreamPlayer.json"));
			JSONObject object = (JSONObject) ob;

			JSONArray data = (JSONArray) object.get("DreamPlayerList");
			
			for (int i = 0; i <11; i++) {
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
					
				dreamPlayer.setUserId(((User) session.getAttribute("user")).getId());
			Object teamIdObj = itemObj.get("Player_TeamID");
			Integer teamIdName = Integer.valueOf((String) teamIdObj);
				dreamPlayer.setTeamId(teamIdName);
					System.out.println(dreamPlayerService.getUserId((String) session.getAttribute("email")));
				
			}
			if(dreamPlayerService.isUserIdPresent(((User) session.getAttribute("user")).getId())==false)
			{
				
				dreamPlayerService.addDreamPlayer(dreamPlayer);
			}
			else
				System.out.println("A Dream Team is Already Exist of User...");

		} catch (Exception e) {
			System.out.println(e);
		}
		return "redirect:/dreamPlayerList";
	}*/
}

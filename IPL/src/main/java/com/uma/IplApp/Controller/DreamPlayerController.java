package com.uma.IplApp.Controller;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uma.IplApp.Model.DreamPlayer;
import com.uma.IplApp.Model.Player;
import com.uma.IplApp.Service.DreamPlayerService;
import com.uma.IplApp.Service.PlayerService;
@Controller
public class DreamPlayerController {
	@Autowired
	PlayerService playerService;

	@Autowired
	DreamPlayerService dreamPlayerService;
	
	@RequestMapping(value = "/dreamPlayerList", method = RequestMethod.GET)
	public ModelAndView displayAllTeam() {

		List<Player> dreamPlayerInfo = playerService.displayAllPlayer();

		return new ModelAndView("dreamPlayerList", "dreamPlayerInfo", dreamPlayerInfo);
	}
	
	
	@RequestMapping("/dreamPlayer")
	public String selectedDreamPlayer( @RequestParam(value="myPlayer") String[] myPlayer)
	{
		DreamPlayer dreamPlayer=new DreamPlayer();
		/*for(int i=0;i<myPlayer.length;i++)
		{
			System.out.println(myPlayer[i]);
			Player p=dreamPlayerService.dreamPlayerDetails(myPlayer[i]);
			System.out.println(p.getRole());
		}
		
		
	*/
		System.out.println(myPlayer[0]);
		JSONObject dreamTeam=new JSONObject();
		JSONArray dreamList=new JSONArray();
		 for(int i=0;i<myPlayer.length;i++)
	        {
	            JSONObject dreamPlayers=new JSONObject();
	            
	            dreamPlayers.put("Player_Name",dreamPlayerService.dreamPlayerDetails(myPlayer[i]).getName());
	            dreamPlayers.put("Player_Role",dreamPlayerService.dreamPlayerDetails(myPlayer[i]).getRole());
	            dreamPlayers.put("Batting Style",dreamPlayerService.dreamPlayerDetails(myPlayer[i]).getBattingStyle());
	            dreamPlayers.put("Player_DOB",dreamPlayerService.dreamPlayerDetails(myPlayer[i]).getDob());
	            dreamPlayers.put("Player_Nationality",dreamPlayerService.dreamPlayerDetails(myPlayer[i]).getNationality());
	            dreamPlayers.put("Image_URL",dreamPlayerService.dreamPlayerDetails(myPlayer[i]).getDisplayPicture());
	            dreamPlayers.put("Player_TeamID",dreamPlayerService.dreamPlayerDetails(myPlayer[i]).getTeamId());
	            	
	            dreamList.add(dreamPlayers);
	        }
		 dreamTeam.put("DreamPlayerList", dreamList);
		 
		 try (FileWriter file = new FileWriter("/home/bridgeit/Desktop/IPL/DreamPlayer.json")) {
	            file.write(dreamTeam.toJSONString());
	            file.flush();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		 
		return "redirect:/dreamPlayerList";
	}
	
}

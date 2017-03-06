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
	public String selectedDreamPlayer(@SuppressWarnings("rawtypes") @RequestParam(value="myPlayer") String[] myPlayer)
	{
		DreamPlayer dreamPlayer=new DreamPlayer();
		/*dreamPlayer.setMyPlayer(player);*/
		System.out.println(myPlayer);
		
		//dreamPlayerService.addDreamPlayer(dreamPlayer);
	
		/*JSONObject obj = new JSONObject();
        obj.put("Id", dreamPlayer.getId());
       

        JSONArray list = new JSONArray();
        for(int i=0;i<myPlayer.length;i++)
        {
        	list.add(myPlayer);
        }
     
        obj.put("Dream Player", list);

        try (FileWriter file = new FileWriter("/home/bridgeit/Desktop/IPL/DreamPlayer.json")) {

            file.write(obj.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

      */

		
		
		
		
		
		return "redirect:/dreamPlayerList";
	}
}

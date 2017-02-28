package com.uma.IplApp;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class Demo {
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		
		JSONParser parser = new JSONParser();
	
			Object ob = parser.parse(new FileReader("/home/bridgeit/Desktop/IPL/newPlayerInfo.json"));
			JSONObject object = (JSONObject) ob;

			JSONArray data = (JSONArray) object.get("Playersinfo");

			for (int i = 0; i < data.size(); i++) {
				JSONObject itemObj = (JSONObject) data.get(i);

				Object nameObj = itemObj.get("player_name");
				String playerName = (String) nameObj;
			}
		}
	

}

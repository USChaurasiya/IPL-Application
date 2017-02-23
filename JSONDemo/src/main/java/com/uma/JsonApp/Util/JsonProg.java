package com.uma.JsonApp.Util;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonProg {
	public static void main(String[] args) {
		JSONParser parser=new JSONParser();
	List list=new ArrayList();
		
		try {
			Object obj=parser.parse(new FileReader("/home/bridgeit/Desktop/UMA/IPL Data/ipl2016.json"));
			
			JSONObject jsonObject=(JSONObject) obj;
			
	JSONArray ab=(JSONArray) jsonObject.get("grounds");
		for(int i=0;i<ab.size();i++)
		{
			list.add(ab.get(i));
		}
		
			System.out.println(list.get(6).toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

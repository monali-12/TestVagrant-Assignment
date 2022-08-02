package com.TestVargant.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJsonData {
	// This method return player country
	public String readJSONDataPlayercountrytname(int playerIndex) throws Exception, IOException, ParseException {

		JSONParser jsonParser = new JSONParser();
		JSONObject jsonObject = (JSONObject) jsonParser.parse(new FileReader(".//resoruces//TeamRCB.json"));

		JSONArray array = (JSONArray) jsonObject.get("player");

		JSONObject o = (JSONObject) array.get(playerIndex);
		String playercountryname = (String) o.get("country");
		return playercountryname;
	}
     //This method return player Role 
	public String readJSONDataPlayerrolename(int playerIndex) throws Exception, IOException, ParseException {

		JSONParser jsonParser = new JSONParser();
		JSONObject jsonObject = (JSONObject) jsonParser.parse(new FileReader(".//resoruces//TeamRCB.json"));

		JSONArray array = (JSONArray) jsonObject.get("player");

		JSONObject o = (JSONObject) array.get(playerIndex);
		String playerrole = (String) o.get("role");
		return playerrole;
	}
}
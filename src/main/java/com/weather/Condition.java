package com.weather;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;

public class Condition{

	public Condition() { }

	@JsonProperty("code")
	private int code;

	@JsonProperty("icon")
	private String icon;

	@JsonProperty("text")
	private String text;

	public void setCode(int code){
		this.code = code;
	}

	public int getCode(){
		return code;
	}

	public void setIcon(String icon){
		this.icon = icon;
	}

	public String getIcon(){
		return icon;
	}

	public void setText(String text){
		this.text = text;
	}

	public String getText(){
		return text;
	}

	@Override
	public String toString() {
		return "Condition{" +
				"code=" + code +
				", icon='" + icon + '\'' +
				", text='" + text + '\'' +
				'}';
	}

	public HashMap<String, Object> getAllCondition() {
		HashMap<String, Object> newMap = new HashMap<>();
		newMap.put("code", code);
		newMap.put("icon", icon);
		newMap.put("text", text);
		return newMap;
	}
}
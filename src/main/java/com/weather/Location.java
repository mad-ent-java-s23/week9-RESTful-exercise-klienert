package com.weather;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.ejb.Local;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Location{

	public Location() {	}

	@JsonProperty("localtime")
	private String localtime;

	@JsonProperty("country")
	private String country;

	@JsonProperty("localtime_epoch")
	private int localtimeEpoch;

	@JsonProperty("name")
	private String name;

	@JsonProperty("lon")
	private float lon;

	@JsonProperty("region")
	private String region;

	@JsonProperty("lat")
	private float lat;

	@JsonProperty("tz_id")
	private String tzId;

	public void setLocaltime(String localtime){
		this.localtime = localtime;
	}

	public String getLocaltime(){
		return localtime;
	}

	public void setCountry(String country){
		this.country = country;
	}

	public String getCountry(){
		return country;
	}

	public void setLocaltimeEpoch(int localtimeEpoch){
		this.localtimeEpoch = localtimeEpoch;
	}

	public int getLocaltimeEpoch(){
		return localtimeEpoch;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setLon(float lon){
		this.lon = lon;
	}

	public float getLon(){
		return lon;
	}

	public void setRegion(String region){
		this.region = region;
	}

	public String getRegion(){
		return region;
	}

	public void setLat(float lat){
		this.lat = lat;
	}

	public float getLat(){
		return lat;
	}

	public void setTzId(String tzId){
		this.tzId = tzId;
	}

	public String getTzId(){
		return tzId;
	}

	@Override
	public String toString() {
		return "Location{" +
				"localtime='" + localtime + '\'' +
				", country='" + country + '\'' +
				", localtimeEpoch=" + localtimeEpoch +
				", name='" + name + '\'' +
				", lon=" + lon +
				", region='" + region + '\'' +
				", lat=" + lat +
				", tzId='" + tzId + '\'' +
				'}';
	}

	public HashMap<String, String> getAllLocale() {
		HashMap<String, String> result = new HashMap<>();
		result.put("localtime", localDate());
		result.put("country", country);
		result.put("localtimeEpoch", String.valueOf(localtimeEpoch));
		result.put("name", name);
		result.put("lon", String.valueOf(lon));
		result.put("region", region);
		result.put("lat", String.valueOf(lat));
		result.put("tzId", tzId);

		return result;
	}

	public String localDate() {
//		LocalDate localDate = LocalDate.parse(date);
		LocalDate localDate = LocalDate.now();
		String day = String.valueOf(localDate.getDayOfWeek());
		String month = String.valueOf(localDate.getMonth());
		int dateNum = localDate.getDayOfMonth();
//		int year = localDate.getYear();
		String result = day + ", " + month + " " + dateNum;
//		Tuesday, March 28, 2023
		return result;
	}
}
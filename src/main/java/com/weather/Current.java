package com.weather;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Current{

	@JsonProperty("feelslike_c")
	private Object feelslikeC;

	@JsonProperty("uv")
	private Object uv;

	@JsonProperty("last_updated")
	private String lastUpdated;

	@JsonProperty("feelslike_f")
	private Object feelslikeF;

	@JsonProperty("wind_degree")
	private int windDegree;

	@JsonProperty("last_updated_epoch")
	private int lastUpdatedEpoch;

	@JsonProperty("is_day")
	private int isDay;

	@JsonProperty("precip_in")
	private Object precipIn;

	@JsonProperty("wind_dir")
	private String windDir;

	@JsonProperty("gust_mph")
	private Object gustMph;

	@JsonProperty("temp_c")
	private Object tempC;

	@JsonProperty("pressure_in")
	private Object pressureIn;

	@JsonProperty("gust_kph")
	private Object gustKph;

	@JsonProperty("temp_f")
	private Object tempF;

	@JsonProperty("precip_mm")
	private Object precipMm;

	@JsonProperty("cloud")
	private int cloud;

	@JsonProperty("wind_kph")
	private Object windKph;

	@JsonProperty("condition")
	private Condition condition;

	@JsonProperty("wind_mph")
	private Object windMph;

	@JsonProperty("vis_km")
	private Object visKm;

	@JsonProperty("humidity")
	private int humidity;

	@JsonProperty("pressure_mb")
	private Object pressureMb;

	@JsonProperty("vis_miles")
	private Object visMiles;

	public void setFeelslikeC(Object feelslikeC){
		this.feelslikeC = feelslikeC;
	}

	public Object getFeelslikeC(){
		return feelslikeC;
	}

	public void setUv(Object uv){
		this.uv = uv;
	}

	public Object getUv(){
		return uv;
	}

	public void setLastUpdated(String lastUpdated){
		this.lastUpdated = lastUpdated;
	}

	public String getLastUpdated(){
		return lastUpdated;
	}

	public void setFeelslikeF(Object feelslikeF){
		this.feelslikeF = feelslikeF;
	}

	public Object getFeelslikeF(){
		return feelslikeF;
	}

	public void setWindDegree(int windDegree){
		this.windDegree = windDegree;
	}

	public int getWindDegree(){
		return windDegree;
	}

	public void setLastUpdatedEpoch(int lastUpdatedEpoch){
		this.lastUpdatedEpoch = lastUpdatedEpoch;
	}

	public int getLastUpdatedEpoch(){
		return lastUpdatedEpoch;
	}

	public void setIsDay(int isDay){
		this.isDay = isDay;
	}

	public int getIsDay(){
		return isDay;
	}

	public void setPrecipIn(Object precipIn){
		this.precipIn = precipIn;
	}

	public Object getPrecipIn(){
		return precipIn;
	}

	public void setWindDir(String windDir){
		this.windDir = windDir;
	}

	public String getWindDir(){
		return windDir;
	}

	public void setGustMph(Object gustMph){
		this.gustMph = gustMph;
	}

	public Object getGustMph(){
		return gustMph;
	}

	public void setTempC(Object tempC){
		this.tempC = tempC;
	}

	public Object getTempC(){
		return tempC;
	}

	public void setPressureIn(Object pressureIn){
		this.pressureIn = pressureIn;
	}

	public Object getPressureIn(){
		return pressureIn;
	}

	public void setGustKph(Object gustKph){
		this.gustKph = gustKph;
	}

	public Object getGustKph(){
		return gustKph;
	}

	public void setTempF(Object tempF){
		this.tempF = tempF;
	}

	public Object getTempF(){
		return tempF;
	}

	public void setPrecipMm(Object precipMm){
		this.precipMm = precipMm;
	}

	public Object getPrecipMm(){
		return precipMm;
	}

	public void setCloud(int cloud){
		this.cloud = cloud;
	}

	public int getCloud(){
		return cloud;
	}

	public void setWindKph(Object windKph){
		this.windKph = windKph;
	}

	public Object getWindKph(){
		return windKph;
	}

	public void setCondition(Condition condition){
		this.condition = condition;
	}

	public Condition getCondition(){
		return condition;
	}

	public void setWindMph(Object windMph){
		this.windMph = windMph;
	}

	public Object getWindMph(){
		return windMph;
	}

	public void setVisKm(Object visKm){
		this.visKm = visKm;
	}

	public Object getVisKm(){
		return visKm;
	}

	public void setHumidity(int humidity){
		this.humidity = humidity;
	}

	public int getHumidity(){
		return humidity;
	}

	public void setPressureMb(Object pressureMb){
		this.pressureMb = pressureMb;
	}

	public Object getPressureMb(){
		return pressureMb;
	}

	public void setVisMiles(Object visMiles){
		this.visMiles = visMiles;
	}

	public Object getVisMiles(){
		return visMiles;
	}
}
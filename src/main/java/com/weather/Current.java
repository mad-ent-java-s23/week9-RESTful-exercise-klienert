package com.weather;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;

public class Current{

	public Current() {	}

	@JsonProperty("feelslike_c")
	private float feelslikeC;

	@JsonProperty("uv")
	private float uv;

	@JsonProperty("last_updated")
	private String lastUpdated;

	@JsonProperty("feelslike_f")
	private float feelslikeF;

	@JsonProperty("wind_degree")
	private int windDegree;

	@JsonProperty("last_updated_epoch")
	private int lastUpdatedEpoch;

	@JsonProperty("is_day")
	private int isDay;

	@JsonProperty("precip_in")
	private float precipIn;

	@JsonProperty("wind_dir")
	private String windDir;

	@JsonProperty("gust_mph")
	private float gustMph;

	@JsonProperty("temp_c")
	private float tempC;

	@JsonProperty("pressure_in")
	private float pressureIn;

	@JsonProperty("gust_kph")
	private float gustKph;

	@JsonProperty("temp_f")
	private float tempF;

	@JsonProperty("precip_mm")
	private float precipMm;

	@JsonProperty("cloud")
	private int cloud;

	@JsonProperty("wind_kph")
	private float windKph;

	@JsonProperty("condition")
	private Condition condition;

	@JsonProperty("wind_mph")
	private float windMph;

	@JsonProperty("vis_km")
	private float visKm;

	@JsonProperty("humidity")
	private int humidity;

	@JsonProperty("pressure_mb")
	private float pressureMb;

	@JsonProperty("vis_miles")
	private float visMiles;

	public void setFeelslikeC(float feelslikeC){
		this.feelslikeC = feelslikeC;
	}

	public float getFeelslikeC(){
		return feelslikeC;
	}

	public void setUv(float uv){
		this.uv = uv;
	}

	public float getUv(){
		return uv;
	}

	public void setLastUpdated(String lastUpdated){
		this.lastUpdated = lastUpdated;
	}

	public String getLastUpdated(){
		return lastUpdated;
	}

	public void setFeelslikeF(float feelslikeF){
		this.feelslikeF = feelslikeF;
	}

	public float getFeelslikeF(){
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

	public void setPrecipIn(float precipIn){
		this.precipIn = precipIn;
	}

	public float getPrecipIn(){
		return precipIn;
	}

	public void setWindDir(String windDir){
		this.windDir = windDir;
	}

	public String getWindDir(){
		return windDir;
	}

	public void setGustMph(float gustMph){
		this.gustMph = gustMph;
	}

	public float getGustMph(){
		return gustMph;
	}

	public void setTempC(float tempC){
		this.tempC = tempC;
	}

	public float getTempC(){
		return tempC;
	}

	public void setPressureIn(float pressureIn){
		this.pressureIn = pressureIn;
	}

	public float getPressureIn(){
		return pressureIn;
	}

	public void setGustKph(float gustKph){
		this.gustKph = gustKph;
	}

	public float getGustKph(){
		return gustKph;
	}

	public void setTempF(float tempF){
		this.tempF = tempF;
	}

	public float getTempF(){
		return tempF;
	}

	public void setPrecipMm(float precipMm){
		this.precipMm = precipMm;
	}

	public float getPrecipMm(){
		return precipMm;
	}

	public void setCloud(int cloud){
		this.cloud = cloud;
	}

	public int getCloud(){
		return cloud;
	}

	public void setWindKph(float windKph){
		this.windKph = windKph;
	}

	public float getWindKph(){
		return windKph;
	}

	public void setCondition(Condition condition){
		this.condition = condition;
	}

	public Condition getCondition(){
		return condition;
	}

	public void setWindMph(float windMph){
		this.windMph = windMph;
	}

	public float getWindMph(){
		return windMph;
	}

	public void setVisKm(float visKm){
		this.visKm = visKm;
	}

	public float getVisKm(){
		return visKm;
	}

	public void setHumidity(int humidity){
		this.humidity = humidity;
	}

	public int getHumidity(){
		return humidity;
	}

	public void setPressureMb(float pressureMb){
		this.pressureMb = pressureMb;
	}

	public float getPressureMb(){
		return pressureMb;
	}

	public void setVisMiles(float visMiles){
		this.visMiles = visMiles;
	}

	public float getVisMiles(){
		return visMiles;
	}

	@Override
	public String toString() {
		return "Current{" +
				"feelslikeC=" + feelslikeC +
				", uv=" + uv +
				", lastUpdated='" + lastUpdated + '\'' +
				", feelslikeF=" + feelslikeF +
				", windDegree=" + windDegree +
				", lastUpdatedEpoch=" + lastUpdatedEpoch +
				", isDay=" + isDay +
				", precipIn=" + precipIn +
				", windDir='" + windDir + '\'' +
				", gustMph=" + gustMph +
				", tempC=" + tempC +
				", pressureIn=" + pressureIn +
				", gustKph=" + gustKph +
				", tempF=" + tempF +
				", precipMm=" + precipMm +
				", cloud=" + cloud +
				", windKph=" + windKph +
				", condition=" + condition +
				", windMph=" + windMph +
				", visKm=" + visKm +
				", humidity=" + humidity +
				", pressureMb=" + pressureMb +
				", visMiles=" + visMiles +
				'}';
	}

	public HashMap<String, String> getAllCurrent() {
		HashMap<String, String> result = new HashMap<>();
		result.put("feelslike_c", String.valueOf(feelslikeC));
		result.put("uv", String.valueOf(uv));
		result.put("lastUpdated", lastUpdated);
		result.put("feelslike_f", String.valueOf(feelslikeF));
		result.put("windDegree=", String.valueOf(windDegree));
		result.put("lastUpdatedEpoch", String.valueOf(lastUpdatedEpoch));
		result.put("isDay", String.valueOf(isDay));
		result.put("precipIn", String.valueOf(precipIn));
		result.put("windDir", windDir );
		result.put("gustMph", String.valueOf(gustMph));
		result.put("tempC", String.valueOf(tempC));
		result.put("pressureIn", String.valueOf(pressureIn));
		result.put("gustKph", String.valueOf(gustKph));
		result.put("tempF", String.valueOf(tempF));
		result.put("precipMm", String.valueOf(precipMm));
		result.put("cloud", String.valueOf(cloud));
		result.put("windKph", String.valueOf(windKph));
		result.put("condition", String.valueOf(condition));
		result.put("windMph", String.valueOf(windMph));
		result.put("visKm", String.valueOf(visKm));
		result.put("humidity", String.valueOf(humidity));
		result.put("pressureMb", String.valueOf(pressureMb));
		result.put("visMiles", String.valueOf(visMiles));
		return result;
	}
}
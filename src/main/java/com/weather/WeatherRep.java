package com.weather;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherRep{

	public WeatherRep() { }

	@JsonProperty("current")
	private Current current;

	@JsonProperty("location")
	private Location location;

	public void setCurrent(Current current){
		this.current = current;
	}

	public Current getCurrent(){
		return current;
	}

	public void setLocation(Location location){
		this.location = location;
	}

	public Location getLocation(){
		return location;
	}

	@Override
	public String toString() {
		return "WeatherRep{" +
				"current=" + current +
				", location=" + location +
				'}';
	}
}
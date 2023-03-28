package com.persistence;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class weatherDAOTest {
    weatherDAO dao;

    @Test
    public void getCurrentWeatherTestSuccess() {
        dao = new weatherDAO();
        assertEquals("USA", dao.getCurrentWeather(77340).getLocation().getCountry());
    }

    @Test
    public void getCurrentNameTestSuccess() { // getName() ==> city
        dao = new weatherDAO();
        assertEquals("Huntsville", dao.getCurrentWeather(77340).getLocation().getName());
        assertEquals("Madison", dao.getCurrentWeather(53717).getLocation().getName());

    }

    @Test
    public void getCurrentStateTestSuccess() { // getRegion() ==> state
        dao = new weatherDAO();
        assertEquals("Wisconsin", dao.getCurrentWeather(53818).getLocation().getRegion());
        assertEquals("Texas", dao.getCurrentWeather(77340).getLocation().getRegion());
    }

    @Test
    public void getWeatherFeelsLikeTestSuccess() {
        dao = new weatherDAO();
        // took a cue from Paula's video, hard to test this since it is constantly changing.
        System.out.println("Feels like " + dao.getCurrentWeather(77340).getCurrent().getFeelslikeF() + " in Huntsville, TX");
        System.out.println("Local Time in Madison, WI is: " + dao.getCurrentWeather(53717).getLocation().getLocaltime());
        System.out.println("It is " + dao.getCurrentWeather(53818).getCurrent().getTempF() + " degrees in Platteville, WI");
    }

}
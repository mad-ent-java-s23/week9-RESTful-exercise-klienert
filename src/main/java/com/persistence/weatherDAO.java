package com.persistence;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.util.PropertiesLoader;

import com.weather.Current;
import com.weather.Location;
import com.weather.WeatherRep;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.util.*;

public class weatherDAO implements PropertiesLoader {
    Properties properties;
    private final Logger logger = LogManager.getLogger(this.getClass());
    public static String API_URL;

    /**
     * Load Properties for correct URI
     */
    private void loadProperties() {
        try {
            properties = loadProperties("/weather.properties");
            API_URL = properties.getProperty("weatherapi");
        } catch (IOException ioException) {
            logger.error("Cannot load properties..." + ioException);
        } catch (Exception e) {
            logger.error("Error loading properties..." + e);
        }
    }


    public WeatherRep getCurrentWeather(int zipcode) {
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target(url_key(zipcode));
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        ObjectMapper mapper = new ObjectMapper();
        WeatherRep currentResponse = new WeatherRep();
        try {
            currentResponse = mapper.readValue(response, WeatherRep.class);
        } catch (JsonProcessingException e) {
            logger.error("Error processing JSON... " + e);
        }
//        logger.info("    *****RESPONSE2: " + currentResponse.getLocation().getName() + ", " +
//                currentResponse.getLocation().getRegion() + " " + currentResponse.getCurrent().getTempF());
        return currentResponse;
    }

    public Map<String, String> getLocaleAll(int zipcode) {
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target(url_key(zipcode));
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        ObjectMapper mapper = new ObjectMapper();
        Map<String, String> map = null;
        try {
            map = mapper.readValue(response, Map.class);
        } catch (IOException e) {
            logger.error("Error -- IO exception " + e);
        }
        return map;
    }

//    public Map<String, Object> getAllCurrent(int zipcode) {
//        Client client = ClientBuilder.newClient();
//        WebTarget target =
//                client.target(url_key(zipcode));
//        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
//        ObjectMapper mapper = new ObjectMapper();
//        Map<String, Object> map = null;
//        try {
//            map = mapper.readValue(response, Map.class);
//        } catch (IOException e) {
//            logger.error("Error -- IO exception " + e);
//        }
//        return map;
//    }


    /**
     * Helper method to return the proper URL and Key for client target
     * @return  String to use for the client target
     */
    private String url_key (int zipcode) {
        loadProperties();
        String result = "";
        result = properties.getProperty("weatherapi.current") + zipcode + properties.getProperty("weatherapi.key");
//        logger.debug("   ****DEBUG --> " + result);
        return result;
    }



}

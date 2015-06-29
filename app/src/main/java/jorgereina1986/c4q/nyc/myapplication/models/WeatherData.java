package jorgereina1986.c4q.nyc.myapplication.models;

/**
 * Created by c4q-jorgereina on 6/27/15.
 */
public class WeatherData extends CardData {
    String zipCode;
    String temperature;

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public WeatherData(String zipCode, String temperature) {
        this.zipCode = zipCode;
        this.temperature = temperature;
    }
}

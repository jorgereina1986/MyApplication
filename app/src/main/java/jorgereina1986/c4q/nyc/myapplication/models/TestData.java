package jorgereina1986.c4q.nyc.myapplication.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by c4q-jorgereina on 6/27/15.
 */
public class TestData {

    public static List<CardData> getTestData() {

        List<CardData> cardDataList = new ArrayList<CardData>();

        WeatherData weatherData = new WeatherData("11237","82");
        cardDataList.add(weatherData);

        MusicData musicData = new MusicData("Allyson","Amazing Grace");
        cardDataList.add(musicData);


        return cardDataList;
    }
}

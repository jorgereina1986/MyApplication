package jorgereina1986.c4q.nyc.myapplication.models;

/**
 * Created by c4q-jorgereina on 6/27/15.
 */
public class MusicData extends CardData {
    String artist;
    String title;

    public MusicData(String artist, String title) {
        this.artist = artist;
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

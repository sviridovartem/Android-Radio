package com.example.sviridov.radio.model;

/**
 * Created by Sviridov on 24.02.2017.
 */

public class Station {

    final String DRAWABLE = "drawable/";

    private String stationTitle;
    private String imgUri;

    public Station(String stationTitle, String imgUri) {
        this.stationTitle = stationTitle;
        this.imgUri = imgUri;
    }

    public String getStationTitle() {
        return stationTitle;
    }

    public String getImgUri() {
        return imgUri;
    }
}

package com.example.sviridov.radio.services;

import com.example.sviridov.radio.model.Station;

import java.util.ArrayList;

/**
 * Created by Sviridov on 24.02.2017.
 */
public class DataService {
    private static DataService ourInstance = new DataService();

    public static DataService getInstance() {
        return ourInstance;
    }

    private DataService() {
    }

    public ArrayList<Station> getFeaturedStations() {


        ArrayList<Station> list = new ArrayList<>();

        list.add(new Station("Flights Plan(Tunes for Travel)", "flightplanmusic"));
        list.add(new Station("Two wheeling (Biking playlist)", "bicyclemusic"));
        list.add(new Station("Kids Jams (music for children's))", "kidsmusic"));
        list.add(new Station("Flights Plan(Tunes for Travel)", "flightplanmusic"));
        list.add(new Station("Two wheeling (Biking playlist)", "bicyclemusic"));
        list.add(new Station("Kids Jams (music for children's))", "kidsmusic"));

        return list;
    }

    public ArrayList<Station> getResentStations() {


        ArrayList<Station> list = new ArrayList<>();

        list.add(new Station("Flights Plan(Tunes for Travel)", "flightplanmusic"));
        list.add(new Station("Two wheeling (Biking playlist)", "bicyclemusic"));
        list.add(new Station("Flights Plan(Tunes for Travel)", "flightplanmusic"));
        list.add(new Station("Two wheeling (Biking playlist)", "bicyclemusic"));
        list.add(new Station("Kids Jams (music for children's))", "kidsmusic"));
        list.add(new Station("Kids Jams (music for children's))", "kidsmusic"));

        return list;
    }

    public ArrayList<Station> getPartyStations() {


        ArrayList<Station> list = new ArrayList<>();

        list.add(new Station("Flights Plan(Tunes for Travel)", "flightplanmusic"));
        list.add(new Station("Two wheeling (Biking playlist)", "bicyclemusic"));
        list.add(new Station("Flights Plan(Tunes for Travel)", "flightplanmusic"));
        list.add(new Station("Two wheeling (Biking playlist)", "bicyclemusic"));
        list.add(new Station("Kids Jams (music for children's))", "kidsmusic"));
        list.add(new Station("Kids Jams (music for children's))", "kidsmusic"));

        return list;
    }

}

package com.example.sviridov.radio.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.example.sviridov.radio.holders.StationViewHolder;
import com.example.sviridov.radio.model.Station;

import java.util.ArrayList;

/**
 * Created by Sviridov on 24.02.2017.
 */

public class StationAdapter extends RecyclerView.Adapter<StationViewHolder> {

    private ArrayList<Station> stations;

    public StationAdapter(ArrayList<Station> stations) {
        this.stations = stations;
    }



    @Override
    public void onBindViewHolder(StationViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    @Override
    public StationViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }
}

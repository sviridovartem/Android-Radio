package com.example.sviridov.radio.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sviridov.radio.Adapters.StationAdapter;
import com.example.sviridov.radio.R;
import com.example.sviridov.radio.model.Station;
import com.example.sviridov.radio.services.DataService;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link StationFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class StationFragment extends Fragment {

    private static final String ARG_STATION_TYPE = "station_type";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public static final int STATION_TYPE_FEATURED = 0;
    public static final int STATION_TYPE_RECENT = 1;
    public static final int STATION_TYPE_PARTY = 2;

    private int stationType;


    public StationFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param stationType Radio station type.
     * @return A new instance of fragment StationFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static StationFragment newInstance(int stationType) {
        StationFragment fragment = new StationFragment();
        Bundle args = new Bundle();
        args.putInt("", stationType);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            stationType = getArguments().getInt(ARG_STATION_TYPE);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_station, container, false);


        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerStations);
        recyclerView.setHasFixedSize(true);

        StationAdapter adapter;
        if (stationType == STATION_TYPE_FEATURED) {
            adapter = new StationAdapter(DataService.getInstance().getFeaturedStations());
        } else if (stationType == STATION_TYPE_RECENT) {
            adapter = new StationAdapter(DataService.getInstance().getResentStations());
        } else {
            adapter = new StationAdapter(DataService.getInstance().getPartyStations());
        }
        recyclerView.setAdapter(adapter);


        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);


        return view;
    }

}

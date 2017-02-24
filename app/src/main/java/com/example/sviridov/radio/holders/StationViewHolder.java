package com.example.sviridov.radio.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sviridov.radio.R;
import com.example.sviridov.radio.model.Station;

/**
 * Created by Sviridov on 24.02.2017.
 */

public class StationViewHolder extends RecyclerView.ViewHolder{

    private ImageView mainImg;
    private TextView mainText;

    public StationViewHolder(View itemView) {
        super(itemView);

        this.mainImg = (ImageView)itemView.findViewById(R.id.main_img);
        this.mainText = (TextView)itemView.findViewById(R.id.main_text);
    }
    public void updateUI(Station station){
        String uri = station.getImgUri();
        int resourse = mainImg.getResources().getIdentifier(uri, null, mainImg.getContext().getPackageName());
        mainImg.setImageResource(resourse);
        mainText.setText(station.getStationTitle());

    }
}

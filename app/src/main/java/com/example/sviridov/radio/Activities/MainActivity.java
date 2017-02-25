package com.example.sviridov.radio.Activities;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.sviridov.radio.Fragments.DetailsFragment;
import com.example.sviridov.radio.Fragments.MainFragment;
import com.example.sviridov.radio.R;
import com.example.sviridov.radio.model.Station;

public class MainActivity extends AppCompatActivity {


    public static MainActivity getMainActivity() {
        return mainActivity;
    }

    private static void setMainActivity(MainActivity mainActivity) {
        MainActivity.mainActivity = mainActivity;
    }

    private static MainActivity mainActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainActivity.setMainActivity(this);

        FragmentManager fm = getSupportFragmentManager();
        MainFragment mainFragment = (MainFragment)fm.findFragmentById(R.id.container_main);

        if(mainFragment == null){
            mainFragment = MainFragment.newInstance("","");
            fm.beginTransaction().add(R.id.container_main, mainFragment).commit();
        }
    }
    public void LoadDetailScreen(Station selectedStation){
        getSupportFragmentManager().beginTransaction().replace(R.id.container_main, new DetailsFragment()).addToBackStack(null).commit();

    }
}

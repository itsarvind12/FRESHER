package com.example.shubham.myapplication;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.google.android.youtube.player.YouTubeBaseActivity;

/**
 * Created by shubham on 15-Oct-18.
 */

public class MechSecondMid extends YouTubeBaseActivity {
    private static final String API_KEY="AIzaSyD_BGSgaZ-gtpPtsWP_Y1yk-loNGBj8hAE";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.recycler_main);
        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.list);
        recyclerView.setHasFixedSize(true);
        //to use RecycleView, you need a layout manager. default is LinearLayoutManager
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerAdapter11 adapter11=new RecyclerAdapter11(MechSecondMid.this);
        recyclerView.setAdapter(adapter11);
    }
}

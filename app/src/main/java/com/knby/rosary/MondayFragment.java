package com.knby.rosary;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class MondayFragment extends Fragment {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    Adapter adapter;
    ArrayList prayerList;

    public MondayFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view=inflater.inflate(R.layout.common_fragment, container, false);
        recyclerView = (RecyclerView)view.findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getContext());
        //Setting the recyclerView to have linearLayout
        recyclerView.setLayoutManager(layoutManager);
        prayerList=new ArrayList();
        prayerList.add(new card("The Annunciation","The Angel Gabriel tells Mary that She is to be the mother of God",R.drawable.j1));
        prayerList.add(new card("The Visitation","The Blessed Virgin pays a visit to Her cousin Elizabeth",R.drawable.j2));
        prayerList.add(new card("The Birth of Jesus","The Infant Jesus is born in a stable at Bethlehem",R.drawable.j3));
        prayerList.add(new card("The Presentation of the Child Jesus in the Temple","The Blessed Virgin presents the Child Jesus to Simeon in the Temple",R.drawable.j4));
        prayerList.add(new card("The Finding of the Child Jesus in the Temple","Jesus is lost for three days, and the Blessed Mother finds Him in the Temple",R.drawable.j5));
        adapter = new Adapter(prayerList,getContext());
        //Adding adapter to recyclerView
        recyclerView.setAdapter(adapter);


        return view;
    }
}




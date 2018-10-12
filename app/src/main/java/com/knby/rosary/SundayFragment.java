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


public class SundayFragment extends Fragment {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    Adapter adapter;
    ArrayList prayerList;

    public SundayFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.common_fragment, container, false);
        recyclerView = (RecyclerView)view.findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getContext());
        //Setting the recyclerView to have linearLayout
        recyclerView.setLayoutManager(layoutManager);
        prayerList=new ArrayList();
        prayerList.add(new card("The Resurrection of Jesus from the Dead","Jesus rises from the dead, three days after His death",R.drawable.g1));
        prayerList.add(new card("The Ascension of Jesus into Heaven","Forty days after His death, Jesus ascends into heaven",R.drawable.g2));
        prayerList.add(new card("The Birth of Jesus","Ten days after the Ascension, the Holy Spirit comes to the apostles and the Blessed Mother in the form of fiery tongues",R.drawable.g3));
        prayerList.add(new card("The Assumption of Mary into Heaven","The Blessed Virgin is assumed into heaven",R.drawable.g4));
        prayerList.add(new card("The Crowning of Mary, Queen of Heaven and Earth","The Blessed Virgin is crowned Queen of Heaven and Earth by Jesus, her Son",R.drawable.g5));
        adapter = new Adapter(prayerList,getContext());
        //Adding adapter to recyclerView
        recyclerView.setAdapter(adapter);


        return view;
    }
}




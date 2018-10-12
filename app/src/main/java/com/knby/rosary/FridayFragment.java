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


public class FridayFragment extends Fragment {
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    Adapter adapter;
    ArrayList prayerList;

    public FridayFragment() {
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
        prayerList.add(new card("The Agony of Jesus in the Garden","Jesus prays in the Garden of Olives and drops of blood break through His skin.",R.drawable.s1));
        prayerList.add(new card("The Scourging at the Pillar","Jesus is tied to a pillar and cruelly beaten with whips.",R.drawable.s2));
        prayerList.add(new card("The Crowning with Thorns","A crown of thorns is placed upon Jesus' head.",R.drawable.s3));
        prayerList.add(new card("The Carrying of the Cross","Jesus is made to carry His cross to Calvary.",R.drawable.s4));
        prayerList.add(new card("The Crucifixion","Jesus is nailed to the cross, and dies for our sins.",R.drawable.s5));

        adapter = new Adapter(prayerList,getContext());
        //Adding adapter to recyclerView
        recyclerView.setAdapter(adapter);


        return view;    }
}




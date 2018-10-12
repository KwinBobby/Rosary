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


public class ThursdayFragment extends Fragment {


    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    Adapter adapter;
    ArrayList prayerList;


    public ThursdayFragment() {
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
        prayerList.add(new card("The Baptism of Jesus","Jesus is baptized in the Jordan River by John the Baptist.",R.drawable.l1));
        prayerList.add(new card("The Wedding at Cana","Jesus attends a wedding at Cana in Galilee, where he turns water into wine.",R.drawable.l2));
        prayerList.add(new card("The Proclamation of the Kingdom of God","Jesus goes through the towns and cities of his own country proclaiming God's Kingdom and helping the poor.",R.drawable.l3));
        prayerList.add(new card("The Transfiguration","Jesus leads his friends up a high mountain, where they see him shining in glorious light.",R.drawable.l4));
        prayerList.add(new card("The Institution of the Holy Eucharist","At supper with his friends before he dies, Jesus gives himself to them in bread and wine.",R.drawable.l5));
        adapter = new Adapter(prayerList,getContext());
        //Adding adapter to recyclerView
        recyclerView.setAdapter(adapter);

        return view;    }
}




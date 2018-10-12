package com.knby.rosary;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Kevin on 2/25/2017.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {



    private Context context;
    Intent intent;
    List<card> prayerFeed;

    public Adapter(List<card> articleFeed, Context context){
        super();
        //Getting all the feeds
        this.prayerFeed = articleFeed;
        this.context = context;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //Inflating the layout for the feeds
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card, parent, false);
        ViewHolder holder=new ViewHolder(v);
        return holder;
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        final card currentMystery=prayerFeed.get(position);
        //Initialising the imageLoader

        holder.heading.setText(currentMystery.getHeading());
        holder.description.setText(currentMystery.getDescription());
        holder.image.setImageResource(currentMystery.getDrawingID());

    }

    @Override
    public int getItemCount()
    {
        return prayerFeed.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        //Defining viewHolder
        TextView heading;
        TextView description;
        ImageView image;


        public ViewHolder(View itemView) {
            super(itemView);
            //finding the required views by id
            heading=(TextView)itemView.findViewById(R.id.heading);
            description=(TextView)itemView.findViewById(R.id.description);
            image=(ImageView)itemView.findViewById(R.id.p_image);
        }
    }
}


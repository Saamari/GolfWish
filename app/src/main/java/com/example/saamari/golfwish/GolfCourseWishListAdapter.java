package com.example.saamari.golfwish;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bumptech.glide.Glide;

/**
 * Created by Saamari on 22.10.2017.
 */

public class GolfCourseWishListAdapter extends RecyclerView.Adapter<GolfCourseWishListAdapter.ViewHolder>  {

        private Context mContext;

    public GolfCourseWishListAdapter(Context context)
    {
        this.mContext = context;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public LinearLayout placenameHolder;
        public TextView placeName;
        public ImageView placeImage;

        public ViewHolder (View itemView){
            super(itemView);
            placeName = (TextView) itemView.findViewById(R.id.placeName);
            placenameHolder = (LinearLayout) itemView.findViewById(R.id.placeNameHolder);
            placeImage = (ImageView) itemView.findViewById(R.id.placeImage);
        }
    }

    @Override
    public int getItemCount(){
        return MainActivity.places.size();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_places, parent, false);
        return new ViewHolder(view);
    }

        @Override
        public void onBindViewHolder(final ViewHolder holder, final int position){
            final Place place = MainActivity.places.get(position);
            holder.placeName.setText(place.name);
            Glide.with(mContext).load(place.getImageResourceId(mContext)).into(holder.placeImage);
        }

}

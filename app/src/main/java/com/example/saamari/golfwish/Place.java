package com.example.saamari.golfwish;

import android.content.Context;

/**
 * Created by Saamari on 22.10.2017.
 */

public class Place {

    public String name;
    public String imageName;

    public int getImageResourceId(Context context)
    {
        return context.getResources().getIdentifier(this.imageName, "drawable", context.getPackageName());
    }
}

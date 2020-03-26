package com.irg.sayrah;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    // Constructor
    public ImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;

        if (convertView == null) {
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(500, 500));
            //imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            //imageView.setPadding(8, 8, 8, 8);
        }
        else
        {
            imageView = (ImageView) convertView;
        }
        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }

    // Keep all Images in array
    public Integer[] mThumbIds = {
            R.drawable.besmartinform, R.drawable.bekindtoaddressfear,
            R.drawable.bekindtosupport, R.drawable.bereadysocial1,
            R.drawable.bereadysocial2, R.drawable.bereadysocial3,
            R.drawable.besafe, R.drawable.besmartifyoudevelop,
            R.drawable.besmartinform, R.drawable.blue1,
            R.drawable.blue2, R.drawable.blue3,
            R.drawable.blue5, R.drawable.blue6,
            R.drawable.blue7, R.drawable.blue8, R.drawable.blue9,
            R.drawable.blue10, R.drawable.p1,
            R.drawable.p2, R.drawable.p3,
            R.drawable.p4, R.drawable.p5
    };
}

package com.example.user1.androidassignment83;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by user1 on 01/11/2017.
 */
public class CustomAdaptor  extends BaseAdapter {


    // refence variable of required class
    Context context;

    private final int[] images;
    View view;
    LayoutInflater layoutinfalt;

    // consturctor for class to pass Data to main activity
    public CustomAdaptor(Context context, int[] images) {

        this.context = context;
        this.images = images;
    }


    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        // LayoutInflater to get layout of Image view and text view
        layoutinfalt = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // if convertView is null fro make new layout with layoutinfalter
        if (convertView == null) {
            view = new View(context);
            view = layoutinfalt.inflate(R.layout.imagelayout, null);
            ImageView imageview = (ImageView) view.findViewById(R.id.imageView1);

            imageview.setImageResource(images[position]);

           }
            return view;
        }
    }
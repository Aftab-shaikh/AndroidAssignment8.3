package com.example.user1.androidassignment83;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    // private GridView Refence variable.
    private GridView gridview;

    int[] images={R.drawable.kitkatt,R.drawable.gingerbredpic,R.drawable.icecream,R.drawable.jellybeanpic,R.drawable.lolipop,R.drawable.honey};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Id assigned to girdView
        gridview= (GridView) findViewById(R.id.gridview);

        // Object of CustomAdaptor
        CustomAdaptor customAdaptor= new CustomAdaptor(this,images);

        // Adaptor assinged to gridview
        gridview.setAdapter(customAdaptor);




    }
}

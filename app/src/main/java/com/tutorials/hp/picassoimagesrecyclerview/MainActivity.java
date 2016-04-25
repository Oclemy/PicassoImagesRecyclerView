package com.tutorials.hp.picassoimagesrecyclerview;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.tutorials.hp.picassoimagesrecyclerview.mData.TVShowsCollection;
import com.tutorials.hp.picassoimagesrecyclerview.mRecycler.MyAdapter;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;
    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);

       rv= (RecyclerView) findViewById(R.id.rv);
        rv.setLayoutManager(new LinearLayoutManager(this));

        adapter=new MyAdapter(this, TVShowsCollection.getTVShows());

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                     rv.setAdapter(adapter);
            }
        });
    }


}

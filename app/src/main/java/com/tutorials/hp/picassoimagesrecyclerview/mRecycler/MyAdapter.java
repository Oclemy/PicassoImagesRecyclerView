package com.tutorials.hp.picassoimagesrecyclerview.mRecycler;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tutorials.hp.picassoimagesrecyclerview.R;
import com.tutorials.hp.picassoimagesrecyclerview.mData.TVShow;
import com.tutorials.hp.picassoimagesrecyclerview.mPicasso.PicassoClient;

import java.util.ArrayList;

/**
 * Created by Oclemmy on 4/25/2016 for ProgrammingWizards Channel.
 */
public class MyAdapter extends RecyclerView.Adapter<MyHolder> {

    Context c;
    ArrayList<TVShow> tvShows;

    public MyAdapter(Context c, ArrayList<TVShow> tvShows) {
        this.c = c;
        this.tvShows = tvShows;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.model,parent,false);
        MyHolder holder=new MyHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
         //BIND DATA
        holder.nameTxt.setText(tvShows.get(position).getName());

        //IMAGE
        PicassoClient.downloadImage(c,tvShows.get(position).getUrl(),holder.img);
    }

    @Override
    public int getItemCount() {
        return tvShows.size();
    }
}

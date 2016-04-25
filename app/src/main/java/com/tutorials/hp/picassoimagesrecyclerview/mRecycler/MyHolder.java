package com.tutorials.hp.picassoimagesrecyclerview.mRecycler;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.tutorials.hp.picassoimagesrecyclerview.R;

/**
 * Created by Oclemmy on 4/25/2016 for ProgrammingWizards Channel.
 */
public class MyHolder extends RecyclerView.ViewHolder {

    TextView nameTxt;
    ImageView img;

    public MyHolder(View itemView) {
        super(itemView);

        nameTxt= (TextView) itemView.findViewById(R.id.nameTxt);
        img= (ImageView) itemView.findViewById(R.id.movieImage);
    }
}

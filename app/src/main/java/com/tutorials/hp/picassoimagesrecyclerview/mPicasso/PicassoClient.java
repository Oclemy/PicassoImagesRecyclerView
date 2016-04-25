package com.tutorials.hp.picassoimagesrecyclerview.mPicasso;

import android.content.Context;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.tutorials.hp.picassoimagesrecyclerview.R;

/**
 * Created by Oclemmy on 4/25/2016 for ProgrammingWizards Channel.
 */
public class PicassoClient {

    public static void downloadImage(Context c,String url,ImageView img)
    {
        if(url != null && url.length()>0)
        {
            Picasso.with(c).load(url).placeholder(R.drawable.placeholder).into(img);

        }else {
            Picasso.with(c).load(R.drawable.placeholder).into(img);
        }
    }

}

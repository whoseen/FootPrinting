package com.qhn.bhne.footprinting;

import android.app.Activity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by qhn
 * on 2016/11/17 0017.
 */

public class MyUtils {

    //从Url中加载图片
    public static void loadImageFormNet(String url, ImageView imageView, Activity activity) {
        Glide.with(activity).load(url).placeholder(R.drawable.ic_placeholder).into(imageView);
        //Glide.with(activity).load(url).bitmapTransform(new RoundedCornersTransformation(activity, 200, 0, RoundedCornersTransformation.CornerType.TOP)).crossFade().into(imageView);
    }

    public static void setGridRecyclerStyle(Activity activity, RecyclerView recyclerView, int span, RecyclerView.Adapter adapter) {
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setLayoutManager(new LinearLayoutManager(activity));
        recyclerView.setAdapter(adapter);
    }
}

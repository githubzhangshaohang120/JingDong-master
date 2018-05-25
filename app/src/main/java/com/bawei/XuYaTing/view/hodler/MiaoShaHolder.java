package com.bawei.XuYaTing.view.hodler;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.bawei.XuYaTing.R;


public class MiaoShaHolder extends RecyclerView.ViewHolder {

    public ImageView imageView;

    public MiaoShaHolder(View itemView) {
        super(itemView);

        imageView = itemView.findViewById(R.id.miao_sha_image);

    }
}

package com.bawei.XuYaTing.view.hodler;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bawei.XuYaTing.R;


public class SureOrderHolder extends RecyclerView.ViewHolder {

    public ImageView sure_item_image;
    public TextView sure_item_title;
    public TextView sure_item_price;
    public TextView sure_item_num;

    public SureOrderHolder(View itemView) {
        super(itemView);

        //找到id
        sure_item_image = itemView.findViewById(R.id.sure_item_image);
        sure_item_title = itemView.findViewById(R.id.sure_item_title);
        sure_item_price = itemView.findViewById(R.id.sure_item_price);
        sure_item_num = itemView.findViewById(R.id.sure_item_num);

    }
}

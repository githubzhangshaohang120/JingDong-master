package com.bawei.XuYaTing.presenter;

import com.bawei.XuYaTing.model.AddCartModel;
import com.bawei.XuYaTing.model.bean.AddCartBean;
import com.bawei.XuYaTing.presenter.inter.AddCartPresenterInter;
import com.bawei.XuYaTing.view.Iview.ActivityAddCartInter;

/**
 * Created by Dash on 2018/2/1.
 */
public class AddCartPresenter implements AddCartPresenterInter {

    private ActivityAddCartInter activityAddCartInter;
    private AddCartModel addCartModel;

    public AddCartPresenter(ActivityAddCartInter activityAddCartInter) {
        this.activityAddCartInter = activityAddCartInter;

        addCartModel = new AddCartModel(this);
    }

    public void addToCart(String addCart, String uid, int pid) {

        addCartModel.addToCart(addCart,uid,pid);

    }

    @Override
    public void onCartAddSuccess(AddCartBean addCartBean) {
        activityAddCartInter.onCartAddSuccess(addCartBean);
    }
}

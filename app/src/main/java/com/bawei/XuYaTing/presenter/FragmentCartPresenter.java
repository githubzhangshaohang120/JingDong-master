package com.bawei.XuYaTing.presenter;

import com.bawei.XuYaTing.model.CartModel;
import com.bawei.XuYaTing.model.bean.CartBean;
import com.bawei.XuYaTing.presenter.inter.CartPresenterInter;
import com.bawei.XuYaTing.view.Iview.FragmentCartInter;

/**
 * Created by Dash on 2018/1/30.
 */
public class FragmentCartPresenter implements CartPresenterInter {

    private FragmentCartInter fragmentCartInter;
    private CartModel cartModel;

    public FragmentCartPresenter(FragmentCartInter fragmentCartInter) {
        this.fragmentCartInter = fragmentCartInter;

        cartModel = new CartModel(this);
    }

    public void getCartData(String selectCart, String uid) {

        cartModel.getCartData(selectCart,uid);

    }

    @Override
    public void getCartDataNull() {
        fragmentCartInter.getCartDataNull();
    }

    @Override
    public void getCartDataSuccess(CartBean cartBean) {
        fragmentCartInter.getCartDataSuccess(cartBean);
    }
}

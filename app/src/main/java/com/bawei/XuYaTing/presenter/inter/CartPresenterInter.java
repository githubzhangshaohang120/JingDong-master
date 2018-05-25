package com.bawei.XuYaTing.presenter.inter;

import com.bawei.XuYaTing.model.bean.CartBean;


public interface CartPresenterInter {
    void getCartDataNull();

    void getCartDataSuccess(CartBean cartBean);
}

package com.bawei.XuYaTing.view.Iview;

import com.bawei.XuYaTing.model.bean.CartBean;


public interface FragmentCartInter {
    void getCartDataNull();

    void getCartDataSuccess(CartBean cartBean);
}

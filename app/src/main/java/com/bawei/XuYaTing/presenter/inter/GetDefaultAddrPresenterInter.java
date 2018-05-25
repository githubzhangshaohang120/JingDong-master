package com.bawei.XuYaTing.presenter.inter;

import com.bawei.XuYaTing.model.bean.DefaultAddrBean;


public interface GetDefaultAddrPresenterInter {
    void onGetDefaultAddrSuccess(DefaultAddrBean defaultAddrBean);

    void onGetDefaultAddrEmpty();
}

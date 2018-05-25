package com.bawei.XuYaTing.presenter.inter;

import com.bawei.XuYaTing.model.bean.LoginBean;


public interface LoginPresenterInter {

    void onSuccess(LoginBean loginBean);


    void onSuccessByQQ(LoginBean loginBean, String ni_cheng, String iconurl);
}

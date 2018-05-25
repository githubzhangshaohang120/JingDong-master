package com.bawei.XuYaTing.view.Iview;

import com.bawei.XuYaTing.model.bean.LoginBean;


public interface LoginActivityInter {

    void getLoginSuccess(LoginBean loginBean);


    void getLoginSuccessByQQ(LoginBean loginBean, String ni_cheng, String iconurl);
}

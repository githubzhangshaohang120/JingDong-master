package com.bawei.XuYaTing.presenter;

import com.bawei.XuYaTing.model.UserInfoModel;
import com.bawei.XuYaTing.model.bean.UserInfoBean;
import com.bawei.XuYaTing.presenter.inter.UserInfoPresenterInter;
import com.bawei.XuYaTing.view.Iview.UserInforInter;


public class UserInfoPresenter implements UserInfoPresenterInter {

    private final UserInfoModel userInfoModel;
    private final UserInforInter userInforInter;

    public UserInfoPresenter(UserInforInter userInforInter) {
        this.userInforInter = userInforInter;
        userInfoModel = new UserInfoModel(this);
    }

    public void getUserInfo(String userInfoUrl, String uid) {

        userInfoModel.getUserInfo(userInfoUrl,uid);

    }

    @Override
    public void onUserInfoSUccess(UserInfoBean userInfoBean) {
        userInforInter.onUserInforSuccess(userInfoBean);
    }
}

package com.bawei.XuYaTing.presenter;

import com.bawei.XuYaTing.model.RegistModel;
import com.bawei.XuYaTing.model.bean.RegistBean;
import com.bawei.XuYaTing.presenter.inter.RegistPresenterInter;
import com.bawei.XuYaTing.view.Iview.RegistActivityInter;


public class RegistPresenter implements RegistPresenterInter {

    private RegistActivityInter registActivityInter;
    private RegistModel registModel;

    public RegistPresenter(RegistActivityInter registActivityInter) {
        this.registActivityInter = registActivityInter;
        registModel = new RegistModel(this);
    }

    public void registUser(String registUrl, String name, String pwd) {

        registModel.registUser(registUrl,name,pwd);
    }

    @Override
    public void onRegistSuccess(RegistBean registBean) {
        registActivityInter.onRegistSuccess(registBean);
    }
}

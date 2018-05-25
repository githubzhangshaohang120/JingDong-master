package com.bawei.XuYaTing.presenter;

import com.bawei.XuYaTing.model.GetDefaultAddrModel;
import com.bawei.XuYaTing.model.bean.DefaultAddrBean;
import com.bawei.XuYaTing.presenter.inter.GetDefaultAddrPresenterInter;
import com.bawei.XuYaTing.view.Iview.DefaultAddrInter;

/**
 * Created by Dash on 2018/2/26.
 */
public class GetDefaultAddrPresenter implements GetDefaultAddrPresenterInter {

    private DefaultAddrInter defaultAddrInter;
    private GetDefaultAddrModel getDefaultAddrModel;

    public GetDefaultAddrPresenter(DefaultAddrInter defaultAddrInter) {
        this.defaultAddrInter = defaultAddrInter;
        getDefaultAddrModel = new GetDefaultAddrModel(this);
    }

    public void getDefaultAddr(String getDefaultAddrUrl, String uid) {
        getDefaultAddrModel.getDefaultAddr(getDefaultAddrUrl,uid);
    }

    @Override
    public void onGetDefaultAddrSuccess(DefaultAddrBean defaultAddrBean) {
        defaultAddrInter.onGetDefaultAddrSuccess(defaultAddrBean);
    }

    @Override
    public void onGetDefaultAddrEmpty() {
        defaultAddrInter.onGetDefaultAddrEmpty();
    }
}

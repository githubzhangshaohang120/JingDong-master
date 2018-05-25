package com.bawei.XuYaTing.presenter;

import com.bawei.XuYaTing.model.AddNewAddrModel;
import com.bawei.XuYaTing.model.bean.AddNewAddrBean;
import com.bawei.XuYaTing.presenter.inter.AddNewAddrPresenterInter;
import com.bawei.XuYaTing.view.Iview.AddNewAddrInter;

/**
 * Created by Dash on 2018/2/26.
 */
public class AddNewAddrPresenter implements AddNewAddrPresenterInter {

    private AddNewAddrInter addNewAddrInter;
    private AddNewAddrModel addNewAddrModel;

    public AddNewAddrPresenter(AddNewAddrInter addNewAddrInter) {
        this.addNewAddrInter = addNewAddrInter;
        addNewAddrModel = new AddNewAddrModel(this);
    }

    public void addNewAddr(String addNewAddrUrl, String uid, String addr, String phone, String name) {

        addNewAddrModel.addNewAddr(addNewAddrUrl,uid,addr,phone,name);
    }

    @Override
    public void onAddAddrSuccess(AddNewAddrBean addNewAddrBean) {
        addNewAddrInter.onAddNewAddrSuccess(addNewAddrBean);
    }
}

package com.bawei.XuYaTing.presenter;

import android.content.Context;

import com.bawei.XuYaTing.model.GetProvinceModel;
import com.bawei.XuYaTing.model.bean.ProvinceBean;
import com.bawei.XuYaTing.presenter.inter.GetProvincePresenterInter;
import com.bawei.XuYaTing.view.Iview.GetProvinceInter;

import java.util.List;

/**
 * Created by Dash on 2018/2/27.
 */
public class GetProvincePresenter implements GetProvincePresenterInter {

    private GetProvinceInter getProvinceInter;
    private GetProvinceModel getProvinceModel;

    public GetProvincePresenter(GetProvinceInter getProvinceInter) {
        this.getProvinceInter = getProvinceInter;
        getProvinceModel = new GetProvinceModel(this);
    }

    public void getProvince(Context context) {
        getProvinceModel.getProvince(context);
    }

    @Override
    public void onGetProvince(List<ProvinceBean> list) {
        getProvinceInter.onGetProvince(list);
    }
}

package com.bawei.XuYaTing.view.Iview;

import com.bawei.XuYaTing.model.bean.FenLeiBean;
import com.bawei.XuYaTing.model.bean.HomeBean;


public interface InterFragmentHome {
    void onSuccess(HomeBean homeBean);

    void onFenLeiDataSuccess(FenLeiBean fenLeiBean);
}

package com.bawei.XuYaTing.presenter.inter;

import com.bawei.XuYaTing.model.bean.FenLeiBean;
import com.bawei.XuYaTing.model.bean.HomeBean;


public interface FragmentHomePInter {
    //首页的数据
    void onSuccess(HomeBean homeBean);
    //分类
    void onFenLeiDataSuccess(FenLeiBean fenLeiBean);
}

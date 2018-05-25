package com.bawei.XuYaTing.presenter;

import com.bawei.XuYaTing.model.FragmentFenLeiRightModel;
import com.bawei.XuYaTing.model.bean.ChildFenLeiBean;
import com.bawei.XuYaTing.presenter.inter.FenLeiRightPresenterInter;
import com.bawei.XuYaTing.view.Iview.FenLeiRightInter;

/**
 * Created by Dash on 2018/1/25.
 */
public class FragmentFenLeiRightPresenter implements FenLeiRightPresenterInter {

    private FenLeiRightInter fenLeiRightInter;
    private FragmentFenLeiRightModel fragmentFenLeiRightModel;

    public FragmentFenLeiRightPresenter(FenLeiRightInter fenLeiRightInter) {
        this.fenLeiRightInter = fenLeiRightInter;

        fragmentFenLeiRightModel = new FragmentFenLeiRightModel(this);
    }

    public void getChildData(String childFenLeiUrl, int cid) {

        fragmentFenLeiRightModel.getChildData(childFenLeiUrl,cid);
    }

    @Override
    public void onSuncess(ChildFenLeiBean childFenLeiBean) {

        fenLeiRightInter.getSuccessChildData(childFenLeiBean);

    }
}

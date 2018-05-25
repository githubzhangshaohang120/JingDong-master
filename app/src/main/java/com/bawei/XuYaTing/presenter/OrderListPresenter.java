package com.bawei.XuYaTing.presenter;

import com.bawei.XuYaTing.model.OrderListModel;
import com.bawei.XuYaTing.model.bean.OrderListBean;
import com.bawei.XuYaTing.presenter.inter.OrderListPresenterInter;
import com.bawei.XuYaTing.view.Iview.FragmentOrderListInter;

/**
 * Created by Dash on 2018/2/25.
 */
public class OrderListPresenter implements OrderListPresenterInter {

    private FragmentOrderListInter fragmentOrderListInter;
    private OrderListModel orderListModel;

    public OrderListPresenter(FragmentOrderListInter fragmentOrderListInter) {
        this.fragmentOrderListInter = fragmentOrderListInter;
        orderListModel = new OrderListModel(this);
    }

    public void getOrderData(String orderListUrl, String uid, int page) {

        orderListModel.getOrderData(orderListUrl,uid,page);

    }

    @Override
    public void onOrderDataSuccess(OrderListBean orderListBean) {

        fragmentOrderListInter.onOrderDataSuccess(orderListBean);
    }
}

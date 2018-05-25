package com.bawei.XuYaTing.presenter;

import com.bawei.XuYaTing.model.UpLoadPicModel;
import com.bawei.XuYaTing.model.bean.UpLoadPicBean;
import com.bawei.XuYaTing.presenter.inter.UpLoadPicPresenterInter;
import com.bawei.XuYaTing.view.Iview.UpLoadActivityInter;

import java.io.File;


public class UpLoadPicPresenter implements UpLoadPicPresenterInter {

    private UpLoadPicModel upLoadPicModel;
    private UpLoadActivityInter upLoadActivityInter;

    public UpLoadPicPresenter(UpLoadActivityInter upLoadActivityInter) {
        this.upLoadActivityInter = upLoadActivityInter;
        upLoadPicModel = new UpLoadPicModel(this);
    }

    public void uploadPic(String uploadIconUrl, File saveIconFile, String uid, String fileName) {

        upLoadPicModel.uploadPic(uploadIconUrl,saveIconFile,uid,fileName);

    }

    @Override
    public void uploadPicSuccess(UpLoadPicBean upLoadPicBean) {
        upLoadActivityInter.uploadPicSuccess(upLoadPicBean);
    }
}

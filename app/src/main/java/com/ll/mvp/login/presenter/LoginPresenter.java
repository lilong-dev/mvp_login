package com.ll.mvp.login.presenter;

import android.os.Handler;

import com.ll.mvp.login.bean.UserBean;
import com.ll.mvp.login.model.ILoginModel;
import com.ll.mvp.login.model.LoginModelImpl;
import com.ll.mvp.login.view.ILoginView;

/**
 * Created by Administrator on 2017/2/26.
 */
public class LoginPresenter {
    private LoginModelImpl mLoginModel;
    private ILoginView mLoginView;
    private Handler mHandler = new Handler();
    public LoginPresenter(ILoginView loginView){
        this.mLoginView = loginView;
        mLoginModel = new LoginModelImpl();
    }

    public void login(){
        this.mLoginView.showLoading();
        mLoginModel.login(mLoginView.getUserName(), mLoginView.getPassword(), new ILoginModel.LoginStateListener() {
            @Override
            public void loginSuccess() {
                mLoginView.loginSuccess();
                mLoginView.hideLoading();
            }

            @Override
            public void loginError() {
                mLoginView.loginError();
                mLoginView.hideLoading();
            }
        });
    }


}

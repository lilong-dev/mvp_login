package com.ll.mvp.login.view;

/**
 * Created by Administrator on 2017/2/26.
 */
public interface ILoginView {
    String getUserName();
    String getPassword();
    void loginSuccess();
    void loginError();
    void showLoading();
    void hideLoading();
}

package com.ll.mvp.login.model;

import com.ll.mvp.login.bean.UserBean;

/**
 * Created by Administrator on 2017/2/26.
 */
public interface ILoginModel {
    void login(String userName,String password,LoginStateListener mListener);

     interface LoginStateListener{
        void loginSuccess();
        void loginError();
    }
}

package com.ll.mvp.login.bean;

/**
 * Created by Administrator on 2017/2/26.
 */
public class UserBean {
    private String userName;
    private String passWord;
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }
}

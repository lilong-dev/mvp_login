package com.ll.mvp.login.model;

import android.os.AsyncTask;

/**
 * Created by Administrator on 2017/2/26.
 * 业务逻辑的实现类
 */
public class LoginModelImpl implements ILoginModel{
    @Override
    public void login(final String userName, final String password, final LoginStateListener mListener) {
        //模拟子线程耗时操作
        AsyncTask<Void,Integer,Void> task = new AsyncTask<Void, Integer, Void>() {
            @Override
            protected Void doInBackground(Void... voids) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return null;
            }

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
            }

            @Override
            protected void onPostExecute(Void aVoid) {
                super.onPostExecute(aVoid);
                //模拟登录成功
                if ("lilong".equals(userName) && "123456".equals(password)) {
                    if(mListener != null){
                        mListener.loginSuccess();
                    }

                } else {
                    if(mListener != null){
                        mListener.loginError();
                    }

                }
            }
        };
        task.execute();
    }
}

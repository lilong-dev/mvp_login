package com.ll.mvp.login.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by admin on 2017/3/6.
 */

public class ToastUtil {
    private Context mContext;
    public ToastUtil(Context context){
        this.mContext = context;
    }
    public void showToast(String message){
        Toast.makeText(mContext,message,Toast.LENGTH_LONG).show();
    }
}

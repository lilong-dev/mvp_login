package com.ll.mvp.login.modules;

import android.content.Context;

import com.ll.mvp.login.utils.ToastUtil;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by admin on 2017/3/6.
 */
@Module
public class AppModule {
    private Context mContext;
    public AppModule(Context context){
        this.mContext = context;
    }
   @Provides
   @Singleton
    public Context getContext(){
       return mContext;
   }

    @Provides
    @Singleton
    public ToastUtil getToastUtil(){
        return new ToastUtil(mContext);
    }
}

package com.ll.mvp.login;

import android.app.Application;
import android.util.Log;

import com.ll.mvp.login.components.AppComponent;
import com.ll.mvp.login.components.DaggerAppComponent;
import com.ll.mvp.login.modules.AppModule;

/**
 * Created by admin on 2017/3/6.
 */

public class AppApplication extends Application{
    private AppComponent appComponent;
    @Override
    public void onCreate() {
        super.onCreate();
        appComponent =  DaggerAppComponent.builder().appModule(new AppModule(this)).build();
    }

    public AppComponent getAppComponent(){
        return appComponent;
    }
}

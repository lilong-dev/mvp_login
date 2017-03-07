package com.ll.mvp.login.components;

import android.content.Context;

import com.ll.mvp.login.modules.AppModule;
import com.ll.mvp.login.utils.ToastUtil;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by admin on 2017/3/6.
 */
@Component(dependencies = AppModule.class)
@Singleton
public interface AppComponent {
    Context getContext();
    ToastUtil getToastUtil();
}

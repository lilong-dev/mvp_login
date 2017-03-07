package com.ll.mvp.login.components;

import com.ll.mvp.login.MainActivity;
import com.ll.mvp.login.modules.LoginModule;
import com.ll.mvp.login.scope.PerActivity;

import dagger.Component;

/**
 * Created by admin on 2017/3/6.
 */
@PerActivity
@Component(dependencies = AppComponent.class,modules = {LoginModule.class})
public interface LoginComponent{
    void inject(MainActivity activity);
}

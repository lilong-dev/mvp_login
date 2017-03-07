package com.ll.mvp.login.modules;

import com.ll.mvp.login.model.ILoginModel;
import com.ll.mvp.login.model.LoginModelImpl;
import com.ll.mvp.login.scope.PerActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by admin on 2017/3/6.
 */
@Module
@PerActivity
public class LoginModule {
    @Provides
    public ILoginModel getLoginModel(){
        return new LoginModelImpl();
    }
}

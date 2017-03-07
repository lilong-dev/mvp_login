package com.ll.mvp.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.ll.mvp.login.components.DaggerLoginComponent;
import com.ll.mvp.login.presenter.LoginPresenter;
import com.ll.mvp.login.utils.ToastUtil;
import com.ll.mvp.login.view.ILoginView;
import com.ll.mvp.longin.R;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements ILoginView{
    @Inject
    LoginPresenter mPresenter;
    @Inject
    ToastUtil mToastUtil;
    private EditText editUserName;
    private EditText editPassword;
    private Button btnLogin;
    private ProgressBar mProgressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerLoginComponent.builder().appComponent(((AppApplication)getApplication()).getAppComponent()).build().inject(this);
        editPassword = (EditText) findViewById(R.id.edit_login_password);
        editUserName = (EditText) findViewById(R.id.edit_login_mobile);
        btnLogin = (Button) findViewById(R.id.btn_login);
        mProgressBar = (ProgressBar) findViewById(R.id.progressBar);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPresenter.login();
            }
        });
        mPresenter.setLoginView(this);

    }

    @Override
    public String getUserName() {
        return editUserName.getText().toString();
    }

    @Override
    public String getPassword() {
        return editPassword.getText().toString();
    }

    /**
     * 登录成功
     */
    @Override
    public void loginSuccess() {
        mToastUtil.showToast("登录成功");
    }

    /**
     * 登录失败
     */
    @Override
    public void loginError() {
        mToastUtil.showToast("登录失败");
    }

    @Override
    public void showLoading() {
        mProgressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideLoading() {
        mProgressBar.setVisibility(View.GONE);
    }
}

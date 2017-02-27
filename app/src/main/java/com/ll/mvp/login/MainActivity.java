package com.ll.mvp.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.ll.mvp.login.presenter.LoginPresenter;
import com.ll.mvp.login.view.ILoginView;
import com.ll.mvp.longin.R;

public class MainActivity extends AppCompatActivity implements ILoginView{
    private LoginPresenter mPresenter;
    private EditText editUserName;
    private EditText editPassword;
    private Button btnLogin;
    private ProgressBar mProgressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPresenter = new LoginPresenter(this);
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
        Toast.makeText(this,"登录成功", Toast.LENGTH_LONG).show();
    }

    /**
     * 登录失败
     */
    @Override
    public void loginError() {
        Toast.makeText(this,"登录失败", Toast.LENGTH_LONG).show();
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

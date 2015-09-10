package com.libtest;

import android.app.Activity;
import android.content.Context;
import android.widget.TextView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;


@EActivity(resName = "login_activity")
public class LoginActivity extends Activity {


    public static void launch(Context context){
        LoginActivity_.intent(context).start();
    }

    @ViewById(resName="tv_login1")
    TextView tv_login;

    @AfterViews
    void initViews(){
        tv_login.setText("hahahaah");
    }

}

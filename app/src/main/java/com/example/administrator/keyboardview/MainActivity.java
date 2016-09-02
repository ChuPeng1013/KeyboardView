package com.example.administrator.keyboardview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by ChuPeng on 2016/8/17.
 * 主界面
 */
public class MainActivity extends AppCompatActivity
{
    //系统设置
    private TextView SystemSetting;
    private EditText username;
    private EditText userpsd;
    private KeyboardView keyboard;


    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        SystemSetting = (TextView) findViewById(R.id.settings);
        username = (EditText) findViewById(R.id.username_edit);
        userpsd = (EditText) findViewById(R.id.userpsd_edit);
        keyboard = (KeyboardView) findViewById(R.id.keyboard);

       /* SystemSetting.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this, SystemSettingActivity.class);
                startActivity(intent);
            }
        });*/

        if(Constants.slipButtonStatus)
        {
            new Thread(new Runnable()
            {
                public void run()
                {
                    while(true)
                    {
                        InputMethodManager imm = (InputMethodManager) getSystemService(MainActivity.this.INPUT_METHOD_SERVICE);
                        if (imm != null)
                        {
                            imm.hideSoftInputFromWindow(getWindow().getDecorView().getWindowToken(), 0);
                        }
                    }
                }
            }).start();

           // ((InputMethodManager) getSystemService(MainActivity.this.INPUT_METHOD_SERVICE)).hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);

            username.setOnClickListener(new View.OnClickListener()
            {

                public void onClick(View v)
                {
                    keyboard.setVisibility(View.VISIBLE);
                }
            });

            userpsd.setOnClickListener(new View.OnClickListener()
            {
                public void onClick(View v)
                {
                    keyboard.setVisibility(View.VISIBLE);
                }
            });

        }
    }
}

package com.example.administrator.keyboardview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ChuPeng on 2016/8/17.
 * 软键盘开关的界面
 */
public class SystemSettingActivity extends Activity
{
    //返回按钮
    private TextView back;
    //软键盘的开关
    private ImageView myBtn;
    private ImageView keyboard;
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.system_setting_activity);
        back = (TextView) findViewById(R.id.back);
        myBtn = (ImageView) findViewById(R.id.slipBtn);
        /*if(Constants.slipButtonStatus)
        {
            myBtn.setBackgroundResource(R.drawable.slip_bg_on);
        }
        else
        {
            myBtn.setBackgroundResource(R.drawable.slip_bg_off);
        }*/
        /*myBtn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if(Constants.slipButtonStatus)
                {
                   // myBtn.setBackgroundResource(R.mipmap.slip_bg_off);
                    Constants.slipButtonStatus = false;
                    System.out.println("关闭了");
                    System.out.println(Constants.slipButtonStatus);
                    //打开系统键盘
                    //隐藏系统键盘
                }
                else
                {
                   // myBtn.setBackgroundResource(R.mipmap.slip_bg_on);
                    Constants.slipButtonStatus = true;
                    System.out.println("打开了");
                    System.out.println(Constants.slipButtonStatus);
                }
            }
        });*/
    }
    //重写返回键
    public void onBackPressed()
    {
        finish();
    }
}

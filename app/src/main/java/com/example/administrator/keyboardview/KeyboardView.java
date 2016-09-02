package com.example.administrator.keyboardview;

import android.app.Instrumentation;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

/**
 * Created by ChuPeng on 2016/8/16.
 * 将自定义的软键盘实例化
 */
public class KeyboardView extends LinearLayout
{

    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;
    private Button enetr;
    private Button delete;
    public KeyboardView(Context context, AttributeSet set)
    {
        super(context, set);
        View view = LayoutInflater.from(context).inflate(R.layout.keyboard_content, this);
		one = (Button) view.findViewById(R.id.one);
        two = (Button) view.findViewById(R.id.two);
        three = (Button) view.findViewById(R.id.three);
        four = (Button) view.findViewById(R.id.four);
        five = (Button) view.findViewById(R.id.five);
        six = (Button) view.findViewById(R.id.six);
        seven = (Button) view.findViewById(R.id.seven);
        eight = (Button) view.findViewById(R.id.eight);
        nine = (Button) view.findViewById(R.id.nine);
        zero = (Button) view.findViewById(R.id.zero);
        enetr = (Button) view.findViewById(R.id.enter);
        delete = (Button) view.findViewById(R.id.delete);
		one.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
                new Thread(new Runnable()
                {
                    public void run()
                    {
                        Instrumentation inst = new Instrumentation();
                        inst.sendCharacterSync(KeyEvent.KEYCODE_1);
                    }
                }).start();
			}
		});

        two.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
            {
                new Thread(new Runnable()
                {
                    public void run()
                    {
                        Instrumentation inst = new Instrumentation();
                        inst.sendCharacterSync(KeyEvent.KEYCODE_2);
                    }
                }).start();
            }
        });

        three.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
            {
                new Thread(new Runnable()
                {
                    public void run()
                    {
                        Instrumentation inst = new Instrumentation();
                        inst.sendCharacterSync(KeyEvent.KEYCODE_3);
                    }
                }).start();
            }
        });

        four.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
            {
                new Thread(new Runnable()
                {
                    public void run()
                    {
                        Instrumentation inst = new Instrumentation();
                        inst.sendCharacterSync(KeyEvent.KEYCODE_4);
                    }
                }).start();
            }
        });

        five.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
            {
                new Thread(new Runnable()
                {
                    public void run()
                    {
                        Instrumentation inst = new Instrumentation();
                        inst.sendCharacterSync(KeyEvent.KEYCODE_5);
                    }
                }).start();
            }
        });

        six.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
            {
                new Thread(new Runnable()
                {
                    public void run()
                    {
                        Instrumentation inst = new Instrumentation();
                        inst.sendCharacterSync(KeyEvent.KEYCODE_6);
                    }
                }).start();
            }
        });

        seven.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
            {
                new Thread(new Runnable()
                {
                    public void run()
                    {
                        Instrumentation inst = new Instrumentation();
                        inst.sendCharacterSync(KeyEvent.KEYCODE_7);
                    }
                }).start();
            }
        });

        eight.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
            {
                new Thread(new Runnable()
                {
                    public void run()
                    {
                        Instrumentation inst = new Instrumentation();
                        inst.sendCharacterSync(KeyEvent.KEYCODE_8);
                    }
                }).start();
            }
        });

        nine.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
            {
                new Thread(new Runnable()
                {
                    public void run()
                    {
                        Instrumentation inst = new Instrumentation();
                        inst.sendCharacterSync(KeyEvent.KEYCODE_9);
                    }
                }).start();
            }
        });

        zero.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
            {
                new Thread(new Runnable()
                {
                    public void run()
                    {
                        Instrumentation inst = new Instrumentation();
                        inst.sendCharacterSync(KeyEvent.KEYCODE_0);
                    }
                }).start();
            }
        });

        enetr.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
            {
                new Thread(new Runnable()
                {
                    public void run()
                    {
                        Instrumentation inst = new Instrumentation();
                        inst.sendCharacterSync(KeyEvent.KEYCODE_ENTER);
                    }
                }).start();
            }
        });

        delete.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
            {
                new Thread(new Runnable()
                {
                    public void run()
                    {
                        Instrumentation inst = new Instrumentation();
                        inst.sendCharacterSync(KeyEvent.KEYCODE_DEL);
                    }
                }).start();
            }
        });
    }

}

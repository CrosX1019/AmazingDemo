package com.root.amazingdemo.widget;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.root.amazingdemo.R;
import com.root.amazingdemo.base.BaseActivity;

/**
 * Created by CrosX on 2017/9/28.
 */

public class BaseBar extends FrameLayout {

    private ImageView mLeftIcon;
    private TextView mTitleText;
    private boolean isFinish = true;


    public BaseBar(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.base_bar,this);
        mLeftIcon = findViewById(R.id.base_bar_left_icon);
        mTitleText = findViewById(R.id.base_bar_title_text);
        mLeftIcon.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isFinish){
                    ((BaseActivity) getContext()).finish();
                }else{
                    setCustomFunction();
                }
            }
        });

    }

    public void setLeftIcon(int resId){
        mLeftIcon.setImageResource(resId);
    }

    public void setLeftIconVisibility(boolean isV){
        if (isV){
            mLeftIcon.setVisibility(VISIBLE);
        }else{
            mLeftIcon.setVisibility(GONE);
        }
    }

    public void setFinish(boolean finish){
        this.isFinish = finish;
    }

    public void setTitleText(String title){
        mTitleText.setText(title);
    }

    public void setLeftIconListener(OnClickListener l) {
        mLeftIcon.setOnClickListener(l);
    }

    public void setCustomFunction(){

    }
}

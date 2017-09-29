package com.root.amazingdemo.activity;

import android.widget.Button;

import com.root.amazingdemo.R;
import com.root.amazingdemo.base.BaseActivity;

/**
 * Created by CrosX on 2017/9/29.
 */

public class SecondActivity extends BaseActivity {

    private Button mSecondButton;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_second;
    }

    @Override
    protected void initView() {
        mSecondButton = $(R.id.second_button);
    }


    @Override
    protected void initData() {

    }

    @Override
    protected void initListener() {

    }
}

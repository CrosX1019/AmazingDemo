package com.root.amazingdemo.activity;


import android.view.View;
import android.widget.Button;

import com.root.amazingdemo.R;
import com.root.amazingdemo.base.BaseActivity;

public class MainActivity extends BaseActivity {

    private Button mMainButton;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        mMainButton = $(R.id.main_button);
    }

    @Override
    protected void initData() {
    }

    @Override
    protected void initListener() {
        mMainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}

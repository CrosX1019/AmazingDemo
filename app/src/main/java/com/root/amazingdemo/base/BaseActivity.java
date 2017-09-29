package com.root.amazingdemo.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by CrosX on 2017/9/27.
 */

public abstract class BaseActivity extends AppCompatActivity {

    //activity中调用的ActivityContext
    protected BaseActivity mActivity;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        mActivity = this;
        initView();
        initData();
        initListener();
    }

    protected abstract int getLayoutId();

    protected abstract void initView();

    protected abstract void initData();

    protected abstract void initListener();


}

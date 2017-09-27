package com.root.amazingdemo.base;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.root.amazingdemo.R;

/**
 * Created by CrosX on 2017/9/27.
 */

public abstract class BaseActivity extends AppCompatActivity{

    protected BaseActivity mActivity;

    private Toolbar toolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        toolbar = $(R.id.base_toolbar);
        setSupportActionBar(toolbar);
        mActivity = this;
        initView();
        initData();
        initListener();
    }

    abstract protected int getLayoutId();

    abstract protected void initView();

    abstract protected void initData();

    abstract protected void initListener();

    /**
     * 通过xml查找相应的ID，通用方法
     *
     * @param id
     * @param <T>
     * @return
     */
    protected <T extends View> T $(@IdRes int id) {
        return (T) findViewById(id);
    }
}

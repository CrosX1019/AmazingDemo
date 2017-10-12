package com.root.amazingdemo.activity;


import android.view.View;
import android.widget.Button;

import com.root.amazingdemo.R;
import com.root.amazingdemo.base.BaseActivity;

import retrofit2.Retrofit;
import retrofit2.converter.fastjson.FastJsonConverterFactory;

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
                String url = "http://www.izaodao.com/Api/";
                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl(url)
                        .addConverterFactory(FastJsonConverterFactory.create())
                        .build();

            }
        });
    }
}

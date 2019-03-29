package com.jzd.jetpackdemo.acts;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.jzd.jetpackdemo.R;
import com.jzd.jetpackdemo.presenter.BasePresenter;
import com.jzd.jetpackdemo.presenter.LifeCyclePresenter;

/**
 * LifeCycle的使用
 */
public class LifeCycleActivity extends AppCompatActivity {

    private static final String TAG = LifeCycleActivity.class.getSimpleName();
    private BasePresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);
        Log.w(TAG,"onCreate --->");
        presenter = new LifeCyclePresenter();
        getLifecycle().addObserver(presenter);

    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.w(TAG,"onDestroy --->");
    }
}

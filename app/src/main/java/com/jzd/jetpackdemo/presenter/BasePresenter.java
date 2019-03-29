package com.jzd.jetpackdemo.presenter;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.support.annotation.NonNull;
import android.util.Log;

/**
 * @Created by zwh.
 * @description：
 * @date 2019/3/29 17:34
 * @邮箱：zhaowh@zgjzd.cn
 */
public class BasePresenter implements IPresenter {

    private static final String TAG = BasePresenter.class.getSimpleName();


    @Override
    public void onCreate(@NonNull LifecycleOwner owner) {
        Log.w(TAG,"onCreate --->");
    }

    @Override
    public void onResume(@NonNull LifecycleOwner owner) {
        Log.w(TAG,"onResume --->");
    }

    @Override
    public void onDestory(@NonNull LifecycleOwner owner) {
        Log.w(TAG,"onDestory --->");
    }


    @Override
    public void onLifecycleChanged(@NonNull LifecycleOwner owner, @NonNull Lifecycle.Event event) {
        Log.w(TAG,"onLifecycleChanged --->");
    }

}

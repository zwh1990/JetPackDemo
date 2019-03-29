package com.jzd.jetpackdemo.acts;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.jzd.jetpackdemo.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.bt_lifeCycle)
    Button btLifeCycle;
    @BindView(R.id.bt_page)
    Button btPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick({R.id.bt_lifeCycle, R.id.bt_page})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.bt_lifeCycle:
                Intent intent = new Intent(this,LifeCycleActivity.class);
                startActivity(intent);
                break;
            case R.id.bt_page:

                break;
        }
    }
}

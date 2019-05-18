package com.example.tablayoutpractice;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.example.tablayoutpractice.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity {


    ActivityMainBinding act;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bindViews();
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {

        act.tabLayout.addTab(act.tabLayout.newTab().setText("홈").setIcon(R.mipmap.ic_launcher));
        act.tabLayout.addTab(act.tabLayout.newTab().setText("목록"));
        act.tabLayout.addTab(act.tabLayout.newTab().setText("검색"));
        act.tabLayout.addTab(act.tabLayout.newTab().setText("더보기1"));
        act.tabLayout.addTab(act.tabLayout.newTab().setCustomView(createCustomTabView("커스텀1")));
        act.tabLayout.addTab(act.tabLayout.newTab().setCustomView(createCustomTabView("커스텀2")));
        act.tabLayout.addTab(act.tabLayout.newTab().setText("더보기4"));
        act.tabLayout.addTab(act.tabLayout.newTab().setText("더보기5"));
        act.tabLayout.addTab(act.tabLayout.newTab().setText("더보기6"));
        act.tabLayout.addTab(act.tabLayout.newTab().setText("더보기7"));

    }

    View createCustomTabView(String tabName){
        View tabView = LayoutInflater.from(mContext).inflate(R.layout.custom_tab,null);

        TextView nameTxt = tabView.findViewById(R.id.nameTxt);
        nameTxt.setText(tabName);
        return tabView;
    }

    @Override
    public void bindViews() {
        act = DataBindingUtil.setContentView(this,R.layout.activity_main);
    }
}

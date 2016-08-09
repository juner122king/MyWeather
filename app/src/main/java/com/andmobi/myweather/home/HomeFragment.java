package com.andmobi.myweather.home;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.andmobi.myweather.R;
import com.andmobi.myweather.modle.Data;
import com.andmobi.myweather.util.DebugUtils;
import com.andmobi.myweather.util.Utils;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * Description:
 * Created by andmobi003 on 2016/8/1 16:50
 */
public class HomeFragment extends Fragment implements HomeContract.View {

    HomeContract.Presenter mPresenter;
    //    @BindView(R.id.temperature)
    TextView tv_temperature;
    //    @BindView(R.id.info)
    TextView tv_info;
    //    @BindView(R.id.moon)
    TextView tv_moon;

    @Override
    public void setPresenter(@NonNull HomeContract.Presenter presenter) {
        mPresenter = Utils.checkNotNull(presenter);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        DebugUtils.d(getClass().getSimpleName(), "onCreateView");
        View root = inflater.inflate(R.layout.fragment1_home, container, false);
//        ButterKnife.bind(this,root);
        tv_temperature = (TextView) root.findViewById(R.id.temperature);
        tv_info = (TextView) root.findViewById(R.id.info);
        tv_moon = (TextView) root.findViewById(R.id.moon);
        return root;
    }

    @Override
    public void onResume() {
        super.onResume();
        DebugUtils.d(getClass().getSimpleName(), "onResume");
        mPresenter.toDay();
    }

    @Override
    public void changeText(String text) {

    }

    @Override
    public void onToDay(Data.Realtime realtime) {
        DebugUtils.d(getClass().getSimpleName(), realtime.toString());
        String moon = realtime.getMoon();//农历
        String temperature = realtime.getWeather().getTemperature();//温度
        String info = realtime.getWeather().getInfo();//天气情况
        tv_temperature.setText(String.format("%s\u2103", temperature));
        tv_info.setText(info);
        tv_moon.setText(moon);

    }
}

package com.andmobi.myweather.home;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.andmobi.myweather.R;
import com.andmobi.myweather.modle.Weather;
import com.andmobi.myweather.util.DebugUtils;
import com.andmobi.myweather.util.Utils;

import java.util.List;

/**
 * Description:
 * Created by andmobi003 on 2016/8/9 16:45
 */
public class HomeFragment2 extends Fragment implements HomeContract.View2 {


    HomeContract.Presenter mPresenter;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment2_home, container, false);
    }

    @Override
    public void onResume() {
        super.onResume();
        DebugUtils.d(getFragmentManager().getClass().getSimpleName(), "onResume");
        mPresenter.showList();
    }

    @Override
    public void setPresenter(HomeContract.Presenter presenter) {
        mPresenter = Utils.checkNotNull(presenter);
    }


    @Override
    public void onShowList(List<Weather> weathers) {
        DebugUtils.d(getClass().getSimpleName(), weathers.toString());

    }
}

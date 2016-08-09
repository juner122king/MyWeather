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
import com.andmobi.myweather.modle.WeatherOverview;
import com.andmobi.myweather.util.DebugUtils;
import com.andmobi.myweather.util.Utils;


/**
 * Description:
 * Created by andmobi003 on 2016/8/1 16:50
 */
public class HomeFragment extends Fragment implements HomeContract.View {

    HomeContract.Presenter mPresenter;
    TextView mTv_text;
    @Override
    public void setPresenter(@NonNull HomeContract.Presenter presenter) {
        mPresenter = Utils.checkNotNull(presenter);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        DebugUtils.d(getClass().getSimpleName(), "onCreateView");
        View root = inflater.inflate(R.layout.fragment1_home, container, false);
        mTv_text = (TextView) root.findViewById(R.id.tv1);
        mTv_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPresenter.onChangeText();

            }
        });
        return root;
    }

    @Override
    public void onResume() {
        super.onResume();
        DebugUtils.d(getClass().getSimpleName(), "onResume");
        mPresenter.query();
    }

    @Override
    public void changeText(String text) {
        mTv_text.setText(text);
    }

    @Override
    public void onQuery(WeatherOverview weatherOverview) {
        DebugUtils.d(getClass().getSimpleName(), weatherOverview.toString());

        mTv_text.setText(weatherOverview.getData().getLife().getDate());

    }
}

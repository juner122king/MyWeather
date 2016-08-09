package com.andmobi.myweather.home;

import com.andmobi.myweather.BasePresenter;
import com.andmobi.myweather.BaseView;
import com.andmobi.myweather.modle.Data;
import com.andmobi.myweather.modle.Weather;
import com.andmobi.myweather.modle.WeatherOverview;

import java.util.List;

/**
 * Description:
 * Created by andmobi003 on 2016/8/1 16:47
 */
public interface HomeContract {


    interface Presenter extends BasePresenter {
        void onChangeText();

        void toDay();

        void showList();
    }

    interface View extends BaseView<Presenter> {
        void changeText(String text);

        void onToDay(Data.Realtime realtime);
    }

    interface View2 extends BaseView<Presenter> {

        void onShowList(List<Weather> weathers);
    }
}

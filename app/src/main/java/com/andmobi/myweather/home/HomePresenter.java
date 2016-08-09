package com.andmobi.myweather.home;

import com.andmobi.myweather.data.Constant;
import com.andmobi.myweather.data.network.Network;
import com.andmobi.myweather.modle.BaseResponse;
import com.andmobi.myweather.modle.Weather;
import com.andmobi.myweather.modle.WeatherOverview;
import com.andmobi.myweather.util.Utils;

import java.util.List;
import java.util.concurrent.TimeUnit;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/**
 * Description:
 * Created by andmobi003 on 2016/8/1 16:45
 */
public class HomePresenter implements HomeContract.Presenter {
    private HomeContract.View mHomeView;
    private HomeContract.View2 mHomeView2;

    HomePresenter(HomeContract.View view) {
        mHomeView = view;
        mHomeView = Utils.checkNotNull(view, "HomeView cannot be null!");
        mHomeView.setPresenter(this);
    }

    HomePresenter(HomeContract.View2 view2) {

        mHomeView2 = view2;
        mHomeView2 = Utils.checkNotNull(view2, "HomeView2 cannot be null!");
        mHomeView2.setPresenter(this);
    }

    @Override
    public void start() {

    }

    @Override
    public void onChangeText() {
        mHomeView.changeText("123");
    }


    public Observable<WeatherOverview> queryAll() {
        return Network.getMainApi().query("深圳", Constant.key)
                .throttleFirst(5, TimeUnit.SECONDS)//请求间隔
                .flatMap(new Func1<BaseResponse<WeatherOverview>, Observable<WeatherOverview>>() {
                    @Override
                    public Observable<WeatherOverview> call(BaseResponse<WeatherOverview> weatherOverviewBaseResponse) {
                        return Observable.just(weatherOverviewBaseResponse.getResult());
                    }
                })
                .subscribeOn(Schedulers.io())//生产线程
                .observeOn(AndroidSchedulers.mainThread());//消费线程


    }


    @Override
    public void toDay() {
        queryAll().subscribe(new Action1<WeatherOverview>() {
            @Override
            public void call(WeatherOverview weatherOverview) {
                mHomeView.onQuery(weatherOverview);
            }
        });

    }


    @Override
    public void showList() {

        queryAll()
                .subscribe(new Action1<WeatherOverview>() {
                    @Override
                    public void call(WeatherOverview weatherOverview) {
                        mHomeView2.onShowList(weatherOverview.getData().getWeather());
                    }
                });
    }


}

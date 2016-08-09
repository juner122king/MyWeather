package com.andmobi.myweather.data.network;

import com.andmobi.myweather.modle.BaseResponse;
import com.andmobi.myweather.modle.WeatherOverview;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Description:
 * Created by andmobi003 on 2016/7/20 15:01
 */
public interface MainApi {


    /**
     * 获取广告Banner图片urls  RxJava方式
     *
     * @param token token
     */
    @GET("mobile/index")
    Observable<String> getHomeRx(@Query("token") String token);


    /**
     * 获取天气
     */
    @GET("query")
    Observable<BaseResponse<WeatherOverview>> query(@Query("cityname") String cityname, @Query("key") String key);
}

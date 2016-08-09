package com.andmobi.myweather.modle;

/**
 * 天气总览
 * Created by andmobi003 on 2016/8/1 17:58
 */
public class WeatherOverview {

    Data data;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "WeatherOverview{" +
                "data=" + data +
                '}';
    }
}

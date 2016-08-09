package com.andmobi.myweather.modle;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 * Created by andmobi003 on 2016/8/3 17:08
 */
public class Weather {


    private String date;

    private Info_ info;

    private String week;

    private String nongli;


    class Info_  {

        private List<String> night = new ArrayList<String>();

        private List<String> day = new ArrayList<String>();

        public List<String> getNight() {
            return night;
        }

        public void setNight(List<String> night) {
            this.night = night;
        }

        public List<String> getDay() {
            return day;
        }

        public void setDay(List<String> day) {
            this.day = day;
        }

        @Override
        public String toString() {
            return "Info{" +
                    "night=" + night +
                    ", day=" + day +
                    '}';
        }
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Info_ getInfo() {
        return info;
    }

    public void setInfo(Info_ info) {
        this.info = info;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getNongli() {
        return nongli;
    }

    public void setNongli(String nongli) {
        this.nongli = nongli;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "date='" + date + '\'' +
                ", info=" + info +
                ", week='" + week + '\'' +
                ", nongli='" + nongli + '\'' +
                '}';
    }
}

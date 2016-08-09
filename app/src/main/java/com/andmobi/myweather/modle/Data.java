package com.andmobi.myweather.modle;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 * Created by andmobi003 on 2016/8/3 16:58
 */
public class Data {

    private Integer isForeign;

    private Realtime realtime;
    private Life life;

    private Pm25 pm25;

    private List<Weather> weather = new ArrayList<Weather>();

    public List<Weather> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    public Integer getIsForeign() {
        return isForeign;
    }

    public void setIsForeign(Integer isForeign) {
        this.isForeign = isForeign;
    }

    public Realtime getRealtime() {
        return realtime;
    }

    public void setRealtime(Realtime realtime) {
        this.realtime = realtime;
    }

    public Life getLife() {
        return life;
    }

    public void setLife(Life life) {
        this.life = life;
    }

    public Pm25 getPm25() {
        return pm25;
    }

    public void setPm25(Pm25 pm25) {
        this.pm25 = pm25;
    }

    public class Realtime {


        private Wind wind;

        private String time;

        private Weather weather;

        private Integer dataUptime;

        private String date;

        private String cityCode;

        private String cityName;

        private Integer week;

        private String moon;

        public Wind getWind() {
            return wind;
        }

        public void setWind(Wind wind) {
            this.wind = wind;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public Weather getWeather() {
            return weather;
        }

        public void setWeather(Weather weather) {
            this.weather = weather;
        }

        public Integer getDataUptime() {
            return dataUptime;
        }

        public void setDataUptime(Integer dataUptime) {
            this.dataUptime = dataUptime;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getCityCode() {
            return cityCode;
        }

        public void setCityCode(String cityCode) {
            this.cityCode = cityCode;
        }

        public String getCityName() {
            return cityName;
        }

        public void setCityName(String cityName) {
            this.cityName = cityName;
        }

        public Integer getWeek() {
            return week;
        }

        public void setWeek(Integer week) {
            this.week = week;
        }

        public String getMoon() {
            return moon;
        }

        public void setMoon(String moon) {
            this.moon = moon;
        }

        @Override
        public String toString() {
            return "Realtime{" +
                    "wind=" + wind +
                    ", time='" + time + '\'' +
                    ", weather=" + weather +
                    ", dataUptime=" + dataUptime +
                    ", date='" + date + '\'' +
                    ", cityCode='" + cityCode + '\'' +
                    ", cityName='" + cityName + '\'' +
                    ", week=" + week +
                    ", moon='" + moon + '\'' +
                    '}';
        }

        class Weather {

            private String humidity;

            private String img;

            private String info;

            private String temperature;

            public String getHumidity() {
                return humidity;
            }

            public void setHumidity(String humidity) {
                this.humidity = humidity;
            }

            public String getImg() {
                return img;
            }

            public void setImg(String img) {
                this.img = img;
            }

            public String getInfo() {
                return info;
            }

            public void setInfo(String info) {
                this.info = info;
            }

            public String getTemperature() {
                return temperature;
            }

            public void setTemperature(String temperature) {
                this.temperature = temperature;
            }

            @Override
            public String toString() {
                return "Weather{" +
                        "humidity='" + humidity + '\'' +
                        ", img='" + img + '\'' +
                        ", info='" + info + '\'' +
                        ", temperature='" + temperature + '\'' +
                        '}';
            }
        }

        public class Wind {

            private String windspeed;

            private String direct;

            private String power;

            private Object offset;

            public String getWindspeed() {
                return windspeed;
            }

            public void setWindspeed(String windspeed) {
                this.windspeed = windspeed;
            }

            public String getDirect() {
                return direct;
            }

            public void setDirect(String direct) {
                this.direct = direct;
            }

            public String getPower() {
                return power;
            }

            public void setPower(String power) {
                this.power = power;
            }

            public Object getOffset() {
                return offset;
            }

            public void setOffset(Object offset) {
                this.offset = offset;
            }

            @Override
            public String toString() {
                return "Wind{" +
                        "windspeed='" + windspeed + '\'' +
                        ", direct='" + direct + '\'' +
                        ", power='" + power + '\'' +
                        ", offset=" + offset +
                        '}';
            }
        }
    }

    public class Life {

        private String date;

        private Info info;


        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public Info getInfo() {
            return info;
        }

        public void setInfo(Info info) {
            this.info = info;
        }

        class Info {

            private List<String> kongtiao = new ArrayList<String>();

            private List<String> yundong = new ArrayList<String>();

            private List<String> ziwaixian = new ArrayList<String>();

            private List<String> ganmao = new ArrayList<String>();

            private List<String> xiche = new ArrayList<String>();

            private List<String> wuran = new ArrayList<String>();

            private List<String> chuanyi = new ArrayList<String>();

            public List<String> getKongtiao() {
                return kongtiao;
            }

            public void setKongtiao(List<String> kongtiao) {
                this.kongtiao = kongtiao;
            }

            public List<String> getYundong() {
                return yundong;
            }

            public void setYundong(List<String> yundong) {
                this.yundong = yundong;
            }

            public List<String> getZiwaixian() {
                return ziwaixian;
            }

            public void setZiwaixian(List<String> ziwaixian) {
                this.ziwaixian = ziwaixian;
            }

            public List<String> getGanmao() {
                return ganmao;
            }

            public void setGanmao(List<String> ganmao) {
                this.ganmao = ganmao;
            }

            public List<String> getXiche() {
                return xiche;
            }

            public void setXiche(List<String> xiche) {
                this.xiche = xiche;
            }

            public List<String> getWuran() {
                return wuran;
            }

            public void setWuran(List<String> wuran) {
                this.wuran = wuran;
            }

            public List<String> getChuanyi() {
                return chuanyi;
            }

            public void setChuanyi(List<String> chuanyi) {
                this.chuanyi = chuanyi;
            }

            @Override
            public String toString() {
                return "Info{" +
                        "kongtiao=" + kongtiao +
                        ", yundong=" + yundong +
                        ", ziwaixian=" + ziwaixian +
                        ", ganmao=" + ganmao +
                        ", xiche=" + xiche +
                        ", wuran=" + wuran +
                        ", chuanyi=" + chuanyi +
                        '}';
            }
        }


        @Override
        public String toString() {
            return "Life{" +
                    "date='" + date + '\'' +
                    ", info=" + info +
                    '}';
        }
    }

    public class Pm25 {

        private String key;

        private Integer showDesc;

        private Pm25_ pm25_;

        private String dateTime;

        private String cityName;

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public Integer getShowDesc() {
            return showDesc;
        }

        public void setShowDesc(Integer showDesc) {
            this.showDesc = showDesc;
        }

        public Pm25_ getPm25_() {
            return pm25_;
        }

        public void setPm25_(Pm25_ pm25_) {
            this.pm25_ = pm25_;
        }

        public String getDateTime() {
            return dateTime;
        }

        public void setDateTime(String dateTime) {
            this.dateTime = dateTime;
        }

        public String getCityName() {
            return cityName;
        }

        public void setCityName(String cityName) {
            this.cityName = cityName;
        }

        class Pm25_ {

            private String curPm;

            private String pm25;

            private String pm10;

            private Integer level;

            private String quality;

            private String des;

            public String getCurPm() {
                return curPm;
            }

            public void setCurPm(String curPm) {
                this.curPm = curPm;
            }

            public String getPm25() {
                return pm25;
            }

            public void setPm25(String pm25) {
                this.pm25 = pm25;
            }

            public String getPm10() {
                return pm10;
            }

            public void setPm10(String pm10) {
                this.pm10 = pm10;
            }

            public Integer getLevel() {
                return level;
            }

            public void setLevel(Integer level) {
                this.level = level;
            }

            public String getQuality() {
                return quality;
            }

            public void setQuality(String quality) {
                this.quality = quality;
            }

            public String getDes() {
                return des;
            }

            public void setDes(String des) {
                this.des = des;
            }

            @Override
            public String toString() {
                return "Pm25_{" +
                        "curPm='" + curPm + '\'' +
                        ", pm25='" + pm25 + '\'' +
                        ", pm10='" + pm10 + '\'' +
                        ", level=" + level +
                        ", quality='" + quality + '\'' +
                        ", des='" + des + '\'' +
                        '}';
            }
        }

        @Override
        public String toString() {
            return "Pm25{" +
                    "key='" + key + '\'' +
                    ", showDesc=" + showDesc +
                    ", pm25_=" + pm25_ +
                    ", dateTime='" + dateTime + '\'' +
                    ", cityName='" + cityName + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Data{" +
                "isForeign=" + isForeign +
                ", realtime=" + realtime +
                ", life=" + life +
                ", pm25=" + pm25 +
                ", weather=" + weather +
                '}';
    }
}

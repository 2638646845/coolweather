package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather {

    public String status;//接口状态

    public Basic basic;//基础信息

    public Update update;//接口更新时间

    public Now now;//实况天气

    //@SerializedName("hourly")
    //public List<Hourly> hourlyList;//逐小时预报

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;//天气预报

    //public List<Lifestyle> lifestyleList;//生活指数

    @SerializedName("lifestyle")
    public List<Lifestyle> lifestyleList;

}

package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Lifestyle {

    public String brf;//生活指数

    @SerializedName("txt")
    public String info;//生活指数详细描述

    public String type;//生活指数类型

}

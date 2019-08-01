package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {

    @SerializedName("location")
    public String cityName;//城市名称

    @SerializedName("cid")
    public String weatherId;//城市ID

}

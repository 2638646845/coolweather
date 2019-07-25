package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

public class Province extends DataSupport {

    public int id;

    private String provinceName;

    private int provinceCode;

    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String getProvinceName(){
        return provinceName;
    }

    public void setProvinceName(String provinceName){
        this.provinceName = provinceName;
    }

    public int getProvinceCode(){
        return provinceCode;
    }

    private void setProvinceCode(int provinceCode){
        this.provinceCode = provinceCode;
    }
}

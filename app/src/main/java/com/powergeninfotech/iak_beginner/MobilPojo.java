package com.powergeninfotech.iak_beginner;

/**
 * Created by aharoldk on 03/02/18.
 */

public class MobilPojo {

    private int ban;
    private String warna;
    private String bensin;

    public MobilPojo(int ban, String warna, String bensin) {
        this.ban = ban;
        this.warna = warna;
        this.bensin = bensin;
    }

    public int getBan() {
        return ban;
    }

    public void setBan(int ban) {
        this.ban = ban;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getBensin() {
        return bensin;
    }

    public void setBensin(String bensin) {
        this.bensin = bensin;
    }
}

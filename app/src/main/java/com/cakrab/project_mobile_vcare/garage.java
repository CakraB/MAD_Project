package com.cakrab.project_mobile_vcare;

public class garage {
    private String garageName;
    private String garageCabang;

    public garage(String garageName, String garageCabang){
        this.garageName = garageName;
        this.garageCabang = garageCabang;
    }

    public String getGarageName(){
        return garageName;
    }

    public void setGarageName(String garageName) {
        this.garageName = garageName;
    }

    public String getGarageCabang(){
        return garageCabang;
    }

    public void setGarageCabang(String garageCabang) {
        this.garageCabang = garageCabang;
    }

}
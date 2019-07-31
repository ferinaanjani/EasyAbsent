package com.example.cx62.rpk;

import java.util.List;

public class ResponBody {

    List<AbsenModel> data;

    public ResponBody(List<AbsenModel> data) {
        this.data = data;
    }

    public ResponBody(){

    }

    public List<AbsenModel> getList() {
        return data;
    }

    public void setList(List<AbsenModel> data) {
        this.data = data;
    }
}

package com.example.cx62.rpk;

import java.util.List;

public class ResponBodyKaryawan {

    String message;
    Karyawan data;


    public ResponBodyKaryawan(String message, Karyawan data) {
        this.message = message;
        this.data = data;
    }

    public ResponBodyKaryawan(){

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Karyawan getData() {
        return data;
    }

    public void setData(Karyawan data) {
        this.data = data;
    }
}

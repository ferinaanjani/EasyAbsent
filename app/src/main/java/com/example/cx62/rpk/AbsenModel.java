package com.example.cx62.rpk;

public class AbsenModel {

    private String ID_Absen, ID_Karyawan, Tanggal, Time_in, Time_out, Status;

    public AbsenModel(String ID_Absen, String ID_Karyawan, String tanggal, String time_in, String time_out, String status) {
        this.ID_Absen = ID_Absen;
        this.ID_Karyawan = ID_Karyawan;
        Tanggal = tanggal;
        Time_in = time_in;
        Time_out = time_out;
        Status = status;
    }

    public AbsenModel(){

    }

    public String getID_Absen() {
        return ID_Absen;
    }

    public void setID_Absen(String ID_Absen) {
        this.ID_Absen = ID_Absen;
    }

    public String getID_Karyawan() {
        return ID_Karyawan;
    }

    public void setID_Karyawan(String ID_Karyawan) {
        this.ID_Karyawan = ID_Karyawan;
    }

    public String getTanggal() {
        return Tanggal;
    }

    public void setTanggal(String tanggal) {
        Tanggal = tanggal;
    }

    public String getTime_in() {
        return Time_in;
    }

    public void setTime_in(String time_in) {
        Time_in = time_in;
    }

    public String getTime_out() {
        return Time_out;
    }

    public void setTime_out(String time_out) {
        Time_out = time_out;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}

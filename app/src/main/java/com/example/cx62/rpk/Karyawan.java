package com.example.cx62.rpk;

public class Karyawan {

    String ID_Karyawan, Nama, NIK, Password, Device_ID, approvement;

    public Karyawan(String ID_Karyawan, String nama, String NIK, String password, String device_ID, String approvement) {
        this.ID_Karyawan = ID_Karyawan;
        Nama = nama;
        this.NIK = NIK;
        Password = password;
        Device_ID = device_ID;
        this.approvement = approvement;
    }

    public Karyawan(){

    }

    public String getID_Karyawan() {
        return ID_Karyawan;
    }

    public void setID_Karyawan(String ID_Karyawan) {
        this.ID_Karyawan = ID_Karyawan;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getDevice_ID() {
        return Device_ID;
    }

    public void setDevice_ID(String device_ID) {
        Device_ID = device_ID;
    }

    public String getApprovement() {
        return approvement;
    }

    public void setApprovement(String approvement) {
        this.approvement = approvement;
    }
}

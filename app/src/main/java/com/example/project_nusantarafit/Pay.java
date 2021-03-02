package com.example.project_nusantarafit;

public class Pay {
    public Integer fotoID;
    public String detail;
    public String tanggal;
    public String harga;
    public String hasil;

    public Pay(Integer fotoID, String detail, String tanggal, String harga, String hasil) {
        this.fotoID     = fotoID;
        this.detail     = detail;
        this.tanggal    = tanggal;
        this.harga      = harga;
        this.hasil      = hasil;
    }
}

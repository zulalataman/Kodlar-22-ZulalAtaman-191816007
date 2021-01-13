
package com.islemler;


public class kullanici {
    
    //encapsulation kullanımı
    private int id;
    private String Tckimlik;
    private String kullanici_adi;
    private String sifre;

    public kullanici(int id, String Tckimlik, String kullanici_adi, String sifre) {
        this.id = id;
        this.Tckimlik = Tckimlik;
        this.kullanici_adi = kullanici_adi;
        this.sifre = sifre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTckimlik() {
        return Tckimlik;
    }

    public void setTckimlik(String Tckimlik) {
        this.Tckimlik = Tckimlik;
    }

    public String getKullanici_adi() {
        return kullanici_adi;
    }

    public void setKullanici_adi(String kullanici_adi) {
        this.kullanici_adi = kullanici_adi;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }
    
    
}

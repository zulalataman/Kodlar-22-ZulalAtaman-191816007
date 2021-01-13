
package com.islemler;


public class satis {
    
    private int id;
    private String musteri_adi;
    private String musteri_soyadi;
    private String urun_stokKodu;
    private String urun_adi;
    private int satılan_adet;
    private double urun_fiyati;
    private double toplam_tutar;

    public satis(int id, String musteri_adi, String musteri_soyadi, String urun_stokKodu, String urun_adi, int satılan_adet, double urun_fiyati, double toplam_tutar) {
        this.id = id;
        this.musteri_adi = musteri_adi;
        this.musteri_soyadi = musteri_soyadi;
        this.urun_stokKodu = urun_stokKodu;
        this.urun_adi = urun_adi;
        this.satılan_adet = satılan_adet;
        this.urun_fiyati = urun_fiyati;
        this.toplam_tutar = toplam_tutar;
    }

    //get-set kullanımı
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMusteri_adi() {
        return musteri_adi;
    }

    public void setMusteri_adi(String musteri_adi) {
        this.musteri_adi = musteri_adi;
    }

    public String getMusteri_soyadi() {
        return musteri_soyadi;
    }

    public void setMusteri_soyadi(String musteri_soyadi) {
        this.musteri_soyadi = musteri_soyadi;
    }

    public String getUrun_stokKodu() {
        return urun_stokKodu;
    }

    public void setUrun_stokKodu(String urun_stokKodu) {
        this.urun_stokKodu = urun_stokKodu;
    }

    public String getUrun_adi() {
        return urun_adi;
    }

    public void setUrun_adi(String urun_adi) {
        this.urun_adi = urun_adi;
    }

    public int getSatılan_adet() {
        return satılan_adet;
    }

    public void setSatılan_adet(int satılan_adet) {
        this.satılan_adet = satılan_adet;
    }

    public double getUrun_fiyati() {
        return urun_fiyati;
    }

    public void setUrun_fiyati(double urun_fiyati) {
        this.urun_fiyati = urun_fiyati;
    }

    public double getToplam_tutar() {
        return toplam_tutar;
    }

    public void setToplam_tutar(double toplam_tutar) {
        this.toplam_tutar = toplam_tutar;
    }
    
    
}

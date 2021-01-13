
package com.islemler;




public class urun {
    
    //encapsulation kullanımı
    private int id;
    private String stok_kodu;
    private String kitap_adı;
    private String yazar;
    private int adet;
    private double fiyat;
    private String tür;

    public urun(int id,String stok_kodu, String kitap_adı, String yazar, int adet, double fiyat, String tür) {
        this.stok_kodu = stok_kodu;
        this.kitap_adı = kitap_adı;
        this.yazar = yazar;
        this.adet = adet;
        this.fiyat = fiyat;
        this.tür = tür;
        this.id = id;
        
    }
        public urun(int id, String stok_kodu, String kitap_adı, int adet, double fiyat) {
        this.stok_kodu = stok_kodu;
        this.kitap_adı = kitap_adı;
        this.adet = adet;
        this.fiyat = fiyat;
        this.id = id;
        
    }

   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStok_kodu() {
        return stok_kodu;
    }

    public void setStok_kodu(String stok_kodu) {
        this.stok_kodu = stok_kodu;
    }

    public String getKitap_adı() {
        return kitap_adı;
    }

    public void setKitap_adı(String kitap_adı) {
        this.kitap_adı = kitap_adı;
    }

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public int getAdet() {
        return adet;
    }

    public void setAdet(int adet) {
        this.adet = adet;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public String getTür() {
        return tür;
    }

    public void setTür(String tür) {
        this.tür = tür;
    }

   
     
    
}

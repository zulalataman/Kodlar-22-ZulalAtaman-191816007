
package com.islemler;


public class musteri {
    
    //encapsulation kullanımı- private kullanarak kapsülleme işlemini yaptık 
    //daha sonra get-setle bunun başka classlarda kullanılabilmesini sağladık.
    private int id;
    private String ad;
    private String soyad;
    private String mail;
    private String telefon_numarasi;

    public musteri(int id, String ad,String soyad, String mail, String telefon_numarasi) {
        this.id = id;
        this.ad=ad;
        this.soyad = soyad;
        this.mail = mail;
        this.telefon_numarasi = telefon_numarasi;
    }
    public musteri(int id, String ad,String soyad) {
        this.id = id;
        this.ad=ad;
        this.soyad = soyad;
        
    }
    
    //get kullanımı

    public int getId() {
        return id;
    }

    //set kullanımı
    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTelefon_numarasi() {
        return telefon_numarasi;
    }

    public void setTelefon_numarasi(String telefon_numarasi) {
        this.telefon_numarasi = telefon_numarasi;
    }
    
    
 

}

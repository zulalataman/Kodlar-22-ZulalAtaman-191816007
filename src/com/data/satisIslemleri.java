
package com.data;

import com.islemler.musteri;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.islemler.satis;
import com.islemler.urun;


public class satisIslemleri extends AbstractBaglanti{

    @Override
    void abstractMetod() {
        System.out.println("Abstract Metodu");
    }
    
    public ArrayList<satis> satisGetir(){
        
        ArrayList<satis> cikti5=new ArrayList<satis>();
        
        try {
            statement= con.createStatement();
            String sorgu= "Select * From satis";
            ResultSet rs= statement.executeQuery(sorgu);
            
            while(rs.next()){
                
                int id=rs.getInt("id");
                String musteri_adi= rs.getString("MüşteriAdı");
                String musteri_soyadi=rs.getString("MüşteriSoyadı");
                String urun_stokKodu=rs.getString("ÜrünStokKodu");
                String urun_adi=rs.getString("ÜrünAdı");
                int satılan_adet=rs.getInt("SatılanAdet");
                double urun_fiyati=rs.getDouble("ÜrünBirimFiyatı");
                double toplam_tutar=rs.getDouble("ToplamTutar");
                
                cikti5.add(new satis(id, musteri_adi, musteri_soyadi, urun_stokKodu, urun_adi, satılan_adet, urun_fiyati, toplam_tutar));
                
                        
            }
            return cikti5;
        } catch (SQLException ex) {
            Logger.getLogger(baglanti.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        }
           public ArrayList<urun> urunGetir2(){
        
        ArrayList<urun> cikti3=new ArrayList<urun>();
        
        try {
            statement= con.createStatement();
            String sorgu= "Select * From urunler";
            ResultSet rs= statement.executeQuery(sorgu);
            
            while(rs.next()){
                
                int id=rs.getInt("id");
                String stok_kodu= rs.getString("StokKodu");
                String kitap_adı=rs.getString("KitapAdı");
                int adet=rs.getInt("Adet");
                double fiyat=rs.getDouble("Fiyat");
                
                cikti3.add(new urun(id,stok_kodu, kitap_adı, adet, fiyat));
                
                        
            }
            return cikti3;
        } catch (SQLException ex) {
            Logger.getLogger(baglanti.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
           }
           public ArrayList<musteri> musteriGetir2(){
        
        ArrayList<musteri> cikti4=new ArrayList<musteri>();
        
        try {
            statement= con.createStatement();
            String sorgu= "Select * From musteriler";
            ResultSet rs= statement.executeQuery(sorgu);
            
            while(rs.next()){
                
                int id=rs.getInt("id");
                String ad= rs.getString("Ad");
                String soyad=rs.getString("Soyad");
               
                
                cikti4.add(new musteri(id, ad, soyad));
                
                        
            }
            return cikti4;
        } catch (SQLException ex) {
            Logger.getLogger(baglanti.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        
    }
      public void satisEkle(String musteri_adi, String musteri_soyadi, String urun_stokKodu, String urun_adi,int satılan_adet, double urun_fiyati, double toplam_tutar ){
 
         String sorgu= "Insert Into satis (MüşteriAdı, MüşteriSoyadı, ÜrünStokKodu, ÜrünAdı, SatılanAdet, ÜrünBirimFiyatı, ToplamTutar) VALUES(?,?,?,?,?,?,?)";
         
        try {
            preparedStatement=con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, musteri_adi);
            preparedStatement.setString(2, musteri_soyadi);
            preparedStatement.setString(3, urun_stokKodu);
            preparedStatement.setString(4, urun_adi);
            preparedStatement.setInt(5, satılan_adet);
            preparedStatement.setDouble(6, urun_fiyati);
            preparedStatement.setDouble(7, toplam_tutar);
            
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
      public void stokGuncelle(int id, int yeni_adet){
          
          String sorgu="Update urunler set Adet = ? where id = ?";
          
          try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setInt(1, yeni_adet);
            preparedStatement.setInt(2,id);
           
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
          
      }
}

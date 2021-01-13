
package com.data;

import com.islemler.urun;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class urunIslemleri extends AbstractBaglanti implements ISil{

    @Override
    void abstractMetod() {
        System.out.println("Abstract Metodu");
    }
    
    @Override
    public void sil(int id) {
        String sorgu= "Delete from urunler where id = ?";
           
        try {
            preparedStatement= con.prepareStatement(sorgu);
            preparedStatement.setInt(1, id);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  
    public ArrayList<urun> urunGetir(){
        
        ArrayList<urun> cikti=new ArrayList<urun>();
        
        try {
            statement= con.createStatement();
            String sorgu= "Select * From urunler";
            ResultSet rs= statement.executeQuery(sorgu); 
            
            while(rs.next()){
                
                //get kullanımı
                int id=rs.getInt("id");
                String stok_kodu= rs.getString("StokKodu");
                String kitap_adı=rs.getString("KitapAdı");
                String yazar=rs.getString("Yazar");
                int adet=rs.getInt("Adet");
                double fiyat=rs.getDouble("Fiyat");
                String tür=rs.getString("Tür");
                
                cikti.add(new urun(id, stok_kodu, kitap_adı, yazar, adet, fiyat, tür));
                
                        
            }
            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(baglanti.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
      
        
    }
         
      
        public void urunGuncelle(int id, String yeniStok_kodu,String yeniKitap_adı,String yeniYazar,int yeniAdet,double yeniFiyat,String yeniTür){
          String sorgu="Update urunler set StokKodu = ?, KitapAdı = ?, Yazar = ?, Adet = ?, Fiyat = ?, Tür = ? where id = ?";
          
        try {
            
           //set kullanımı
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, yeniStok_kodu);
            preparedStatement.setString(2, yeniKitap_adı);
            preparedStatement.setString(3, yeniYazar);
            preparedStatement.setInt(4, yeniAdet);
            preparedStatement.setDouble(5, yeniFiyat);
            preparedStatement.setString(6, yeniTür);
            preparedStatement.setInt(7,id);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
          
      } 

         public void urunEkle(String stok_kodu,String kitap_adı,String yazar,int adet,double fiyat,String tür){
 
         String sorgu= "Insert Into urunler (StokKodu, KitapAdı, Yazar, Adet, Fiyat, Tür) VALUES(?,?,?,?,?,?)";
         
        try {
            preparedStatement=con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, stok_kodu);
            preparedStatement.setString(2, kitap_adı);
            preparedStatement.setString(3, yazar);
            preparedStatement.setInt(4, adet);
            preparedStatement.setDouble(5, fiyat);
            preparedStatement.setString(6, tür);
            
            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Yeni ürün eklendi");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Böyle bir kayıt zaten var!");
        }
     }

    

}

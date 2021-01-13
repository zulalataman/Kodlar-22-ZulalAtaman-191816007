
package com.data;


import com.islemler.musteri;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class musteriIslemleri extends AbstractBaglanti implements ISil{

    @Override
    void abstractMetod() {
        System.out.println("Abstract Metodu");
    }
    
    //interface kullanımı
    @Override
    public void sil(int id) {
        String sorgu= "Delete from musteriler where id = ?";
           
        try {
            preparedStatement= con.prepareStatement(sorgu);
            preparedStatement.setInt(1, id);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<musteri> musteriGetir(){
        
        ArrayList<musteri> cikti2=new ArrayList<musteri>();
        
        try {
            statement= con.createStatement();
            String sorgu= "Select * From musteriler";
            ResultSet rs= statement.executeQuery(sorgu);
            
            while(rs.next()){
                
                int id=rs.getInt("id");
                String ad= rs.getString("Ad");
                String soyad=rs.getString("Soyad");
                String mail=rs.getString("Mail");
                String telefon_numarasi=rs.getString("TelefonNumarası");
               
                
                cikti2.add(new musteri(id, ad, soyad, mail, telefon_numarasi));
                
                        
            }
            return cikti2;
        } catch (SQLException ex) {
            Logger.getLogger(baglanti.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        
    }
        
         public void musteriGuncelle(int id, String yeniAd,String yeniSoyad,String yeniMail,String yeniTelefon_numarasi){
          String sorgu="Update musteriler set Ad = ?, Soyad = ?, Mail = ?, TelefonNumarası = ? where id = ?";
          
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, yeniAd);
            preparedStatement.setString(2, yeniSoyad);
            preparedStatement.setString(3, yeniMail);
            preparedStatement.setString(4, yeniTelefon_numarasi);
            preparedStatement.setInt(5,id);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
          
        
      }

        public void musteriEkle(String ad, String soyad, String mail, String telefon_numarasi){
 
         String sorgu= "Insert Into musteriler (Ad, Soyad, Mail, TelefonNumarası) VALUES(?,?,?,?)";
         
        try {
            preparedStatement=con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, soyad);
            preparedStatement.setString(3, mail);
            preparedStatement.setString(4, telefon_numarasi);
            
           
            
            preparedStatement.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Yeni müşteri eklendi");
            
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(null, "Böyle bir kayıt zaten var!");
        }
     }

     


    
}

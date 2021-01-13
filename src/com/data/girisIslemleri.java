
package com.data;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

//inheritance kullanımı
public class girisIslemleri extends AbstractBaglanti{

    @Override
    void abstractMetod() {
        System.out.println("Abstract Metodu");
    }
    
    public boolean girisYap(String kullanici_adi, String sifre){
        String sorgu= "Select * From kullanicilar where KullanıcıAdı = ? and Şifre = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, kullanici_adi);
            preparedStatement.setString(2, sifre);
            
            ResultSet rs=preparedStatement.executeQuery();
            
            return rs.next();
            
        } catch (SQLException ex) {
            Logger.getLogger(baglanti.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    public void kullaniciEkle(String Tckimlik, String kullanici_adi, String sifre){
 
         String sorgu= "Insert Into kullanicilar (TcKimlik, KullanıcıAdı, Şifre) VALUES(?,?,?)";
         
        try {
            preparedStatement=con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, Tckimlik);
            preparedStatement.setString(2, kullanici_adi);
            preparedStatement.setString(3, sifre);
           
            
            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Yeni kullanıcı eklendi");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Böyle bir kayıt zaten var!");
        }
     }
    
}

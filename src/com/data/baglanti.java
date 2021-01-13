package com.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


class baglantiIslemleri {
    public Connection con = null;
    public Statement statement = null;
    public PreparedStatement preparedStatement = null;
    
    
    
    public baglantiIslemleri(){
        
        //static kullanımı- Database.host şeklinde çağırabiliyoruz.New kullanmaya gerek yoktur.
        String url = "jdbc:mysql://" + Database.host + ":" + Database.port + "/" + Database.db_ismi + "?useUnicode=true&characterEncoding=utf8";

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver bulunamadı.");
        }


        try {
            con = DriverManager.getConnection(url, Database.kullanici_adi, Database.sifre);
            System.out.println("Bağlantı başarılı.");
        } catch (SQLException ex) {
            System.out.println("Bağlantı başarısız");
        }

    }  
    
    public void polymorphismMetod(){
        System.out.println("Polymorpishm Metodu");
               
    }
   }

//abstract kullanımı
    abstract class AbstractBaglanti extends baglantiIslemleri{
        
        abstract void abstractMetod();
    } 
    
//inheritance kullanımı

    class baglantiIslemleri2 extends baglantiIslemleri{
        @Override
        public void polymorphismMetod(){
            System.out.println("Veri tabanına bağlantı işlemleri yapıldı.");
        }
    }
    
    
    class baglantiIslemleri3 extends baglantiIslemleri{
        @Override
        public void polymorphismMetod(){
            System.out.println("Veri tabanına bağlanıldı.");
    }
    
    }
    public class baglanti{
        public static void main(String[] args){
            
            //polymorphism kullanımı
            
            baglantiIslemleri bislemleri= new baglantiIslemleri();
            baglantiIslemleri2 baglanti2=new baglantiIslemleri2();
            baglantiIslemleri3 baglanti3=new baglantiIslemleri3();
            
            metod(bislemleri);
            metod(baglanti2);
            metod(baglanti3);
        }
        public static void metod(baglantiIslemleri bislemleri){
            bislemleri.polymorphismMetod();
        }
    }
       
    
    

    

   

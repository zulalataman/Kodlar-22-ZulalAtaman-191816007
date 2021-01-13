
package com.arayuzSatis;

import com.data.*;
import com.islemler.musteri;
import com.islemler.urun;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class satisEkrani extends javax.swing.JFrame {
    DefaultTableModel model;
    DefaultTableModel model2;
    satisIslemleri urunMusteri=new satisIslemleri();
    
   
    public satisEkrani() {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        model = (DefaultTableModel) satisUruntablosu.getModel();
        urungoruntule();
        model2 = (DefaultTableModel) satisMusteritablosu.getModel();
        musterigoruntule();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        satisUruntablosu = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        satisMusteritablosu = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        satisYap = new javax.swing.JButton();
        stokKoduAlani3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        kitapAdiAlani3 = new javax.swing.JTextField();
        adetAlani3 = new javax.swing.JTextField();
        fiyatAlani3 = new javax.swing.JTextField();
        adAlani3 = new javax.swing.JTextField();
        soyadAlani3 = new javax.swing.JTextField();
        satilacakAdetAlani = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Satış İşlemleri");
        setBounds(new java.awt.Rectangle(300, 100, 0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        satisUruntablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Stok Kodu", "Kitap Adı", "Adet", "Fiyat"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        satisUruntablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                satisUruntablosuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(satisUruntablosu);
        if (satisUruntablosu.getColumnModel().getColumnCount() > 0) {
            satisUruntablosu.getColumnModel().getColumn(0).setResizable(false);
            satisUruntablosu.getColumnModel().getColumn(1).setResizable(false);
            satisUruntablosu.getColumnModel().getColumn(2).setResizable(false);
            satisUruntablosu.getColumnModel().getColumn(3).setResizable(false);
            satisUruntablosu.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(java.awt.SystemColor.inactiveCaption);
        jLabel5.setText("*Satış yapılacak ürünü seçiniz");

        satisMusteritablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Ad", "Soyad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        satisMusteritablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                satisMusteritablosuMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(satisMusteritablosu);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(java.awt.SystemColor.inactiveCaption);
        jLabel1.setText("Stok Kodu:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(java.awt.SystemColor.inactiveCaption);
        jLabel2.setText("Kitap Adı:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(java.awt.SystemColor.inactiveCaption);
        jLabel3.setText("Adet:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(java.awt.SystemColor.inactiveCaption);
        jLabel4.setText("Fiyat:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(java.awt.SystemColor.inactiveCaption);
        jLabel6.setText("Ad:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(java.awt.SystemColor.inactiveCaption);
        jLabel7.setText("Soyad:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(java.awt.SystemColor.inactiveCaption);
        jLabel9.setText("Satılacak Adet:");

        satisYap.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        satisYap.setText("Satış Yap");
        satisYap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                satisYapActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(java.awt.SystemColor.inactiveCaption);
        jLabel8.setText("*Satış yapılacak müşteriyi seçiniz");

        jLabel10.setForeground(java.awt.SystemColor.inactiveCaption);
        jLabel10.setText("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(stokKoduAlani3, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                    .addComponent(kitapAdiAlani3))
                                .addGap(54, 54, 54)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(adetAlani3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fiyatAlani3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(349, 349, 349)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(satilacakAdetAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(adAlani3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(soyadAlani3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel10))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(420, 420, 420)
                                .addComponent(satisYap)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(32, 32, 32))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stokKoduAlani3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(adetAlani3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(adAlani3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(kitapAdiAlani3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(fiyatAlani3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(soyadAlani3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addComponent(jLabel10)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(satilacakAdetAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(satisYap)
                .addGap(59, 59, 59))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void satisUruntablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_satisUruntablosuMouseClicked
        int selectedrow=satisUruntablosu.getSelectedRow();
        
       stokKoduAlani3.setText(model.getValueAt(selectedrow, 1).toString());
       kitapAdiAlani3.setText(model.getValueAt(selectedrow, 2).toString());
       adetAlani3.setText(model.getValueAt(selectedrow, 3).toString());
       fiyatAlani3.setText(model.getValueAt(selectedrow, 4).toString());
       
    }//GEN-LAST:event_satisUruntablosuMouseClicked

    private void satisMusteritablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_satisMusteritablosuMouseClicked
        int selectedrow=satisMusteritablosu.getSelectedRow();
        
       adAlani3.setText(model2.getValueAt(selectedrow, 1).toString());
       soyadAlani3.setText(model2.getValueAt(selectedrow, 2).toString());
    }//GEN-LAST:event_satisMusteritablosuMouseClicked

    private void satisYapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_satisYapActionPerformed
        
      
        String musteri_adi=adAlani3.getText();
        String musteri_soyadi=soyadAlani3.getText();
        String urun_stokKodu=stokKoduAlani3.getText();
        String urun_adi=kitapAdiAlani3.getText();
        int satılan_adet=Integer.valueOf(satilacakAdetAlani.getText());
        double urun_fiyati=Double.valueOf(fiyatAlani3.getText());
        double toplam_tutar=urun_fiyati*satılan_adet;
       
               
        
        //urunMusteri.satisEkle(musteri_adi, musteri_soyadi, urun_stokKodu, urun_adi, satılan_adet, urun_fiyati, toplam_tutar);
        
       
        
        int adet=Integer.valueOf(adetAlani3.getText());
        int yeni_adet=adet-satılan_adet;
        
        if(yeni_adet<0){
        JOptionPane.showMessageDialog(null,"Stokta yeterli ürün yok!");
               
        }
        else{
        
        int selectedrow=satisUruntablosu.getSelectedRow();
        
         if (selectedrow == -1) {
           if (model.getRowCount() == 0 ) {
              JOptionPane.showMessageDialog(null, "Tablo şu anda boş...");
           }
           else {
               JOptionPane.showMessageDialog(null, "Lütfen satış yapılacak ürünü seçiniz...");
           }}
             else {
           int id = (int)model.getValueAt(selectedrow,0);
           
           urunMusteri.satisEkle(musteri_adi, musteri_soyadi, urun_stokKodu, urun_adi, satılan_adet, urun_fiyati, toplam_tutar);
           
           urunMusteri.stokGuncelle(id, yeni_adet);
           
           JOptionPane.showMessageDialog(null, "Satış yapıldı.");
           urungoruntule();
           
           adAlani3.setText("");
           soyadAlani3.setText("");
           stokKoduAlani3.setText("");
           kitapAdiAlani3.setText("");
           satilacakAdetAlani.setText("");
           fiyatAlani3.setText("");
           adetAlani3.setText("");
         }
         
        }
        
    }//GEN-LAST:event_satisYapActionPerformed
    
   
    
    public void urungoruntule(){
        model.setRowCount(0);
        //tabloyu sıfırlıyo hata almamak için
        
        ArrayList<urun> urunler = new ArrayList<urun>();
       
        urunler = urunMusteri.urunGetir2();
        
        if(urunler != null){
            
            for(urun Urunler: urunler){
                Object[] eklenecek= {Urunler.getId(), Urunler.getStok_kodu(), Urunler.getKitap_adı(),Urunler.getAdet(), Urunler.getFiyat()};
                
                model.addRow(eklenecek);
            }
                
        }
    }
        public void musterigoruntule(){
       model2.setRowCount(0);
        //tabloyu sıfırlıyo hata almamak için
        
        ArrayList<musteri> musteriler = new ArrayList<musteri>();
       
        musteriler = urunMusteri.musteriGetir2();
        
        if(musteriler != null){
            
            for(musteri Musteriler: musteriler){
                Object[] eklenecek2= {Musteriler.getId(), Musteriler.getAd(), Musteriler.getSoyad()};
                
                model2.addRow(eklenecek2);
            }
                
        }

    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(satisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(satisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(satisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(satisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new satisEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adAlani3;
    private javax.swing.JTextField adetAlani3;
    private javax.swing.JTextField fiyatAlani3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField kitapAdiAlani3;
    private javax.swing.JTextField satilacakAdetAlani;
    private javax.swing.JTable satisMusteritablosu;
    private javax.swing.JTable satisUruntablosu;
    private javax.swing.JButton satisYap;
    private javax.swing.JTextField soyadAlani3;
    private javax.swing.JTextField stokKoduAlani3;
    // End of variables declaration//GEN-END:variables
}

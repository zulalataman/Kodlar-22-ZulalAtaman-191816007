
package com.arayuz;

import com.islemler.urun;
import com.data.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;


public class urunSilmeGuncellemeEkrani extends javax.swing.JFrame {

    DefaultTableModel model;
    urunIslemleri urun=new urunIslemleri();
   
    
    public urunSilmeGuncellemeEkrani() {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        model = (DefaultTableModel) uruntablosu1.getModel();
        urungoruntule();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        stokKoduAlani2 = new javax.swing.JTextField();
        kitapAdiAlani2 = new javax.swing.JTextField();
        yazarAlani2 = new javax.swing.JTextField();
        adetAlani2 = new javax.swing.JTextField();
        fiyatAlani2 = new javax.swing.JTextField();
        turAlani2 = new javax.swing.JTextField();
        urunsil = new javax.swing.JButton();
        urunguncelle = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        uruntablosu1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        aramaCubugu3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ürün İşlemleri");
        setBounds(new java.awt.Rectangle(200, 100, 0, 0));

        jPanel1.setBackground(java.awt.SystemColor.inactiveCaption);

        jPanel2.setBackground(java.awt.SystemColor.inactiveCaption);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Tür:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Stok Kodu:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Kitap Adı:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Yazar:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Adet:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Fiyat:");

        urunsil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        urunsil.setText("Ürün Sil");
        urunsil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urunsilActionPerformed(evt);
            }
        });

        urunguncelle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        urunguncelle.setText("Ürün Güncelle");
        urunguncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urunguncelleActionPerformed(evt);
            }
        });

        uruntablosu1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        uruntablosu1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Stok Kodu", "Kitap Adı", "Yazar", "Adet", "Fiyat", "Tür"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        uruntablosu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uruntablosu1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(uruntablosu1);
        if (uruntablosu1.getColumnModel().getColumnCount() > 0) {
            uruntablosu1.getColumnModel().getColumn(0).setResizable(false);
            uruntablosu1.getColumnModel().getColumn(1).setResizable(false);
            uruntablosu1.getColumnModel().getColumn(2).setResizable(false);
            uruntablosu1.getColumnModel().getColumn(3).setResizable(false);
            uruntablosu1.getColumnModel().getColumn(4).setResizable(false);
            uruntablosu1.getColumnModel().getColumn(5).setResizable(false);
            uruntablosu1.getColumnModel().getColumn(6).setResizable(false);
        }

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/boxes (1).png"))); // NOI18N

        aramaCubugu3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                aramaCubugu3KeyReleased(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/magnifier.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(urunsil)
                .addGap(52, 52, 52)
                .addComponent(urunguncelle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(turAlani2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fiyatAlani2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adetAlani2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yazarAlani2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kitapAdiAlani2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stokKoduAlani2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel8)))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 859, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(aramaCubugu3, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(44, 44, 44)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(stokKoduAlani2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kitapAdiAlani2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(yazarAlani2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adetAlani2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fiyatAlani2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(turAlani2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aramaCubugu3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(urunguncelle)
                    .addComponent(urunsil))
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void dinamikAra3(String ara3){
        TableRowSorter<DefaultTableModel> tr=new TableRowSorter<DefaultTableModel>(model);
        uruntablosu1.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(ara3));
    }
    private void aramaCubugu3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aramaCubugu3KeyReleased
        String ara3=aramaCubugu3.getText();
        dinamikAra3(ara3);
    }//GEN-LAST:event_aramaCubugu3KeyReleased

    private void uruntablosu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uruntablosu1MouseClicked
       int selectedrow=uruntablosu1.getSelectedRow();
       
       stokKoduAlani2.setText(model.getValueAt(selectedrow, 1).toString());
       kitapAdiAlani2.setText(model.getValueAt(selectedrow, 2).toString());
       yazarAlani2.setText(model.getValueAt(selectedrow, 3).toString());
       adetAlani2.setText(model.getValueAt(selectedrow, 4).toString());
       fiyatAlani2.setText(model.getValueAt(selectedrow, 5).toString());
       turAlani2.setText(model.getValueAt(selectedrow, 6).toString());
       
    }//GEN-LAST:event_uruntablosu1MouseClicked

    private void urunguncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urunguncelleActionPerformed
        String stok_kodu=stokKoduAlani2.getText();
        String kitap_adı=kitapAdiAlani2.getText();
        String yazar=yazarAlani2.getText();
        int adet=Integer.valueOf(adetAlani2.getText());
        Double fiyat=Double.valueOf(fiyatAlani2.getText());
        String tür=turAlani2.getText();
        
        int selectedrow=uruntablosu1.getSelectedRow();
         if (selectedrow == -1) {
           if (model.getRowCount() == 0 ) {
               JOptionPane.showMessageDialog(null, "Ürün tablosu şu anda boş...");
           }
           else {
               JOptionPane.showMessageDialog(null, "Lütfen silinecek bir ürün seçin...");
           }}
         else {
          int id = (int)model.getValueAt(selectedrow,0); 
           
           urun.urunGuncelle(id, stok_kodu, kitap_adı, yazar, adet, fiyat, tür);
           
           urungoruntule();
           
           JOptionPane.showMessageDialog(null, "Ürün güncellendi.");
           
        stokKoduAlani2.setText("");
        kitapAdiAlani2.setText("");
        yazarAlani2.setText("");
        adetAlani2.setText("");
        fiyatAlani2.setText("");
        turAlani2.setText("");
            
       }
      

    }//GEN-LAST:event_urunguncelleActionPerformed

    private void urunsilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urunsilActionPerformed
       
       int selectedrow=uruntablosu1.getSelectedRow();
         if (selectedrow == -1) {
           if (model.getRowCount() == 0 ) {
               JOptionPane.showMessageDialog(null, "Ürün tablosu şu anda boş...");
           }
           else {
               JOptionPane.showMessageDialog(null, "Lütfen silinecek bir ürün seçin...");
           }}
         else {
           int id = (int)model.getValueAt(selectedrow,0);
           
           urun.sil(id);
           
           urungoruntule();
           
           JOptionPane.showMessageDialog(null, "Ürün silindi.");
       
    }//GEN-LAST:event_urunsilActionPerformed
    }
    public void urungoruntule(){
        model.setRowCount(0);
        //tabloyu sıfırlıyo hata almamak için
        
        ArrayList<urun> urunler = new ArrayList<urun>();
       
        urunler = urun.urunGetir();
        
        if(urunler != null){
            
            for(urun Urunler: urunler){
                Object[] eklenecek= {Urunler.getId(), Urunler.getStok_kodu(), Urunler.getKitap_adı(), Urunler.getYazar(), Urunler.getAdet(), Urunler.getFiyat(), Urunler.getTür()};
                
                model.addRow(eklenecek);
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
            java.util.logging.Logger.getLogger(urunSilmeGuncellemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(urunSilmeGuncellemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(urunSilmeGuncellemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(urunSilmeGuncellemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new urunSilmeGuncellemeEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adetAlani2;
    private javax.swing.JTextField aramaCubugu3;
    private javax.swing.JTextField fiyatAlani2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kitapAdiAlani2;
    private javax.swing.JTextField stokKoduAlani2;
    private javax.swing.JTextField turAlani2;
    private javax.swing.JButton urunguncelle;
    private javax.swing.JButton urunsil;
    private javax.swing.JTable uruntablosu1;
    private javax.swing.JTextField yazarAlani2;
    // End of variables declaration//GEN-END:variables
}

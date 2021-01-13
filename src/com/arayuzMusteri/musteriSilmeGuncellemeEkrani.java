
package com.arayuzMusteri;
import com.islemler.musteri;
import com.data.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;



public class musteriSilmeGuncellemeEkrani extends javax.swing.JFrame {
    DefaultTableModel model;
    musteriIslemleri musteri=new musteriIslemleri();

    
    public musteriSilmeGuncellemeEkrani() {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        model = (DefaultTableModel) musteritablosu.getModel();
        musterigoruntule();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        adAlani2 = new javax.swing.JTextField();
        soyadAlani2 = new javax.swing.JTextField();
        mailAlani2 = new javax.swing.JTextField();
        telefonAlani2 = new javax.swing.JTextField();
        musterisil = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        musteritablosu = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        musteriguncelle = new javax.swing.JButton();
        aramaCubugu2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Müşteri İşlemleri");
        setBounds(new java.awt.Rectangle(300, 200, 0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(java.awt.SystemColor.inactiveCaption);
        jLabel2.setText("Ad:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(java.awt.SystemColor.inactiveCaption);
        jLabel3.setText("Soyad:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(java.awt.SystemColor.inactiveCaption);
        jLabel4.setText("Email:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(java.awt.SystemColor.inactiveCaption);
        jLabel5.setText("Telefon Numarası:");

        musterisil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        musterisil.setText("Müşteri Sil");
        musterisil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musterisilActionPerformed(evt);
            }
        });

        musteritablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Ad", "Soyad", "Mail", "Telefon Numarası"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        musteritablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                musteritablosuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(musteritablosu);
        if (musteritablosu.getColumnModel().getColumnCount() > 0) {
            musteritablosu.getColumnModel().getColumn(0).setResizable(false);
            musteritablosu.getColumnModel().getColumn(1).setResizable(false);
            musteritablosu.getColumnModel().getColumn(2).setResizable(false);
            musteritablosu.getColumnModel().getColumn(3).setResizable(false);
            musteritablosu.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/friends.png"))); // NOI18N

        musteriguncelle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        musteriguncelle.setText("Müşteri Güncelle");
        musteriguncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musteriguncelleActionPerformed(evt);
            }
        });

        aramaCubugu2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                aramaCubugu2KeyReleased(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search (1).png"))); // NOI18N
        jLabel7.setText("jLabel7");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))
                            .addComponent(musterisil))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(soyadAlani2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(adAlani2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mailAlani2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(telefonAlani2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(musteriguncelle))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel1)))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(aramaCubugu2, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adAlani2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soyadAlani2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mailAlani2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefonAlani2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(musterisil)
                    .addComponent(musteriguncelle))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aramaCubugu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void dinamikAra2(String ara2){
        TableRowSorter<DefaultTableModel> tr=new TableRowSorter<DefaultTableModel>(model);
        musteritablosu.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(ara2));
    }
    
    private void aramaCubugu2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aramaCubugu2KeyReleased
       String ara2=aramaCubugu2.getText();
        dinamikAra2(ara2);
    }//GEN-LAST:event_aramaCubugu2KeyReleased

    private void musteritablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_musteritablosuMouseClicked
        int selectedrow=musteritablosu.getSelectedRow();
       
       adAlani2.setText(model.getValueAt(selectedrow, 1).toString());
       soyadAlani2.setText(model.getValueAt(selectedrow, 2).toString());
       mailAlani2.setText(model.getValueAt(selectedrow, 3).toString());
       telefonAlani2.setText(model.getValueAt(selectedrow, 4).toString());
       
    }//GEN-LAST:event_musteritablosuMouseClicked

    private void musteriguncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musteriguncelleActionPerformed
        String ad=adAlani2.getText();
        String soyad=soyadAlani2.getText();
        String mail=mailAlani2.getText();
        String telefon_numarasi=telefonAlani2.getText();
        
        //seçilen satırı almak için
        int selectedrow=musteritablosu.getSelectedRow();
        
         if (selectedrow == -1) {
           if (model.getRowCount() == 0 ) {
               JOptionPane.showMessageDialog(null, "Müşteri tablosu şu anda boş...");
           }
           else {
               JOptionPane.showMessageDialog(null, "Lütfen güncellenecek bir müşteri seçin...");
           }}
             else {
           int id = (int)model.getValueAt(selectedrow,0);
           
           musteri.musteriGuncelle(id, ad ,soyad, mail, telefon_numarasi);
           
           musterigoruntule();
           
           JOptionPane.showMessageDialog(null, "Müşteri güncellendi.");
           
        adAlani2.setText("");
        soyadAlani2.setText("");
        mailAlani2.setText("");
        telefonAlani2.setText("");
       }
      

    }//GEN-LAST:event_musteriguncelleActionPerformed

    private void musterisilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musterisilActionPerformed
       
       
       int selectedrow=musteritablosu.getSelectedRow();
        
         if (selectedrow == -1) {
           if (model.getRowCount() == 0 ) {
               JOptionPane.showMessageDialog(null, "Müşteri tablosu şu anda boş...");
           }
           else {
              JOptionPane.showMessageDialog(null, "Lütfen güncellenecek bir müşteri seçin...");
           }}
         else {
           int id = (int)model.getValueAt(selectedrow,0);
           
           musteri.sil(id);
           musterigoruntule();
           
           JOptionPane.showMessageDialog(null, "Müşteri silindi.");
    }//GEN-LAST:event_musterisilActionPerformed
    }
         
     public void musterigoruntule(){
        model.setRowCount(0);
        //tabloyu sıfırlıyo hata almamak için
        
        ArrayList<musteri> musteriler = new ArrayList<musteri>();
       
        musteriler = musteri.musteriGetir();
        
        if(musteriler != null){
            
            for(musteri Musteriler: musteriler){
                Object[] eklenecek2= {Musteriler.getId(), Musteriler.getAd(), Musteriler.getSoyad(), Musteriler.getMail(), Musteriler.getTelefon_numarasi()};
                
                model.addRow(eklenecek2);
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
            java.util.logging.Logger.getLogger(musteriSilmeGuncellemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(musteriSilmeGuncellemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(musteriSilmeGuncellemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(musteriSilmeGuncellemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new musteriSilmeGuncellemeEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adAlani2;
    private javax.swing.JTextField aramaCubugu2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mailAlani2;
    private javax.swing.JButton musteriguncelle;
    private javax.swing.JButton musterisil;
    private javax.swing.JTable musteritablosu;
    private javax.swing.JTextField soyadAlani2;
    private javax.swing.JTextField telefonAlani2;
    // End of variables declaration//GEN-END:variables
}

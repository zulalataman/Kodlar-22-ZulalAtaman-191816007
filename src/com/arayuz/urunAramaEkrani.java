
package com.arayuz;
import com.islemler.urun;
import com.data.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

//inheritance kullanımı
public class urunAramaEkrani extends javax.swing.JFrame {

    DefaultTableModel model;
    urunIslemleri urun=new urunIslemleri();
    
    public urunAramaEkrani() {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        model = (DefaultTableModel) uruntablosu2.getModel();
        urungoruntule();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        uruntablosu2 = new javax.swing.JTable();
        aramaCubugu1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ürün İşlemleri");
        setBackground(java.awt.SystemColor.inactiveCaption);
        setBounds(new java.awt.Rectangle(300, 100, 0, 0));

        jPanel1.setBackground(java.awt.SystemColor.inactiveCaption);
        jPanel1.setForeground(java.awt.SystemColor.inactiveCaption);

        uruntablosu2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        uruntablosu2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Stok Kodu", "Kitap Adı", "Yazar", "Adet", "Fiyat", "Tür"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(uruntablosu2);
        if (uruntablosu2.getColumnModel().getColumnCount() > 0) {
            uruntablosu2.getColumnModel().getColumn(0).setResizable(false);
            uruntablosu2.getColumnModel().getColumn(1).setResizable(false);
            uruntablosu2.getColumnModel().getColumn(2).setResizable(false);
            uruntablosu2.getColumnModel().getColumn(3).setResizable(false);
            uruntablosu2.getColumnModel().getColumn(4).setResizable(false);
            uruntablosu2.getColumnModel().getColumn(5).setResizable(false);
            uruntablosu2.getColumnModel().getColumn(6).setResizable(false);
        }

        aramaCubugu1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        aramaCubugu1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                aramaCubugu1KeyReleased(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/magnifier.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 992, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(aramaCubugu1, javax.swing.GroupLayout.PREFERRED_SIZE, 899, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(aramaCubugu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void dinamikAra(String ara){
        TableRowSorter<DefaultTableModel> tr=new TableRowSorter<DefaultTableModel>(model);
        uruntablosu2.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(ara));
    }
    private void aramaCubugu1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aramaCubugu1KeyReleased
        
        String ara=aramaCubugu1.getText();
        dinamikAra(ara);
        
    }//GEN-LAST:event_aramaCubugu1KeyReleased

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
            java.util.logging.Logger.getLogger(urunAramaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(urunAramaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(urunAramaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(urunAramaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new urunAramaEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aramaCubugu1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable uruntablosu2;
    // End of variables declaration//GEN-END:variables
}

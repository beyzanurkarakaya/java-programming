/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CENG102_PROJE_2019_OTEL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

/**
 *
 * @author beyza
 */
public class RezervasyonEkle extends javax.swing.JFrame {

    String connectionString = "jdbc:sqlserver://127.0.0.1; databaseName=OTEL_Proje_2019";
    Item[] oda;
    /**
     * Creates new form RezervasyonEkle
     */
    public RezervasyonEkle() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rezervasyonOnayla = new javax.swing.JPanel();
        odaAdi = new javax.swing.JLabel();
        musTc = new javax.swing.JLabel();
        kalacakY = new javax.swing.JLabel();
        kalacakC = new javax.swing.JLabel();
        girisT = new javax.swing.JLabel();
        cikisT = new javax.swing.JLabel();
        kalınacakGun = new javax.swing.JLabel();
        rezOnayla = new javax.swing.JButton();
        textMusTc = new javax.swing.JTextField();
        textKalanY = new javax.swing.JTextField();
        textKalanC = new javax.swing.JTextField();
        textGirisT = new javax.swing.JTextField();
        textCikisT = new javax.swing.JTextField();
        textGun = new javax.swing.JTextField();
        tutarHesaplaButonu = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        rezTuruUyari = new javax.swing.JTextArea();
        rezTuru = new javax.swing.JLabel();
        odaCombo = new javax.swing.JComboBox<>();
        tutar = new javax.swing.JFormattedTextField();
        textRezTuru = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        rezervasyonOnayla.setBackground(new java.awt.Color(255, 255, 204));

        odaAdi.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        odaAdi.setText("Oda Tipi:");

        musTc.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        musTc.setText("Müşteri TC:");

        kalacakY.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        kalacakY.setText("Kalacak Yetişkin Sayısı:");

        kalacakC.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        kalacakC.setText("Kalacak Çocuk Sayısı:");

        girisT.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        girisT.setText("Giriş Tarihi:");

        cikisT.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        cikisT.setText("Çıkış Tarihi:");

        kalınacakGun.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        kalınacakGun.setText("Kalınacak Gün Sayısı:");

        rezOnayla.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        rezOnayla.setForeground(new java.awt.Color(102, 0, 102));
        rezOnayla.setText("REZERVASYONU ONAYLA");
        rezOnayla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rezOnaylaActionPerformed(evt);
            }
        });

        tutarHesaplaButonu.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        tutarHesaplaButonu.setForeground(new java.awt.Color(102, 0, 102));
        tutarHesaplaButonu.setText("Toplam Tutarı Hesapla:");
        tutarHesaplaButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tutarHesaplaButonuActionPerformed(evt);
            }
        });

        rezTuruUyari.setColumns(20);
        rezTuruUyari.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        rezTuruUyari.setRows(5);
        rezTuruUyari.setText("REZERVASYON TÜRÜ TABLOSU\n\n(Ücretlendirmeler Kişi Başınadır)\n\n1 - Sadece Oda: Oda Fiyatı\n2 - Yarım Pansiyon: +15\n3 - Tam Pansiyon: +30\n4 - Her Şey Dahil: +50");
        jScrollPane2.setViewportView(rezTuruUyari);

        rezTuru.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        rezTuru.setText("Rezervasyon Türü:");

        tutar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat(""))));

        javax.swing.GroupLayout rezervasyonOnaylaLayout = new javax.swing.GroupLayout(rezervasyonOnayla);
        rezervasyonOnayla.setLayout(rezervasyonOnaylaLayout);
        rezervasyonOnaylaLayout.setHorizontalGroup(
            rezervasyonOnaylaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rezervasyonOnaylaLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(rezervasyonOnaylaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rezervasyonOnaylaLayout.createSequentialGroup()
                        .addGroup(rezervasyonOnaylaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(rezervasyonOnaylaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(rezTuru, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(girisT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                .addComponent(cikisT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                .addComponent(kalınacakGun, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                            .addComponent(kalacakC, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(rezervasyonOnaylaLayout.createSequentialGroup()
                        .addGroup(rezervasyonOnaylaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(rezervasyonOnaylaLayout.createSequentialGroup()
                                .addGroup(rezervasyonOnaylaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(musTc, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(odaAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(rezervasyonOnaylaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(odaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textMusTc, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(rezervasyonOnaylaLayout.createSequentialGroup()
                                .addComponent(kalacakY, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(rezervasyonOnaylaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textKalanC, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textKalanY, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textGirisT, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textCikisT, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textGun, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textRezTuru, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 31, Short.MAX_VALUE)))
                .addGroup(rezervasyonOnaylaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rezervasyonOnaylaLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))
                    .addGroup(rezervasyonOnaylaLayout.createSequentialGroup()
                        .addGroup(rezervasyonOnaylaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rezOnayla)
                            .addGroup(rezervasyonOnaylaLayout.createSequentialGroup()
                                .addComponent(tutarHesaplaButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tutar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(97, 97, 97))))
        );
        rezervasyonOnaylaLayout.setVerticalGroup(
            rezervasyonOnaylaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rezervasyonOnaylaLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(rezervasyonOnaylaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rezervasyonOnaylaLayout.createSequentialGroup()
                        .addGroup(rezervasyonOnaylaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(odaAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(odaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(rezervasyonOnaylaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(musTc, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textMusTc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(rezervasyonOnaylaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kalacakY, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textKalanY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(rezervasyonOnaylaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kalacakC, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textKalanC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(rezervasyonOnaylaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(girisT, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textGirisT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(rezervasyonOnaylaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cikisT, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textCikisT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rezervasyonOnaylaLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(rezervasyonOnaylaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tutarHesaplaButonu)
                            .addComponent(tutar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)))
                .addGroup(rezervasyonOnaylaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rezervasyonOnaylaLayout.createSequentialGroup()
                        .addGroup(rezervasyonOnaylaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kalınacakGun, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textGun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(rezervasyonOnaylaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rezTuru, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textRezTuru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(154, 154, 154))
                    .addGroup(rezervasyonOnaylaLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(rezOnayla, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rezervasyonOnayla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rezervasyonOnayla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Rezervasyon onayla butonuna basınca bilgi kaydetme metodunu çağıtıyor
    private void rezOnaylaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rezOnaylaActionPerformed
        // TODO add your handling code here:
        rezervasyonKaydet();
    }//GEN-LAST:event_rezOnaylaActionPerformed

    // Girilen bilgileri veritabanında musteriKayit tablosuna kaydediyor
    private void rezervasyonKaydet()
    {
        // TODO add your handling code here:
        Item item = (Item) odaCombo.getSelectedItem();
        int odaID = item.getId();
        String musteriTC = (String) textMusTc.getText();
        int yetiskin= Integer.parseInt(textKalanY.getText());
        int cocuk = Integer.parseInt(textKalanC.getText());
        String giris = (String) textGirisT.getText();
        String cikis = (String) textCikisT.getText();
        int gun = Integer.parseInt(textGun.getText());
                
        String query = String.format("INSERT INTO tblMusteriKayit VALUES(%d,'%s',%d,%d,'%s','%s',%d)", odaID, musteriTC, yetiskin, cocuk, giris, cikis, gun);
        System.out.println(""+query);
        try {
            DBHandler dbh = new DBHandler(connectionString,"beyza","bnk");
            ResultSet rs = dbh.executeQuery(query);
            dbh.close();
        } catch (SQLException ex) {
            //java.util.logging.Logger.getLogger(AdminSayfasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        odaDoldur();
    }//GEN-LAST:event_formWindowOpened

    // Girilen bilgilere göre toplam tutarı hesaplayıp formattedText kutucuğuna yazdırıyor
    private void tutarHesaplaButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tutarHesaplaButonuActionPerformed
        // TODO add your handling code here:
        
        // ComboBoxtan odaID'yi almak için yazdık
        Item item = (Item) odaCombo.getSelectedItem();
        int odaID = item.getId();
        System.out.println("Oda ID: "+odaID);
        int yetiskin = Integer.parseInt(textKalanY.getText());
        int cocuk = Integer.parseInt(textKalanC.getText());
        int gun = Integer.parseInt(textGun.getText());
        int toplamTutar = 0;
        int tutarYetiskin = 0;
        int tutarCocuk = 0;
        if(odaID > 100 && odaID < 111)
        {
            tutarYetiskin = gun*yetiskin*100;
            tutarCocuk = gun*cocuk*50;
            toplamTutar = tutarYetiskin + tutarCocuk;
        }
        else if(odaID > 200 && odaID < 211)
        {
            tutarYetiskin = gun*yetiskin*150;
            tutarCocuk = gun*cocuk*75;
            toplamTutar = tutarYetiskin + tutarCocuk;
        }
        else if(odaID > 300 && odaID < 308)
        {
            tutarYetiskin = gun*yetiskin*300;
            tutarCocuk = gun*cocuk*150;
            toplamTutar = tutarYetiskin + tutarCocuk;
        }
        else if(odaID > 400 && odaID < 403)
        {
            tutarYetiskin = gun*yetiskin*500;
            tutarCocuk = gun*cocuk*0;
            toplamTutar = tutarYetiskin + tutarCocuk;
        }
        else if(odaID > 500 && odaID < 502)
        {
            tutarYetiskin = gun*yetiskin*1000;
            tutarCocuk = gun*cocuk*500;
            toplamTutar = tutarYetiskin + tutarCocuk;
        }
        
        int tur = Integer.parseInt(textRezTuru.getText());
        System.out.println("Rezervasyon Türü: "+tur);
        if(tur == 1)
        {
            //tutar.setColumns(toplamTutar);
            tutar.setValue(new Integer(toplamTutar));
        }
        else if(tur == 2)
        {
            int top = yetiskin + cocuk;
            int araToplam = top*15;
            toplamTutar = toplamTutar + araToplam;
            //tutar.setColumns(toplamTutar);
            tutar.setValue(new Integer(toplamTutar));
        }
        else if(tur == 3)
        {
            int top = yetiskin + cocuk;
            int araToplam = top*30;
            toplamTutar = toplamTutar + araToplam;
            //tutar.setColumns(toplamTutar);
            tutar.setValue(new Integer(toplamTutar));
        }
        else if(tur == 4)
        {
            int top = yetiskin + cocuk;
            int araToplam = top*50;
            toplamTutar = toplamTutar + araToplam;
            //tutar.setColumns(toplamTutar);
            tutar.setValue(new Integer(toplamTutar));
        }
    }//GEN-LAST:event_tutarHesaplaButonuActionPerformed

    // Boş olan odaları müşterinin seçebilmesi için ComboBoxa dolduruyor
    public void odaDoldur()
    {
        DBHandler dbh = null;
        try
        {
        String query = "SELECT odaId, odaAd FROM tblOda WHERE odaID not in (SELECT odaID FROM tblMusteriKayit)";
        System.out.println(""+query);
        
        dbh = new DBHandler(connectionString,"beyza","bnk");
        ResultSet rs = dbh.executeQuery(query);
        int count=0;
        Vector model = new Vector();
        while(rs.next()){
            model.addElement(rs.getString(1)+" "+rs.getString(2));
            count++;
        }
        odaCombo.setModel(new DefaultComboBoxModel(model));
        if (dbh != null)
        {
            dbh.close();
        }
        }catch (SQLException ex)
        {
            System.out.println("catccath"+ex.getMessage());
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex)
        }
    }
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(RezervasyonEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RezervasyonEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RezervasyonEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RezervasyonEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RezervasyonEkle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cikisT;
    private javax.swing.JLabel girisT;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel kalacakC;
    private javax.swing.JLabel kalacakY;
    private javax.swing.JLabel kalınacakGun;
    private javax.swing.JLabel musTc;
    private javax.swing.JLabel odaAdi;
    private javax.swing.JComboBox<String> odaCombo;
    private javax.swing.JButton rezOnayla;
    private javax.swing.JLabel rezTuru;
    private javax.swing.JTextArea rezTuruUyari;
    private javax.swing.JPanel rezervasyonOnayla;
    private javax.swing.JTextField textCikisT;
    private javax.swing.JTextField textGirisT;
    private javax.swing.JTextField textGun;
    private javax.swing.JTextField textKalanC;
    private javax.swing.JTextField textKalanY;
    private javax.swing.JTextField textMusTc;
    private javax.swing.JTextField textRezTuru;
    private javax.swing.JFormattedTextField tutar;
    private javax.swing.JButton tutarHesaplaButonu;
    // End of variables declaration//GEN-END:variables
}

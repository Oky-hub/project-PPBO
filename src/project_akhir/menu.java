/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_akhir;

import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public menu() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnPegawai = new javax.swing.JButton();
        btnJadwal = new javax.swing.JButton();
        btnPenumpang = new javax.swing.JButton();
        btnPemesanan = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        txtKendaraan = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(350, 230));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(164, 164, 164));
        jPanel1.setPreferredSize(new java.awt.Dimension(750, 420));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/Logo-2.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(460, 30, 200, 210);

        btnPegawai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/icons8-name-tag-100.png"))); // NOI18N
        btnPegawai.setText("Pegawai Supir JST");
        btnPegawai.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnPegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPegawaiActionPerformed(evt);
            }
        });
        jPanel1.add(btnPegawai);
        btnPegawai.setBounds(610, 250, 260, 110);

        btnJadwal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/icons8-schedule-100.png"))); // NOI18N
        btnJadwal.setText("Jadwal Keberangkatan");
        btnJadwal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnJadwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJadwalActionPerformed(evt);
            }
        });
        jPanel1.add(btnJadwal);
        btnJadwal.setBounds(420, 380, 300, 110);

        btnPenumpang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/icons8-passenger-100.png"))); // NOI18N
        btnPenumpang.setText("Penumpang");
        btnPenumpang.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnPenumpang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPenumpangActionPerformed(evt);
            }
        });
        jPanel1.add(btnPenumpang);
        btnPenumpang.setBounds(800, 380, 270, 110);

        btnPemesanan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/icons8-new-ticket-160 (1).png"))); // NOI18N
        btnPemesanan.setText("Pemesanan Tiket");
        btnPemesanan.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnPemesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPemesananActionPerformed(evt);
            }
        });
        jPanel1.add(btnPemesanan);
        btnPemesanan.setBounds(260, 250, 250, 110);

        btnLogOut.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnLogOut.setForeground(new java.awt.Color(255, 0, 0));
        btnLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/close_delete.png"))); // NOI18N
        btnLogOut.setText("Tutup");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogOut);
        btnLogOut.setBounds(510, 530, 130, 50);

        txtKendaraan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/icons8-car-100.png"))); // NOI18N
        txtKendaraan.setText("Data Kendaraan");
        txtKendaraan.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtKendaraan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKendaraanActionPerformed(evt);
            }
        });
        jPanel1.add(txtKendaraan);
        txtKendaraan.setBounds(80, 380, 240, 110);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/innova r.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 10, 1150, 610);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnJadwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJadwalActionPerformed
        // TODO add your handling code here:
        new jadwal().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnJadwalActionPerformed

    private void txtKendaraanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKendaraanActionPerformed
        // TODO add your handling code here:
        new kendaraan().setVisible(true);
        dispose();
    }//GEN-LAST:event_txtKendaraanActionPerformed

    private void btnPemesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPemesananActionPerformed
        // TODO add your handling code here:
        new pemesanan().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnPemesananActionPerformed

    private void btnPegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPegawaiActionPerformed
        // TODO add your handling code here:
        new pegawai().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnPegawaiActionPerformed

    private void btnPenumpangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPenumpangActionPerformed
        // TODO add your handling code here:
        new penumpang().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnPenumpangActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(null, "Yakin Keluar aplikasi???",
            "Yakin", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
        this.dispose();
        }
    }//GEN-LAST:event_btnLogOutActionPerformed

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJadwal;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnPegawai;
    private javax.swing.JButton btnPemesanan;
    private javax.swing.JButton btnPenumpang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton txtKendaraan;
    // End of variables declaration//GEN-END:variables
}